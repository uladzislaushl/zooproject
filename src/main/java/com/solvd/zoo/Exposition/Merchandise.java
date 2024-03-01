package com.solvd.zoo.Exposition;

import java.util.List;
import java.util.ArrayList;

public class Merchandise{

    private String name;
    private double price;
    private List<String> tags;

    public Merchandise(String name, double price) {
        this.name = name;
        this.price = price;
        this.tags = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getTags() {
        return tags;
    }

    public void addTag(String tag) {
        tags.add(tag);
    }

    public void removeTag(String tag) {
        tags.remove(tag);
    }

    public void displayInfo() {
        System.out.println("Наименование: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Теги: " + tags);
    }
}
