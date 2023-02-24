/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author USER
 */
public class VehiculoTurismo extends Vehiculo{
    private int nPuertas;

    public VehiculoTurismo(int nPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }
    
    public int getnPuertas(){
        return nPuertas;
    }
    
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+"Marca: "+marca+"Modelo: "+modelo+"Numero puertas: "+nPuertas;
    }
    
    
    
}
