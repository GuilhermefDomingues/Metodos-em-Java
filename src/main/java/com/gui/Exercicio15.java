// Exercício 15
// Crie calcularIMC(double peso, double altura) e outro método que classifique o resultado.

package com.gui;

public class Exercicio15 {
    public static void main(String[] args) {
        double imc = calcularIMC(70, 1.75);
        System.out.printf("IMC: %.2f - %s%n", imc, classificarIMC(imc));
    }

    static double calcularIMC(double peso, double altura) {
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Peso e altura precisam ser positivos.");
        }
        return peso / (altura * altura);
    }

    static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        }
        if (imc < 25) {
            return "Peso normal";
        }
        if (imc < 30) {
            return "Sobrepeso";
        }
        if (imc < 35) {
            return "Obesidade grau I";
        }
        if (imc < 40) {
            return "Obesidade grau II";
        }
        return "Obesidade grau III";
    }
}
