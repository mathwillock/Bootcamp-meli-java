package com.company.wrapper.Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Garagem extends Veiculo {

    int id;
    public List<Veiculo> veiculo = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Veiculo> getVeiculo() {
        return veiculo;
    }

    public Garagem(){}

   public Garagem(List<Veiculo> veiculos) {}
}
