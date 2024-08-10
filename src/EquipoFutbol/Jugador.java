/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipoFutbol;

/**
 *
 * @author EL-RODER
 */

public class Jugador extends Persona implements Entrenamiento, Partido {
    private String posicion;
    private int numero;

    public Jugador(String nombre, int edad, String posicion, int numero) {
        super(nombre, edad);
        this.posicion = posicion;
        this.numero = numero;
    }

    @Override
    public void entrenar() {
        System.out.println(getNombre() + " está entrenando.");
    }

    @Override
    public void jugarPartido() {
        System.out.println(getNombre() + " está jugando en la posición de " + posicion);
    }
}

    
    
    
    

