package br.com.sfranca.conversormoeda;

//Responsável por iniciar o programa, interagir com o usuário e orquestrar as chamadas entre as classes.
public class Principal {

    public static void main(String[] args) {
        System.out.println("Conversor de Moedas");

        String moedaOrigem = LeitorConsole.lerTexto("Digite a moeda de origem (ex: USD): ");
        String moedaDestino = LeitorConsole.lerTexto("Digite a moeda de destino (ex: BRL): ");
        double valor = LeitorConsole.lerNumero("Digite o valor a ser convertido: ");

        double resultado = ConversorMoeda.converter(moedaOrigem, moedaDestino, valor);

        System.out.printf("%.2f %s = %.2f %s%n", valor, moedaOrigem, resultado, moedaDestino);

    }
}




