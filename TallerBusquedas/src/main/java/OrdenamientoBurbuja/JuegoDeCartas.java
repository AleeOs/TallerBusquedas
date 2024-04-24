/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OrdenamientoBurbuja;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class JuegoDeCartas {
    private static ArrayList<Carta> Cartas = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de cartas en la mano: ");
        int cantidadCartas = scan.nextInt();
        for (int i = 0; i < cantidadCartas; i++) {
            System.out.println("Ingrese el valor de la carta " + (i + 1) + ": ");
            int valor = scan.nextInt();
            scan.nextLine();
            System.out.println("Ingrese el palo de la carta " + (i + 1) + ": ");
            String palo = scan.nextLine();
            Cartas.add(new Carta(valor, palo));
        }
         ordenarPorBurbuja();
         System.out.println("\nCartas ordenadas por valor y palo:");
        for (Carta carta : Cartas) {
            System.out.println(carta.getValor() + " de " + carta.getPalo());
        }
    }
    public static void ordenarPorBurbuja() {
        int n = Cartas.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                Carta cartaActual = Cartas.get(j);
                Carta siguienteCarta = Cartas.get(j + 1);
                if (cartaActual.getValor() > siguienteCarta.getValor()){
                    Cartas.set(j, siguienteCarta);
                    Cartas.set(j + 1, cartaActual);
                }
            }
        }
    }
}
