package com.solvd.zoo.Animal;

import com.solvd.zoo.Exposition.Exposition;

public class Insect extends Animal {
    private String antenna;

    private String abdomen;

    public Insect(int animalId, String name, int age, String antenna, String abdomen){
        super(animalId, name, age);
        this.antenna = antenna;
        this.abdomen = abdomen;
    }

    public String getAntenna() {
        return antenna;
    }

    public void setAntenna(String antenna) {
        this.antenna = antenna;
    }

    public String getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen;
    }

    @Override
    public void sayHi(){
        System.out.println("Zit-zit-zit");
    }

    @Override
    public void sayBye(){
        System.out.println("Shaking antennas");
    }

    @Override
    public void Dance(){
        System.out.println("Twisting antennas");
    }

    @Override
    public void Wonder(){
        System.out.println("Waving antennas");
    }

    @Override
    public void makeSound() {
        System.out.println("Bzz-bzz-bzz");
    }
}
