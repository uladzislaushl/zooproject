package com.solvd.zoo.Exposition;

import com.solvd.zoo.Animal.Mammal;

import java.util.ArrayList;
import java.util.List;

public class Corral extends Exposition {

    private String paddock;
    private int feedingwindows;

    private List<Mammal> mammalList = new ArrayList<>();

    public Corral(int expId, String name, int area, String paddock, int feedingwindows){
        super(expId, name, area);
        this.paddock = paddock;
        this.feedingwindows = feedingwindows;
    }

    public void addMammal(Mammal mammal){
        mammalList.add(mammal);

    }

    @Override
    public void displayInfo() {
        System.out.println("Exposition ID: " + getExpId());
        System.out.println("Name of the corral: " + getName());
        System.out.println("Area of the corral: " + getArea());
        System.out.println("Type of paddock: " + getPaddock());
        System.out.println("Number of feeding windows: " + getFeedingwindows());
        System.out.println("Exhibits: " + getMammalList().size());
    }

    public String getPaddock() {
        return paddock;
    }

    public void setPaddock(String paddock) {
        this.paddock = paddock;
    }

    public int getFeedingwindows() {
        return feedingwindows;
    }

    public void setFeedingwindows(int feedingwindows) {
        this.feedingwindows = feedingwindows;
    }

    public List<Mammal> getMammalList() {
        return mammalList;
    }
}
