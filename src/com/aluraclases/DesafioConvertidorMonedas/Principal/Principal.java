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
                Bienvenido/a al Conversor de Monedas ^u^
        
                1) Dólar           ==>  Real brasileño 
                2) Real brasileño  ==>  Dólar
                3) Dólar           ==>  Peso chileno
                4) Peso chileno    ==>  Dólar
                5) Dólar           ==>  Peso colombiano
                6) Peso colombiano ==>  Dólar
                7) Salir
                ¡Elija una opción!
                ********************************************************""");

           try {
               opcion = lectura.nextInt();

                   if (opcion != 7) {

                       if (opcion >= 1 && opcion <= 7){
                           System.out.println("Ingrese el valor que deseas convertir: ");
                           cantidad.setValor(lectura.nextInt());
                       }
                   }
                   switch (opcion) {
                       case 1:
                           CompararPrecios compara = consulta.comparaDivisa("USD", "BRL", cantidad.getValor());
                           Divisas resultado = new Divisas(cantidad.getValor(), compara);
                           System.out.println(resultado);
                           break;
                       case 2:
                           compara = consulta.comparaDivisa("BRL", "USD", cantidad.getValor());
                           resultado = new Divisas(cantidad.getValor(), compara);
                           System.out.println(resultado);
                           break;
                       case 3:
                           compara = consulta.comparaDivisa("USD", "CLP", cantidad.getValor());
                           resultado = new Divisas(cantidad.getValor(), compara);
                           System.out.println(resultado);
                           break;
                       case 4:
                           compara = consulta.comparaDivisa("CLP", "USD", cantidad.getValor());
                           resultado = new Divisas(cantidad.getValor(), compara);
                           System.out.println(resultado);
                           break;
                       case 5:
                           compara = consulta.comparaDivisa("USD", "COP", cantidad.getValor());
                           resultado = new Divisas(cantidad.getValor(), compara);
                           System.out.println(resultado);
                           break;
                       case 6:
                           compara = consulta.comparaDivisa("COP", "USD", cantidad.getValor());
                           resultado = new Divisas(cantidad.getValor(), compara);
                           System.out.println(resultado);
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
                   System.out.println("Error al ingresar carácteres. Finalizando la aplicación.");
                   opcion = 7;
               }

       }
    }
}
