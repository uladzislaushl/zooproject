package com.solvd.zoo.User;

import java.util.Scanner;

public class Visitor implements Paying {

    public static void askPayment(Visitor visitor, Scanner scannervisitor) {
        System.out.print("Do you have a ticket? 1 - yes, 2 - no: ");
        String input = scannervisitor.nextLine();

        if (input.equals("1")) {
            visitor.pay();
        } else if (input.equals("2")) {
            System.out.println("You don't have a ticket, goodbye!");
        } else {
            System.out.println("Invalid input, try again.");
            askPayment(visitor, scannervisitor);
        }
    }

    private boolean hasPaid;

    public Visitor(){
        this.hasPaid = false;
    }

    @Override
    public void pay() {
        hasPaid = true;
        System.out.println();
    }

    public boolean hasPaid() {
        return hasPaid;
    }
}
