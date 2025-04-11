package org.example;

public class Main {
    public static void main(String[] args) {
        Camisa camisa = new Camisa();
        CamisaEstampada camisaEstampada = new CamisaEstampada();

        camisa.setCor("Azul");
        camisa.setPreco(100.00);
        camisa.setTamanho("M");

        camisa.exibirDetalhes();
        System.out.println("Valor do desconto: " + camisa.calcularDesconto(camisa.getPreco()));

        // Separador

        System.out.println("=========================");

        // Camisa Estampada

        camisaEstampada.setEstampa("Estampa do Homem Aranha");
        camisaEstampada.setCor("Vermelha");
        camisaEstampada.setPreco(100.00);
        camisaEstampada.setTamanho("M");
        camisaEstampada.exibirDetalhes();
        System.out.println("Valor do desconto: " + camisaEstampada.calcularDesconto(camisaEstampada.getPreco()));
    }
}