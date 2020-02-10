package com.company;

import java.util.Scanner;

public abstract class Animal {


    protected static final String Invertebrates = "Invertebrates";
    protected static final String Fish = "Fish";
    protected static final String Amphibians = "Amphibians";
    protected static final String Reptile = "Reptile";
    protected static final String Birds = "Birds";
    protected static final String Mammal = "Mammal";

    public abstract void action();

    public abstract void ecosystem();

    public abstract void speed();

    public abstract void dangerous();

    protected String species;
    protected String type;
    protected String name;
    protected String characteristics;
    protected String dangerLevel;
    protected int numberOf;

    public Animal(String species,String type,String name, String characteristics, String dangerLevel, int numberOf) {
        this.species = species;
        this.type = type;
        this.name = name;
        this.characteristics = characteristics;
        this.dangerLevel = dangerLevel;
        this.numberOf = numberOf;
    }

    public String getSpecies() {
        return species;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public String getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(String dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    public int getNumberOf() {
        return numberOf;
    }

    public void setNumberOf(int numberOf) {
        this.numberOf = numberOf;
    }
}
