package com.company;

import java.util.List;
import java.util.Random;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dispenser {
    Printer printer = new Printer();

    private int money ;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    Product water = new Product("Вода",25);
    Product candy = new Product("Конфета",30);
    Product banana = new Product("Бананочипсы",100);
    Scanner sc = new Scanner(System.in);

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
        result.forEach((k,v) -> System.out.printf("[%s] - %s\n",v, k.getName()));
    }
    public void putMoney() {

        int money = sc.nextInt();

        if (money < 25) {
            System.out.println("Не хвотает денег :");
            printer.userMenu();
        }
    }

    public void userAction(List<Product> products) {
        String userAction = sc.nextLine().toLowerCase();
        switch (userAction) {
            case "a":
                printer.putMoney();
                break;
            case "w":
                products.remove(water);
                break;
            case "c":
                products.remove(candy);
                break;
            case "b":
                products.remove(banana);
                break;

        }

    }
        public void money () {
            printer.putMoney();
            int mone = sc.nextInt();
            setMoney(getMoney() + mone);
            System.out.println("Монет на сумму :" + getMoney());
        }

}





