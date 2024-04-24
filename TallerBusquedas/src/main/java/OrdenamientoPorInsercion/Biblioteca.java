/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OrdenamientoPorInsercion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class Biblioteca {
    private static ArrayList<Libro> libros = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de libros: ");
        int cantidadLibros = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println("Ingrese el título del libro " + (i + 1) + ": ");
            String titulo = scan.nextLine();
            libros.add(new Libro(titulo));
        }
         ordenarPorInsercion();
         
         System.out.println("Libros ordenados por título:");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }
    public static void ordenarPorInsercion() {
        for (int i = 1; i < libros.size(); i++) {
            boolean agregado = false;
            for (int j = i; j > 0 && !agregado; j--) {
                Libro actual = libros.get(j);
                Libro anterior = libros.get(j - 1);
                if (actual.getTitulo().compareTo(anterior.getTitulo()) < 0) {
                    libros.set(j, anterior);
                    libros.set(j - 1, actual);
                } else {
                    agregado = true;
                }
            }
        }
    }
}
