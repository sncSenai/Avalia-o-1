package org.example;

public class Camisa {

    private String cor;
    private String tamanho;
    private Double preco;

    public Camisa(){}

    public Camisa(String cor, Double preco, String tamanho) {
        this.cor = cor;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void exibirDetalhes(){
        System.out.println("Camiseta Normal: ");
        System.out.println("Cor: " + cor);
        System.out.println("Preco: " + preco);
        System.out.println("Tamanho " + tamanho);
    }
    public double calcularDesconto(double preco){
        double desconto;
        double precoDesconto;

        desconto = preco * (10.0 / 100);
        precoDesconto = preco - desconto;

        return precoDesconto;
    }
}
