package io.github.kennedfer.factory;

import io.github.kennedfer.coffes.Americano;
import io.github.kennedfer.coffes.Coffe;
import io.github.kennedfer.coffes.Express;
import io.github.kennedfer.coffes.Mocha;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Getter
public enum CoffeType {

    AMERICANO(Americano::new),
    MOCHA(Mocha::new),
    EXPRESS(Express::new);

    private final Supplier<Coffe> constructor;
}
