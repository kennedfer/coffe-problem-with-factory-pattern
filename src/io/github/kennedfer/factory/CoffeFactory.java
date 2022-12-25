package io.github.kennedfer.factory;

import io.github.kennedfer.coffes.Coffe;

public class CoffeFactory {
    public static Coffe getCoffe(CoffeType coffe){
        return coffe.getConstructor().get();
    }
}
