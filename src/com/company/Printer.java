package com.company;

import java.util.Scanner;

public class Printer {
    Scanner sc = new Scanner(System.in);

    public void PrintDispeser() {
        System.out.println("В автомате доступны: ");

    }

    public String userMenu() {
        System.out.println("");
        System.out.println("a - закинуть еще монет ");
        System.out.println("w - купить 'Вода'");
        System.out.println("с - купить 'конфета'");
        System.out.println("q - выйти\n>>?");
        String ac = sc.nextLine();
        return ac;
    }
    public void   putMoney(){
        System.out.println("Положите денги :");
    }



}
