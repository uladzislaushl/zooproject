package com.solvd.zoo.Exposition;

import com.solvd.zoo.Animal.Insect;
import java.util.ArrayList;
import java.util.List;

public class Insectarium extends Exposition {

    private int box;
    private String habitat;

    private List<Insect> insectList = new ArrayList<>();

    public Insectarium(int expId, String name, int area, int box, String habitat){
        super(expId, name, area);
        this.box = box;
        this.habitat = habitat;
    }

    public void addInsect(Insect insect){
        insectList.add(insect);
    }

    @Override
    public void displayInfo() {
        System.out.println("Exposition ID: " + getExpId());
        System.out.println("Name of the insectarium: " + getName());
        System.out.println("Area of the insectarium: " + getArea());
        System.out.println("Number of boxes: " + getBox());
        System.out.println("Type of habitat: " + getHabitat());
        System.out.println("Number of exhibits: " + getInsectList() );
    }

    public int getBox() {
        return box;
    }

    public void setBox(int box) {
        this.box = box;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public List<Insect> getInsectList() {
        return insectList;
    }
}


