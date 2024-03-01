package com.solvd.zoo.Exposition;

import com.solvd.zoo.Animal.Reptile;

import java.util.ArrayList;
import java.util.List;

public class Terrarium extends Exposition {

    private String plant;
    private int accents;

    private List<Reptile> reptileList = new ArrayList<>();

    public Terrarium(int expId, String name, int area, String plant, int accents){
        super(expId, name, area);
        this.plant = plant;
        this.accents = accents;
    }

    public Terrarium(){
        reptileList = new ArrayList<>();
    }

    public void addReptile(Reptile reptile){
        reptileList.add(reptile);
    }

    @Override
    public void displayInfo() {
        System.out.println("Exposition ID: " + getExpId());
        System.out.println("Name of the terrarium: " + getName());
        System.out.println("Area of the terrarium: " + getArea());
        System.out.println("Type of the plants: " + getPlant());
        System.out.println("Number of accents: " + getAccents());
        System.out.println("Number of exhibits: " + getReptileList());
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public int getAccents() {
        return accents;
    }

    public void setAccents(int accents) {
        this.accents = accents;
    }

    public List<Reptile> getReptileList() {
        return reptileList;
    }
}

