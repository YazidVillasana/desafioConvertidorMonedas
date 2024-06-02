package com.aluraclases.DesafioConvertidorMonedas.Principal;

import com.aluraclases.DesafioConvertidorMonedas.modelos.CompararParesDeDivisas;
import com.aluraclases.DesafioConvertidorMonedas.modelos.Divisas;
import com.aluraclases.DesafioConvertidorMonedas.modelos.GeneradorDeHistorial;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner lectura = new Scanner(System.in);
        DateTimeFormatter fechaHora = DateTimeFormatter.ofPattern("dd/LLL/yyyy HH:mm:ss");
        CompararParesDeDivisas consulta = new CompararParesDeDivisas();
        CompararPrecios compara;
        Divisas cantidad = new Divisas();
        Divisas resultado = null;
        Divisas fecha = new Divisas();
        GeneradorDeHistorial historial = new GeneradorDeHistorial();
        List<Divisas> recordConsulta = new ArrayList<>();


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

                   if (opcion >= 1 && opcion <= 7) {
                       System.out.println("Ingrese el valor que deseas convertir: ");
                       cantidad.setValor(lectura.nextInt());
                       fecha.setFecha((fechaHora.format(java.time.LocalDateTime.now())));
                   }
               }
               switch (opcion) {
                   case 1:
                       compara = consulta.comparaDivisa("USD", "BRL", cantidad.getValor());
                       resultado = new Divisas(fecha.getFecha(),cantidad.getValor(), compara);
                       break;
                   case 2:
                       compara = consulta.comparaDivisa("BRL", "USD", cantidad.getValor());
                       resultado = new Divisas(fecha.getFecha(),cantidad.getValor(), compara);
                       break;
                   case 3:
                       compara = consulta.comparaDivisa("USD", "CLP", cantidad.getValor());
                       resultado = new Divisas(fecha.getFecha(),cantidad.getValor(), compara);
                       break;
                   case 4:
                       compara = consulta.comparaDivisa("CLP", "USD", cantidad.getValor());
                       resultado = new Divisas(fecha.getFecha(),cantidad.getValor(), compara);
                       break;
                   case 5:
                       compara = consulta.comparaDivisa("USD", "COP", cantidad.getValor());
                       resultado = new Divisas(fecha.getFecha(),cantidad.getValor(), compara);
                       break;
                   case 6:
                       compara = consulta.comparaDivisa("COP", "USD", cantidad.getValor());
                       resultado = new Divisas(fecha.getFecha(),cantidad.getValor(), compara);
                       break;
                   case 7:
                       System.out.println("Saliendo de la aplicación... Gracias por usar nuestro programa.");
                       break;
                   default:
                       System.out.println("Opción no válida");
               }
           }catch (RuntimeException e){
               System.out.println(e.getMessage());
               System.out.println("Error al ingresar carácteres. Finalizando la aplicación.");
               opcion = 7;
           }
           if (opcion != 7){
               recordConsulta.add(resultado);
               System.out.println(resultado);
           }
       }
        historial.guardarHistorial(recordConsulta);
    }
}
