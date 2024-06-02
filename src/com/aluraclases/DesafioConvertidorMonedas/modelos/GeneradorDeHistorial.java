package com.aluraclases.DesafioConvertidorMonedas.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class GeneradorDeHistorial extends Divisas{

    DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("LLLdd.yyyy");



    public void guardarHistorial(List<Divisas> divisas) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().setPrettyPrinting().create();
        Stream<Path> files = Files.list(Paths.get("C:\\Users\\PC\\IdeaProjects\\DesafioConvertidorMonedas")); //Será necesario ajustar la ruta en donde se encuentre guardado el proyecto
        long contador = files.map(Path.class::cast)
                .filter(path -> path.getFileName().toString().startsWith("consulta")).count();

        FileWriter historial = new FileWriter("consulta"+contador + "_"+ dateTime.format(java.time.LocalDateTime.now()) +".json");
        historial.write(gson.toJson(divisas));
        historial.close();
    }
}