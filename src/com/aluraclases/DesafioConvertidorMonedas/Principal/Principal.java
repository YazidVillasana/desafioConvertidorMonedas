package com.aluraclases.DesafioConvertidorMonedas.Principal;

import com.aluraclases.DesafioConvertidorMonedas.modelos.CompararParesDeDivisas;
import com.aluraclases.DesafioConvertidorMonedas.modelos.Divisas;
import com.aluraclases.DesafioConvertidorMonedas.modelos.GeneradorDeHistorial;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner lectura = new Scanner(System.in);
        Scanner monto = new Scanner(System.in);
        DateTimeFormatter fechaHora = DateTimeFormatter.ofPattern("dd/LLL/yyyy HH:mm:ss");
        CompararParesDeDivisas consulta = new CompararParesDeDivisas();
        CompararPrecios compara;
        Divisas cantidad = new Divisas();
        Divisas resultado;
        Divisas fecha = new Divisas();
        GeneradorDeHistorial historial = new GeneradorDeHistorial();
        List<Divisas> recordConsulta = new ArrayList<>();
        Divisas base = new Divisas();
        Divisas target = new Divisas();

        System.out.println("""
                ********************************************************
                Bienvenido/a al Conversor de Monedas.
                Instrucciones:
                1. Eliga y escriba el código de divisa a convertir
                2. Introduzca el código de divisa objetivo la cuál se calculará.
                3. Ingrese el mónto a convertir.""");
        while (true){
            System.out.println("""
                ********************************************************
                Código de Divisa | Nombre de Divisa             Código de Divisa | Nombre de Divisa
                
                MXN                 Nuevo peso méxicano.        COP                 Peso colombiano
                BRL                 Real brasileño.             CHF                 Franco Suizo
                USD                 Dólar americano             CNY                 Renminbi yuan chino
                CAD                 Dólar canadiense            EUR                 Euro
                ARS                 Peso argentino              JPY                 Yen japones
                CLP                 Peso chileno                GBP                 Libra esterlina
               
                Salir               Salir de la aplicación
                ********************************************************""");

            try {
                System.out.println("Ingrese el código de la divisa a convertir:");
                base.setDivisaEntrada(lectura.nextLine().toUpperCase());
                if (base.getDivisaEntrada().equalsIgnoreCase("salir")){
                    break;}
                System.out.println("Ingrese el código de divisa a calcular:");
                target.setDivisaSalida(lectura.nextLine().toUpperCase());
                if (target.getDivisaSalida().equalsIgnoreCase("salir")){
                    break;}
                System.out.println("Ingrese el valor que deseas convertir: ");
                cantidad.setValor(monto.nextInt());
                fecha.setFecha((fechaHora.format(LocalDateTime.now())));

                compara = consulta.comparaDivisa(base.getDivisaEntrada(), target.getDivisaSalida(), cantidad.getValor());
                resultado = new Divisas(fecha.getFecha(),cantidad.getValor(), compara);

            }catch (RuntimeException e){
                System.out.println(e.getMessage());
                System.out.println("Error al ingresar carácteres. Finalizando la aplicación.");
                break;}
            if (!base.getDivisaEntrada().equals("salir") || !target.getDivisaSalida().equals("salir")){
                recordConsulta.add(resultado);
                System.out.println(resultado);}
        }
        historial.guardarHistorial(recordConsulta);
    }
}
