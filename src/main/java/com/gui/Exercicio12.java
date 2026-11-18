// Exercício 12
// Crie media(double n1, double n2, double n3) e situacao(double media).

package com.gui;

public class Exercicio12 {
    public static void main(String[] args) {
        double resultado = media(8, 6, 7);
        System.out.println("Média: " + resultado + " - " + situacao(resultado));
    }

    static double media(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    static String situacao(double media) {
        return media >= 7 ? "Aprovado" : "Reprovado";
    }
}
