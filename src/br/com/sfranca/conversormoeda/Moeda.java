package br.com.sfranca.conversormoeda;

//Classe de modelo que representa uma conversão de moeda.
public class Moeda {
    private String origem;
    private String destino;
    private double valor;

    public Moeda(String origem, String destino, double valor) {
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
    }

    public String getOrigem() { return origem; }
    public String getDestino() { return destino; }
    public double getValor() { return valor; }



}
