package com.mycompany.app.builder;

public class Carro {
    private String motor;
    private String cor;
    private int portas;
    private String tipoDeCombustivel;

    Carro(CarroBuilder builder) {
        this.motor = builder.motor;
        this.cor = builder.cor;
        this.portas = builder.portas;
        this.tipoDeCombustivel = builder.tipoDeCombustivel;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor='" + motor + '\'' +
                ", cor='" + cor + '\'' +
                ", portas=" + portas +
                ", tipoDeCombustivel='" + tipoDeCombustivel + '\'' +
                '}';
    }
    

    public static class CarroBuilder {
        private String motor;
        private String cor;
        private int portas;
        private String tipoDeCombustivel;

        public CarroBuilder setMotor(String motor) {
            this.motor = motor;
            return this;
        }        

        public CarroBuilder setCor(String cor) {
            this.cor = cor;
            return this;
        }        
        public CarroBuilder setPortas(int portas) {
            this.portas = portas;
            return this;
        }        
        public CarroBuilder setTipoDeCombustivel(String tipoDeCombustivel) {
            this.tipoDeCombustivel = tipoDeCombustivel;
            return this;
        }        

        public Carro build() {
            return new Carro(this)
            ;
        }
    
    }
}

