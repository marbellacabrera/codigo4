package com.generation;

/** * Este programa permite jugar al juego de "piedra, papel o tijeras". 
 * * Solicita a dos jugadores que introduzcan sus elecciones y 
 * determina el ganador.
 *  */
import java.util.Scanner; // importe la clase Scanner

public class Codigo4 {

    public static void main(String[] args) { // Método main para iniciar el programa, dentro de la clase
        Scanner s = new Scanner(System.in); // Crear un objeto Scanner para recibir la entrada de la consola

        // Solicitar la elección del jugador 1
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine().toLowerCase();

        // Solicitar la elección del jugador 2
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //Corregir nombre del jugador 2: 
        //Corregí la solicitud del turno del jugador 2 y removí el Scanner s2 redundante. 
        String j2 = s.nextLine().toLowerCase();

        // Comprobar si ambos jugadores han introducido la misma elección
        if (j1.equals(j2)) { // Reemplacé == por .equals para comparar cadenas.
            System.out.println("Empate");
        } else {
            int g = 2; // Inicializar el ganador como jugador 2

            // Determinar el ganador según las reglas del juego
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break; // Agregar break por uso de switch

                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break; // Agregar break por uso de switch

                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break; // Agregar break por uso de switch

                default:
                    // Mensaje de entrada inválida si el jugador 1 introduce una opción incorrecta
                    System.out.println("Entrada inválida del jugador 1");
                    s.close();
                    return;
            }

            // Mensaje de entrada inválida si el jugador 2 introduce una opción incorrecta
            if (!j2.equals("piedra") && !j2.equals("papel") && !j2.equals("tijeras")) {
                System.out.println("Entrada inválida del jugador 2");
            } else {
                System.out.println("Gana el jugador " + g);
            }
        }

        s.close(); // Cerrar el scanner
    }
}
