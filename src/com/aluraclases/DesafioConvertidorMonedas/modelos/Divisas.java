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
    public String getDivisaEntrada() {
        return divisaEntrada;}
    public void setDivisaEntrada(String divisaEntrada) {
        this.divisaEntrada = divisaEntrada;}
    public String getDivisaSalida() {
        return divisaSalida;}
    public void setDivisaSalida(String divisaSalida) {
        this.divisaSalida = divisaSalida;}
    public float getDivisaConvertida() {
        return divisaConvertida;}
    public void setDivisaConvertida(float divisaConvertida) {
        this.divisaConvertida = divisaConvertida;}

    @Override
    public String toString() {
        return "El valor de " + valor +
                "[" + divisaEntrada +"]" +
                " corresponde al valor final de =>>> " +
                divisaConvertida +
                "[" + divisaSalida + "]";
    }
}
