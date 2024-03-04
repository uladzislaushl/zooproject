package com.solvd.zoo;

import com.solvd.zoo.Animal.Insect;
import com.solvd.zoo.Animal.Mammal;
import com.solvd.zoo.Animal.Reptile;
import com.solvd.zoo.Exposition.Corral;
import com.solvd.zoo.Exposition.Insectarium;
import com.solvd.zoo.Exposition.Merchandise;
import com.solvd.zoo.Exposition.Terrarium;
import com.solvd.zoo.User.Visitor;

import java.util.Scanner;



public class Main {
    public static void main(String args[]) {
        //Visitor creation
//        Visitor visitortest = new Visitor();
//        Scanner scannervisitor = new Scanner(System.in);
//
//        askPayment(visitortest, scannervisitor);
//        scannervisitor.close();

        //Animal creation
        Mammal lion = new Mammal(17, "Leo", 12, "yellow", "green");
        Mammal monkey = new Mammal(12, "Joe", 6, "brown", "black");
        Mammal tiger = new Mammal(18, "Time", 10, "orange with black stripes", "grey");

        Insect roach = new Insect(25, "Papa", 2, "serrate", "hard brown");
        Insect spider = new Insect(88, "Bait", 4, "moniliform", "soft black");
        Insect scorpion = new Insect(89, "Slark", 2, "claws", "armored black");

        Reptile crocodile = new Reptile(90, "Gena", 9, "green armor", "long sharp");
        Reptile frog = new Reptile(1, "Chub", 3, "stinky pimply", "little dark");
        Reptile lizard = new Reptile(91, "Lizzy", 8, "soft yellow", "medium grey");

        //Exposition creation
        Corral feline = new Corral(1, "Roaring Place", 150, "stainless steel", 2);
        Corral monkeyhouse = new Corral(2, "Funky Monkey", 200, "wooden blocks", 0);

        Insectarium insectarium = new Insectarium(3, "Scary Place", 15, 5, "sand boxes");

        Terrarium bathtoob = new Terrarium(4, "Stinky Water", 60, "water lily", 33);

        Merchandise tshirt = new Merchandise("T-shirt", 13.99);
        tshirt.addTag("red");
        tshirt.addTag("clothing");

        Merchandise figure = new Merchandise("Monkey figure", 20.99);
        figure.addTag("plastic");
        figure.addTag("toys");

        Visitor visitor = new Visitor("Olga", 50);

        feline.addMammal(lion);
        feline.addMammal(tiger);
        monkeyhouse.addMammal(monkey);

        insectarium.addInsect(roach);
        insectarium.addInsect(scorpion);
        insectarium.addInsect(spider);

        bathtoob.addReptile(crocodile);
        bathtoob.addReptile(frog);
        bathtoob.addReptile(lizard);

        Scanner scanner = new Scanner(System.in);

        int choice;

        while (true) {
            System.out.println("You are in the Zoo. Where do you want to go? 0 - Whole Zoo animals list, 1 - Exposition, 2 - Animals, 3 - Merch:");
            choice = scanner.nextInt();

            if (choice == 0){
                System.out.println("Insectarium animals:");
                for (Insect insect : insectarium.getInsectList()) {
                    System.out.println(insect.getName());
                }

                System.out.println("Feline animals:");
                for (Mammal mammal : feline.getMammalList()) {
                    System.out.println(mammal.getName());
                }

                System.out.println("Monkeyhouse animals:");
                for (Mammal mammal : monkeyhouse.getMammalList()) {
                    System.out.println(mammal.getName());
                }

                System.out.println("Bathtoob animals:");
                for (Reptile reptile : bathtoob.getReptileList()) {
                    System.out.println(reptile.getName());
                }

            } else if (choice == 1) {
                System.out.println("You are in the Exposition. What do you want to see?");
                System.out.println("1 - Feline");
                System.out.println("2 - Monkeyhouse");
                System.out.println("3 - Insectarium");
                System.out.println("4 - Bathtoob");
                choice = scanner.nextInt();

                if (choice == 1) {
                   feline.displayInfo();
                } else if (choice == 2) {
                    monkeyhouse.displayInfo();
                } else if (choice == 3) {
                    insectarium.displayInfo();
                } else if (choice == 4) {
                    bathtoob.displayInfo();
                }

            } else if (choice == 2) {
                System.out.println("You are at the animals. What do you want to see? 1 - Mammal, 2 - Insect, 3 - Reptile");
                choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("What mammal do you want to see? 1 - Lion, 2 - Monkey, 3 - Tiger");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            lion.displayInfo();
                            System.out.println("Lion greets:");
                            lion.makeSound();
                            System.out.println("Lion ogles: ");
                            lion.Wonder();
                            break;
                        case 2:
                            monkey.displayInfo();
                            System.out.println("Monkey greets: ");
                            monkey.sayHi();
                            System.out.println("Monkey saying goodbye: ");
                            monkey.sayBye();
                            break;
                        case 3:
                            tiger.displayInfo();
                            System.out.println("Tiger makes sound: ");
                            tiger.makeSound();
                            break;
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                } else if (choice == 2) {
                    System.out.println("What insect do you want to see? 1 - Roach, 2 - Spider, 3 - Scorpion");
                    choice = scanner.nextInt();

                    switch (choice){
                        case 1:
                            roach.displayInfo();
                            break;
                        case 2:
                            spider.displayInfo();
                            break;
                        case 3:
                            scorpion.displayInfo();
                            break;
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                } else if (choice == 3) {
                    System.out.println("What reptile do you want to see? 1 - Crocodile, 2 - Frog, 3 - Lizard");
                    choice = scanner.nextInt();

                    switch (choice){
                        case 1:
                            crocodile.displayInfo();
                            break;
                        case 2:
                            frog.displayInfo();
                            break;
                        case 3:
                            lizard.displayInfo();
                            break;
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                }

            } else if (choice == 3) {
                System.out.println("You are at the merchandise.");
                tshirt.displayInfo();
                System.out.println();
                figure.displayInfo();
                System.out.println();
                visitor.pay(tshirt);
                System.out.println();
                visitor.pay(figure);
            } else {
                System.out.println("Invalid input.");
            }
            System.out.println();
            System.out.println("Want to continue? 1 - Continue, anything else - stop:");
            choice = scanner.nextInt();
            if (choice != 1) {
                break;
            }
        }
        scanner.close();
    }
}
