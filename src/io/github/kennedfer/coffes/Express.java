package io.github.kennedfer.coffes;

public class Express implements Coffe {
    private String name = "Express";
    private float price = 3;

    @Override
    public String getName(){
        return name;
    }

    @Override
    public float getPrice() {
        return price;
    }
}
