package com.aluraclases.DesafioConvertidorMonedas.Principal;

import com.aluraclases.DesafioConvertidorMonedas.modelos.CompararParesDeDivisas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        CompararParesDeDivisas consulta = new CompararParesDeDivisas();
        System.out.println("Menú");

        try {

            CompararPrecios compara = consulta.comparaDivisa("USD", "CHF", 10);
            System.out.println(compara);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación.");
        }


    }

}
