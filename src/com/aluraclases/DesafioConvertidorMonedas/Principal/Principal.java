package com.aluraclases.DesafioConvertidorMonedas.Principal;

import com.aluraclases.DesafioConvertidorMonedas.modelos.CompararParesDeDivisas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        CompararParesDeDivisas consulta = new CompararParesDeDivisas();

       while (true){

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
                ********************************************************
                """);

           try {
               var opcion = lectura.nextInt();
               switch (opcion){
                   case 1:
                       System.out.println("Ingrese el valor que deseas convertir: ");
                       var valor = lectura.nextInt();
                       CompararPrecios compara = consulta.comparaDivisa("USD", "ARS", valor);
                       System.out.println("El valor " + valor + "[ARS] corresponde al valor final de =>>> ");


               }

               CompararPrecios compara = consulta.comparaDivisa("USD", "CHF", 10);
               System.out.println(compara);
               }catch (RuntimeException e){
                   System.out.println(e.getMessage());
                   System.out.println("Finalizando la aplicación.");
               }


       }




    }

}
