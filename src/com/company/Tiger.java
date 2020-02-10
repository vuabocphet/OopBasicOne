package com.company;

public class Tiger extends Animal {

    private static final String TIGER = "Tiger";

    public Tiger(String name, String characteristics, String dangerLevel, int numberOf) {
        super(Mammal, TIGER, name, characteristics, dangerLevel, numberOf);
    }

    public Tiger(String species, String type, String name, String characteristics, String dangerLevel, int numberOf) {
        super(species, type, name, characteristics, dangerLevel, numberOf);
    }

    @Override
    public void action() {

    }

    @Override
    public void ecosystem() {

    }

    @Override
    public void speed() {

    }

    @Override
    public void dangerous() {

    }
}
