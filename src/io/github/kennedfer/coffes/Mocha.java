package io.github.kennedfer.coffes;

public class Mocha implements Coffe {
    private String name = "Mocha";
    private float price = 5;

    @Override
    public String getName(){
        return name;
    }

    @Override
    public float getPrice() {
        return price;
    }
}
