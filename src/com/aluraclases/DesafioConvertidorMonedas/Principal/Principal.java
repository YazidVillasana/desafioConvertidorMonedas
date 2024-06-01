package com.aluraclases.DesafioConvertidorMonedas.Principal;

import com.aluraclases.DesafioConvertidorMonedas.modelos.CompararParesDeDivisas;
import com.aluraclases.DesafioConvertidorMonedas.modelos.Divisas;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        CompararParesDeDivisas consulta = new CompararParesDeDivisas();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        Divisas cantidad = new Divisas();
        var opcion = 0;

       while (opcion != 7){
           System.out.println("""
                ********************************************************
                Bienvenido/a al Conversor de Moneda ^u^
        
                1) Dólar ==> Peso argentino
                2) Peso argentino ==> Dólar
                3) Dólar ==> Real brasileño
                4) Real brasileño ==> Dólar
                5) Dólar ==> Peso colombiano
                6) Peso colombiano ==> Dólar
                7) Salir
                Elija una opción
                ********************************************************""");

           try {
               opcion = lectura.nextInt();

                   if (opcion != 7) {
                       System.out.println("Ingrese el valor que deseas convertir: ");
                       cantidad.setValor(lectura.nextInt());
                   }
                   switch (opcion) {
                       case 1:
                           CompararPrecios compara = consulta.comparaDivisa("USD", "ARS", cantidad.getValor());
                           Divisas resultado = new Divisas(cantidad.getValor(), compara);
                           System.out.println(resultado);
                           break;
                       case 2:
                           compara = consulta.comparaDivisa("ARS", "USD", cantidad.getValor());
                           System.out.println(compara);
                           break;
                       case 7:
                           System.out.println("Saliendo de la aplicación... Gracias por usar nuestro programa.");
                           opcion = 7;
                           break;

                       default:
                           System.out.println("Opción no válida");
                   }

               }catch (RuntimeException e){
                   System.out.println(e.getMessage());
                   System.out.println("Finalizando la aplicación.");
                   opcion = 7;
               }

       }
    }
}
