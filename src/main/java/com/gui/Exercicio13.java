// Exercício 13
// Crie converterCelsius(double celsius) para Fahrenheit e use o retorno em uma frase.

package com.gui;

public class Exercicio13 {
    public static void main(String[] args) {
        double celsius = 25;
        System.out.println(celsius + " °C equivalem a " + converterCelsius(celsius) + " °F.");
    }

    static double converterCelsius(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
