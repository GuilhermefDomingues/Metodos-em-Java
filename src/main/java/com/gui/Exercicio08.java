// Exercício 08
// Crie maiorDeDois(int a, int b) retornando o maior.

package com.gui;

public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println(maiorDeDois(8, 3));
    }

    static int maiorDeDois(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }
}
