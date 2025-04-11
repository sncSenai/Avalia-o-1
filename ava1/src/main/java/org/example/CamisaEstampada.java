package org.example;

public class CamisaEstampada extends Camisa{

    private String estampa;
    private String cor;
    private String tamanho;
    private Double preco;

    public CamisaEstampada(){}

    public CamisaEstampada(String estampa) {
        this.estampa = estampa;
    }

    public CamisaEstampada(String cor, Double preco, String tamanho, String estampa) {
        super(cor, preco, tamanho);
        this.estampa = estampa;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEstampa() {
        return estampa;
    }

    public void setEstampa(String estampa) {
        this.estampa = estampa;
    }

    @Override
    public Double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String getTamanho() {
        return tamanho;
    }

    @Override
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void exibirDetalhes(){
        System.out.println("Camiseta Estampada: ");
        System.out.println("Cor: " + cor);
        System.out.println("Preco: " + preco);
        System.out.println("Tamanho " + tamanho);
        System.out.println("Estampa: " + estampa);
    }
    public double calcularDesconto(double preco){
        double desconto;
        double precoDesconto;

        desconto = preco * (5.0 / 100);
        precoDesconto = preco - desconto;

        return precoDesconto;
    }
}
