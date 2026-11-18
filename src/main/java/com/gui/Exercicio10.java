// Exercício 10
// Crie parOuImpar(int numero) retornando 'PAR' ou 'IMPAR'.

package com.gui;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println(parOuImpar(5));
        System.out.println(parOuImpar(8));
    }

    static String parOuImpar(int numero) {
        return numero % 2 == 0 ? "PAR" : "IMPAR";
    }
}
