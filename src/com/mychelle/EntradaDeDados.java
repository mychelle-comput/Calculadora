package com.mychelle;

import java.util.Scanner;

public class EntradaDeDados {

    private Scanner ler = new Scanner(System.in);
    public double leiaNumero(String mensagem) {
        System.out.println(mensagem);
        return ler.nextDouble();
    }

    public String leiaString(String mensagem) {
        System.out.println(mensagem);
        return ler.next();
    }
}
