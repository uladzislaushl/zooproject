package com.solvd.zoo.Animal;


public class Reptile extends Animal {

    private String skin;

    private String tail;

    public Reptile(int animalId, String name, int age, String skin, String tail){
        super(animalId, name, age);
        this.tail = tail;
        this.skin = skin;
    }

    @Override
    public void displayInfo() {
        System.out.println("Animal ID: " + getAnimalId());
        System.out.println("Name: " + getAnimalId());
        System.out.println("Age: " + getAge());
        System.out.println("Skin: " + getSkin());
        System.out.println("Tail: " + getSkin());
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    @Override
    public void sayHi(){
        System.out.println("Tss-tss-tss");
    }

    @Override
    public void sayBye(){
        System.out.println("Waving tail");
    }

    @Override
    public void Dance(){
        System.out.println("Jiggling tail");
    }

    @Override
    public void Wonder(){
        System.out.println("Running away");
    }

    @Override
    public void makeSound() {
        System.out.println("Clacking");
    }
}

