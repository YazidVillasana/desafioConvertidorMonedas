package com.aluraclases.DesafioConvertidorMonedas.modelos;

import com.aluraclases.DesafioConvertidorMonedas.Principal.CompararPrecios;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CompararParesDeDivisas {


    public CompararPrecios comparaDivisa(String base, String target, float amount) {


        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/bea292b95daf518f4cf997d6/pair/" + base + "/" + target + "/" + amount);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), CompararPrecios.class);
            } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}