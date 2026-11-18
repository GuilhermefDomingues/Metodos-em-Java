// Exercício 09
// Crie saudacao(String nome) retornando uma String pronta para imprimir.

package com.gui;

public class Exercicio09 {
    public static void main(String[] args) {
        System.out.println(saudacao("Gui"));
    }

    static String saudacao(String nome) {
        return "Olá, " + nome + "!";
    }
}
