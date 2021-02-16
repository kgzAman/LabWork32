package com.company;

import java.util.ArrayList;
import java.util.List;

public class Simulation {

    public void simulation(){
        Dispenser dispenser = new Dispenser();
        Printer printer = new Printer();
        List<Product> products = new ArrayList<>(100);

        dispenser.fillDispenser(products);
        printer.PrintDispeser();
        dispenser.amount(products);
        dispenser.money();
        printer.userMenu();
        dispenser.userAction(products);
        dispenser.amount(products);



    }

}
