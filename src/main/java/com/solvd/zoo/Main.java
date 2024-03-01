package com.solvd.zoo;

import com.solvd.zoo.Animal.Insect;
import com.solvd.zoo.Animal.Mammal;
import com.solvd.zoo.Animal.Reptile;
import com.solvd.zoo.Exposition.Corral;
import com.solvd.zoo.Exposition.Insectarium;
import com.solvd.zoo.Exposition.Terrarium;
import com.solvd.zoo.User.Visitor;

import java.util.Scanner;

import static com.solvd.zoo.User.Visitor.askPayment;


public class Main {
    public static void main(String args[]) {
        //Visitor creation
        Visitor visitortest = new Visitor();
        Scanner scannervisitor = new Scanner(System.in);

        askPayment(visitortest, scannervisitor);
        scannervisitor.close();

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

        feline.addMammal(lion);
        feline.addMammal(tiger);
        monkeyhouse.addMammal(monkey);

        insectarium.addInsect(roach);
        insectarium.addInsect(scorpion);
        insectarium.addInsect(spider);

        bathtoob.addReptile(crocodile);
        bathtoob.addReptile(frog);
        bathtoob.addReptile(lizard);

        Scanner scannerchecker = new Scanner(System.in);
        int inputcheck;

        do {
            System.out.println("What do you want to check? 1 - Exposition, 2 - Animals");
            inputcheck = scannerchecker.nextInt();

            if (inputcheck == 1) {
                Scanner expositionscanner = new Scanner(System.in);
                System.out.println("What exposition do you want to check? 1 - Feline, 2 - Monkeyhouse, 3 - Insectarium, 4 - Bathtoob");
            } else if (inputcheck == 2) {
                Scanner animalscanner = new Scanner(System.in);
                System.out.println("What animal do you want to visit? 1 - Lion, 2 - Monkey, 3 - Tiger, 4 - Roach, 5 - Spider, 6 - Scorpion, 7 - Crocodile, 8 - Frog, 9 - Lizard");
            } else {
                System.out.println("Invalid input");
            }
        } while (true);










//        System.out.println("Insectarium animals:");
//        for (Insect insect : insectarium.getInsectList()) {
//            System.out.println("Animal ID: " + insect.getAnimalId() + " " + "Animal name: " + insect.getName());
//        }
//
//        System.out.println("Feline animals:");
//        for (Mammal mammal : feline.getMammalList()) {
//            System.out.println("Animal ID: " + mammal.getAnimalId() + " " + "Animal name: " + mammal.getName());
//        }
//
//        System.out.println("Monkeyhouse animals:");
//        for (Mammal mammal : monkeyhouse.getMammalList()) {
//            System.out.println("Animal ID: " + mammal.getAnimalId() + " " + "Animal name: " + mammal.getName());
//        }
//
//        System.out.println("Bathtoob animals:");
//        for (Reptile reptile : bathtoob.getReptileList()) {
//            System.out.println("Animal ID: " + reptile.getAnimalId() + " " + "Animal name: " + reptile.getName());
//        }

    }
}
