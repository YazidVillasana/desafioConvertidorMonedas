package com.aluraclases.DesafioConvertidorMonedas.modelos;
import com.aluraclases.DesafioConvertidorMonedas.Principal.CompararPrecios;

public class Divisas {

    private String fecha;
    private float valor;
    private String divisaEntrada;
    private String divisaSalida;
    private float divisaConvertida;

    public Divisas(String fecha,float valor, CompararPrecios miCompararPrecios ){
        this.fecha = fecha;
        this.valor = valor;
        this.divisaEntrada = miCompararPrecios.base_code();
        this.divisaSalida = miCompararPrecios.target_code();
        this.divisaConvertida = miCompararPrecios.conversion_result();
    }

    public Divisas() {
    }

    public String getFecha() {
        return fecha;}
    public void setFecha(String fecha) {
        this.fecha = fecha;}
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

    @Override
    public String toString() {
        return "El valor de " + valor +
                "[" + divisaEntrada +"]" +
                " corresponde al valor final de =>>> " +
                divisaConvertida +
                "[" + divisaSalida + "]";
    }
}
