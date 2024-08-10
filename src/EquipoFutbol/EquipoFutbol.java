/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipoFutbol;

import EquipoFutbol.Directivo;
import EquipoFutbol.Entrenador;
import EquipoFutbol.Jugador;
import EquipoFutbol.Masajista;

/**
 *
 * @author EL-RODER
 */
public class EquipoFutbol {
    
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Lionel Messi", 34, "Delantero", 10);
        Entrenador entrenador = new Entrenador("Pep Guardiola", 50, "Posesión");
        Masajista masajista = new Masajista("Juan Pérez", 40, "Fisioterapeuta");
        Directivo directivo = new Directivo("Florentino Pérez", 75, "Presidente");

        jugador.entrenar();
        jugador.jugarPartido();
        entrenador.entrenar();
        masajista.darMasaje();
        directivo.tomarDecisiones();
    }
}

      
