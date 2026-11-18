// Exercício 11
// Crie métodos separados para calcular subtotal, desconto de 10% e total final de uma compra.

package com.gui;

public class Exercicio11 {
    public static void main(String[] args) {
        double subtotal = calcularSubtotal(25.50, 4);
        double desconto = calcularDesconto(subtotal);
        System.out.printf("Total: R$ %.2f%n", calcularTotal(subtotal, desconto));
    }

    static double calcularSubtotal(double preco, int quantidade) {
        return preco * quantidade;
    }

    static double calcularDesconto(double subtotal) {
        return subtotal * 0.10;
    }

    static double calcularTotal(double subtotal, double desconto) {
        return subtotal - desconto;
    }
}
