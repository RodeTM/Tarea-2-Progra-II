/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipoFutbol;

/**
 *
 * @author EL-RODER
 */

public class Masajista extends Persona {
    private String especialidad;

    public Masajista(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public void darMasaje() {
        System.out.println(getNombre() + " está dando un masaje.");
    }
}


