package com.company.PraticaIntegradora.Pratica1;

public class Roupa {
    private String marca, modelo;


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;

    }

    public Roupa() {
    }

    public Roupa(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "marca ='" + marca + '\'' +
                ", modelo ='" + modelo + '\''+
                '}'
                ;
    }
}
