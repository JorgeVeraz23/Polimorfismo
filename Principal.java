/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[] args){
        Vehiculo misVehiculos[] = new Vehiculo[4];
    
    misVehiculos[0] = new Vehiculo("GH67","Ferrari","A89");
    misVehiculos[1] = new VehiculoTurismo(4,"7s8A","Audi","P14");
    misVehiculos[2] = new VehiculoDeportivo(500,"45GS0","Toyota","KHO9");
    misVehiculos[3] = new VehiculoFurgoneta(2000,"JJ2","Toyota","j9");
    
    
    for(Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
    }
}
    
}
