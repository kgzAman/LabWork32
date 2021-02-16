package com.company;

import java.util.ArrayList;
import java.util.List;

public class Simulation {

    public void simulation(){
        Dispenser dispenser = new Dispenser();
        List<Product> products = new ArrayList<>(100);

        dispenser.fillDispenser(products);

        dispenser.amount(products);

    }

}
