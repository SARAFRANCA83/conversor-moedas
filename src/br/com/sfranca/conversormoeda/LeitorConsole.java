package br.com.sfranca.conversormoeda;

import java.util.Scanner;

//Classe utilitária para ler dados do usuário via console.

public class LeitorConsole {
    private static Scanner scanner = new Scanner(System.in);

    public static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine().toUpperCase();
    }

    public static double lerNumero(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }
}
