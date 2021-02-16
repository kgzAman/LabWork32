package com.company;

import java.util.List;
import java.util.Random;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Dispenser {
    private Product pr;
    Product water = new Product("Вода",25);
    Product candy = new Product("Конфета",30);
    Product banana = new Product("Бананочипсы",100);

    public List<Product> fillDispenser(List<Product> products) {
        Random rnd = new Random();
        while (products.size() != 100) {
        int random = rnd.nextInt(3)+1 ;
            if (random == 1) products.add(water);
            else if (random == 2) products.add(candy);
            else {
                products.add(banana);
            }
        }
        return products;
    }

    public void amount(List<Product> products){

        Map<Product, Long> result =
                products.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(result);
        result.forEach((k,v) -> System.out.printf("[%s] - %s\n",v, k.getName()));
    }

}



