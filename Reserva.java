/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_rentacar;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ET36
 */
public class Reserva {
    protected ArrayList<Auto>arrayAuto = new;
    protected Cliente cli;
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;
    protected int cantDias;

    public Reserva(Cliente cli, int cantDias) {
        this.cli = cli;
        this.cantDias = cantDias;
    }

    public Reserva(Cliente cli, LocalDate fechaFin) {
        this.cli = cli;
        this.fechaFin = fechaFin;
    }
    public void agregarAuto(Auto){
        
    }
    public int calcularDias(){
        
    }
    public void calcularFechaFin(){
        
    }
    public double totalRenta(){
        
    }
    public void imprimirTicket(){
        
    }
}