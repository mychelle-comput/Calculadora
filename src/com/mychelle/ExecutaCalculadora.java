package com.mychelle;

import java.util.Scanner;

public class ExecutaCalculadora {

    private static final String SOMAR = "+";
    private static final String SUBTRAIR = "-";
    private static final String MULTIPLICAR = "*";
    private static final String DIVIDIR = "/";
    private static final String SAIR = "#";

    public static void main(String[] args) {
        System.out.println(">>>>Calculadora<<<<");

        double num1, num2;
        double resultado;

        EntradaDeDados entrada = new EntradaDeDados();
        num1 = entrada.leiaNumero("Digite o primeiro numero:");

        num2 = entrada.leiaNumero("Digite o segundo numero:");

        String op = entrada.leiaString("Escolha uma operação:" +
                "\n+Soma\n-Sutração\n*Multiplicação\n/Divisão\n#Finalizar");
        Calculadora calcularadora = new Calculadora();

        switch (op) {
            case SOMAR:
                resultado = calcularadora.somar(num1, num2);
                System.out.println("O resultado da soma hé= " + new Double(resultado).intValue());
                break;
            case SUBTRAIR:
                resultado = calcularadora.subtrair(num1, num2);
                System.out.println("O resultado da subtração hé= " + new Double(resultado).intValue());
                break;
            case MULTIPLICAR:
                resultado = calcularadora.multiplicar(num1, num2);
                System.out.println("O resultado da multiplicação hé= " + resultado);
                break;
            case DIVIDIR:
                resultado = calcularadora.dividir(num1, num2);
                System.out.println("O resultado da divisão hé= " + resultado);
                break;
            case SAIR:
                System.out.println("Calculadora encerrada!");
                break;
            default:
                System.out.println("Essa não é uma opção valida!!!");
        }

    }
}
