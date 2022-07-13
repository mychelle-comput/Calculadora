package com.mychelle;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println(">>>>Calculadora<<<<");

        double num1, num2;
        double resultado;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        num1 = ler.nextDouble();
        System.out.println("Digite o segundo numero:");
        num2 = ler.nextDouble();
        System.out.println("Escolha uma operação:");
        System.out.println("+Soma\n-Sutração\n*Multiplicação\n/Divisão\n#Finalizar");
        String op = ler.next();
        Calculos calcular = new Calculos();

        switch (op) {
            case "+":
                resultado = calcular.somar(num1, num2);
                System.out.println("O resultado da soma hé= " + new Double(resultado).intValue());
                break;
            case "-":
                resultado = calcular.subtrair(num1, num2);
                System.out.println("O resultado da subtração hé= " + new Double(resultado).intValue());
                break;
            case "*":
                resultado = calcular.multiplicar(num1, num2);
                System.out.println("O resultado da multiplicação hé= " + resultado);
                break;
            case "/":
                resultado = calcular.dividir(num1, num2);
                System.out.println("O resultado da divisão hé= " + resultado);
                break;
            case "#":
                System.out.println("Calculadora encerrada!");
                break;
            default:
                System.out.println("Essa não é uma opção valida!!!");
        }

    }
}
