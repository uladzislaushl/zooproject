package com.solvd.zoo.User;

import com.solvd.zoo.Exposition.Merchandise;

public class Visitor implements Paying {
    private String name;
    private double money;

    public Visitor(String name, double money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public void pay(Merchandise merchandise) {
        if (money >= merchandise.getPrice()) {
            System.out.println(name + " buys " + merchandise.getName() + " for " + merchandise.getPrice());
            money -= merchandise.getPrice();
        } else {
            System.out.println(name + " cannot buy " + merchandise.getName());
        }
    }

    public void displayInfo() {
        System.out.println("Visitor: " + name);
        System.out.println("Money: " + money);
    }
}

