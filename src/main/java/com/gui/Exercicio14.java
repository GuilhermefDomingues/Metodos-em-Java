// Exercício 14
// Crie podeVotar(int idade) com retorno boolean e use-o em um if no main.

package com.gui;

public class Exercicio14 {
    public static void main(String[] args) {
        if (podeVotar(16)) {
            System.out.println("Pode votar.");
        } else {
            System.out.println("Ainda não pode votar.");
        }
    }

    static boolean podeVotar(int idade) {
        return idade >= 16;
    }
}
