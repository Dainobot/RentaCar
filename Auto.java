/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_rentacar;

/**
 *
 * @author ET36
 */
public class Auto {
    protected String patente;
    protected String modelo;
    protected String color;
    protected String marca;
    protected double precioAuto;

    public Auto(String patente, String modelo, String color, String marca, double precioAuto) {
        this.patente = patente;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.precioAuto = precioAuto;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioAuto() {
        return precioAuto;
    }

    public void setPrecioAuto(double precioAuto) {
        this.precioAuto = precioAuto;
    }
    
}
