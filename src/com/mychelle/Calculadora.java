package com.mychelle;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Calculadora!!!");
        double num1, num2;
        double resultado;

        System.out.println("\nDigite o primeiro numero:");
        Scanner ler = new Scanner(System.in);
        num1 = ler.nextDouble();
        System.out.println("Digite o segundo numero:");
        num2 = ler.nextDouble();
        Calculos calcular = new  Calculos();
        resultado = calcular.somar(num1,num2);
        System.out.println("A soma dos números = " + resultado);
        resultado = calcular.subtrair(num1, num2);
        System.out.println("A subtração dos números = "+ resultado);
        resultado = calcular.multiplicar(num1,num2);
        System.out.println("A multiplicação dos numeros = " + resultado);
        resultado = calcular.dividir(num1,num2);
        System.out.println("A divisão dos números = " + resultado);

    }
}
