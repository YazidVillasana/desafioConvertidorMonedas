package com.aluraclases.DesafioConvertidorMonedas.modelos;
import com.aluraclases.DesafioConvertidorMonedas.Principal.CompararPrecios;

public class Divisas {

    private float valor;
    private String divisaEntrada;
    private String divisaSalida;
    private float divisaConvertida;

    public Divisas(float valor, CompararPrecios miCompararPrecios ){
        this.valor = valor;
        this.divisaEntrada = miCompararPrecios.base_code();
        this.divisaSalida = miCompararPrecios.target_code();
        this.divisaConvertida = miCompararPrecios.conversion_result();
    }
    public Divisas() {

    }


    public float getValor() {
        return valor;}
    public void setValor(float valor) {
        this.valor = valor;}

    @Override
    public String toString() {
        return "El valor de " + valor +
                "[" + divisaEntrada +"]" +
                " corresponde al valor final de =>>> " +
                divisaConvertida +
                "[" + divisaSalida + "]";
    }
}
