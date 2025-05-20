package br.com.sfranca.conversormoeda;//package api;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

// Classe que representa a resposta da API
class RespostaApi {
    public String result;
    public double conversion_rate;
}

public class ClienteApi {
    private static final String API_KEY = ConfiguracaoJava.obterChaveApi();


    public static double obterTaxa(String moedaOrigem, String moedaDestino) {
        try {
            String urlStr = String.format(
                    "https://v6.exchangerate-api.com/v6/%s/pair/%s/%s",
                    API_KEY, moedaOrigem, moedaDestino);

            URL url = new URL(urlStr);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");

            if (conexao.getResponseCode() == 200) {
                Reader leitor = new InputStreamReader(conexao.getInputStream());
                Gson gson = new Gson();
                RespostaApi resposta = gson.fromJson(leitor, RespostaApi.class);

                if ("success".equalsIgnoreCase(resposta.result)) {
                    return resposta.conversion_rate;
                } else {
                    System.out.println("Erro na resposta da API: " + resposta.result);
                }
            } else {
                System.out.println("Erro HTTP: " + conexao.getResponseCode());
            }

        } catch (Exception e) {
            System.out.println("Erro ao acessar a API: " + e.getMessage());
        }

        return 0.0;
    }
}
