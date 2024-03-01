package com.solvd.zoo.Exposition;

import com.solvd.zoo.Animal.Animal;


public abstract class Exposition {

    private int expId;
    private String name;
    private int area;

    public Exposition(){

    }

    public Exposition(int expId, String name, int area){
        this.expId = expId;
        this.name = name;
        this.area = area;
    }

    public int getExpId() {
        return expId;
    }

    public void setExpId(int expId) {
        this.expId = expId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public abstract void displayInfo();
}
