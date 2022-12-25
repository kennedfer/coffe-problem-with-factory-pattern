package io.github.kennedfer.coffes;

public class Americano implements Coffe {
    private String name = "Americano";
    private float price = 10;

    @Override
    public String getName(){
        return name;
    }

    @Override
    public float getPrice() {
        return price;
    }
}
