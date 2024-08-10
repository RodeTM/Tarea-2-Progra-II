/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipoFutbol;

/**
 *
 * @author EL-RODER
 */

public class Entrenador extends Persona implements Entrenamiento {
    private String estrategia;

    public Entrenador(String nombre, int edad, String estrategia) {
        super(nombre, edad);
        this.estrategia = estrategia;
    }

    @Override
    public void entrenar() {
        System.out.println(getNombre() + " está entrenando al equipo con la estrategia: " + estrategia);
    }
}

    
    

