package com.company;

import java.util.Scanner;

public class Pinter {

    public void PrintDispeser(){
        System.out.println("В автомате доступны: ");

    }
    public String userAction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("a - закинуть еще монет ");
        System.out.println("w - купить 'Вода'");
        System.out.println("с - купить 'конфета'");
        System.out.println("q - выйти\n >?");
        String action = sc.nextLine();

        switch (action){
            case "a" :
        }
    }
}
