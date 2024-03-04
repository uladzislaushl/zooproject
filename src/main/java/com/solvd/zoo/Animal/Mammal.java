package com.solvd.zoo.Animal;

import com.solvd.zoo.Exposition.Exposition;

public class Mammal extends Animal {

        private String fur;

        private String eyes;

        public Mammal(int animalId, String name, int age, String fur, String eyes){
            super(animalId, name, age);
            this.fur = fur;
            this.eyes = eyes;
        }

    @Override
    public void displayInfo() {
        System.out.println("Animal ID: " + getAnimalId());
        System.out.println("Name: " + getAnimalId());
        System.out.println("Age: " + getAge());
        System.out.println("Fur: " + getFur());
        System.out.println("Eyes: " + getEyes());
    }

        public String getFur() {
            return fur;
        }

        public void setFur(String fur) {
            this.fur = fur;
        }

        public String getEyes() {
            return eyes;
        }

        public void setEyes(String eyes) {
            this.eyes = eyes;
        }

        @Override
        public void sayHi(){
            System.out.println("Woo-woo");
        }

        @Override
        public void sayBye(){
            System.out.println("Shaking tail");
        }

        @Override
        public void Dance(){
            System.out.println("Standing on 2 paws");
        }

        @Override
        public void Wonder(){
            System.out.println("Hissing");
        }

        @Override
        public void makeSound() {
            System.out.println("Roaring");
        }
    }

