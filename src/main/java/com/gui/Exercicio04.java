// Exercício 04
// Crie ehPositivo(int numero) retornando boolean.

package com.gui;

public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println(ehPositivo(4));
        System.out.println(ehPositivo(0));
    }

    static boolean ehPositivo(int numero) {
        return numero > 0;
    }
}
