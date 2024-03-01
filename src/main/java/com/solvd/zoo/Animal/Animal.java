package com.solvd.zoo.Animal;

import com.solvd.zoo.Exposition.Exposition;

public abstract class Animal implements IGreet, IOgle, ISound {

    private int animalId;
    private String name;
    private int age;

    public Animal(){
    }

    public Animal(int animalId, String name, int age){
        this.animalId = animalId;
        this.name = name;
        this.age = age;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void sayHi() {
    }

    @Override
    public void sayBye() {
    }

    @Override
    public void Dance() {
    }

    @Override
    public void makeSound() {
    }

    @Override
    public void Wonder() {
    }
}

