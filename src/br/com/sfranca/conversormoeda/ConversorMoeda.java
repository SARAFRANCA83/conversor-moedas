package br.com.sfranca.conversormoeda;

//Classe de serviço responsável pela lógica de conversão.

public class ConversorMoeda {
    public static double converter(String moedaOrigem, String moedaDestino, double valor) {
        double taxa = ClienteApi.obterTaxa(moedaOrigem, moedaDestino);
        return valor * taxa;
    }
}
