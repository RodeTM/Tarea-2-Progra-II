/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipoFutbol;

/**
 *
 * @author EL-RODER
 */

public class Directivo extends Persona {
    private String cargo;

    public Directivo(String nombre, int edad, String cargo) {
        super(nombre, edad);
        this.cargo = cargo;
    }

    public void tomarDecisiones() {
        System.out.println(getNombre() + " está tomando decisiones como " + cargo);
    }
}


