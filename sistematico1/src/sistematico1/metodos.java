package sistematico1;

import java.util.Scanner;

public class metodos {
    private int numerador;
    private int denominador;

    
    public metodos(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        
    }

    public int getNumerator() {
        return numerador;
    }

    public int getDenominator() {
        return denominador;
    }

    public metodos sum(metodos other) {
        int newNumerador = numerador * other.denominador + other.numerador * denominador;
        int newDenominador = denominador * other.denominador;
        return new metodos(newNumerador, newDenominador);
    }

    public metodos resta(metodos other) {
        int newNumerador = numerador * other.denominador - other.numerador * denominador;
        int newDenominador = denominador * other.denominador;
        return new metodos(newNumerador, newDenominador);
    }

    public metodos multiplicacion(metodos other) {
        int newNumerador = numerador * other.numerador;
        int newDenominador = denominador * other.denominador;
        return new metodos(newNumerador, newDenominador);
    }

    public metodos division(metodos other) {
        int newNumerador = numerador * other.denominador;
        int newDenominador = denominador * other.numerador;
        return new metodos(newNumerador, newDenominador);
    }

    public int compareTo(metodos other) {
        int thisNumerador = numerador * other.denominador;
        int otherNumerador = other.numerador * denominador;
        return Integer.compare(thisNumerador, otherNumerador);
    }

    public metodos copy() {
        return new metodos(numerador, denominador);
    }

    public void print() {
        System.out.println(numerador + "/" + denominador);
    }

    private void simplify() {
        int gcd = gcd(numerador, denominador);
        numerador /= gcd;
        denominador /= gcd;
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}