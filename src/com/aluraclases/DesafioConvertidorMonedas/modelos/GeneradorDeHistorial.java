package com.aluraclases.DesafioConvertidorMonedas.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class GeneradorDeHistorial extends Divisas{

    DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");

    public void guardarHistorial(Divisas divisas) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().setPrettyPrinting().create();
        FileWriter historial = new FileWriter(dateTime.format(java.time.LocalDateTime.now())  +".json");
        historial.write(gson.toJson(divisas));
        historial.close();
    }
}