package com.mycompany.app.builder;

public class Director {
    public Carro construirCarroEsportivo() {
        return new Carro.CarroBuilder()
            .setMotor("V8 Turbo")
            .setCor("Vermelho")
            .setPortas(2)
            .setTipoDeCombustivel("Gasolina")
            .build();
    }

    public Carro construirCarroPopular() {
        return new Carro.CarroBuilder()
            .setMotor("1.0")
            .setCor("Cinza")
            .setPortas(4)
            .setTipoDeCombustivel("Etanol")
            .build();
    }
}
