package br.com.sfranca.conversormoeda;

//package api;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfiguracaoJava {

    public static String obterChaveApi() {
        Properties props = new Properties();
        try {
            FileInputStream fis = new FileInputStream("config.properties"); // busca na raiz do projeto
            props.load(fis);
            return props.getProperty("API_KEY");
        } catch (IOException e) {
            System.out.println("Erro ao carregar chave da API: " + e.getMessage());
            return "";
        }
    }
}
