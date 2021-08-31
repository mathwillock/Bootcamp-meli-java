package com.company.PraticaIntegradora.Pratica3;

public abstract class Product {

    private String nome;
    private Double price;

    public Product(String nome, Double price) {
        this.nome = nome;
        this.price = price;
    }

    public Double calcule(Integer quantidadeOfProdutos) {
        Double total = this.price * quantidadeOfProdutos;
        return total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome='" + nome + '\'' +
                ", price=" + price +
                '}';
    }
}
