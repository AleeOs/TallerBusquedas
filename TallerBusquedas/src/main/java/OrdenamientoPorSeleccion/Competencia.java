/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OrdenamientoPorSeleccion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class Competencia {
    private static ArrayList <Atleta> atletas = new ArrayList();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escribir el numero de Atletas a ingresar");
        int numerosAIngresar = scan.nextInt();
        for(int i = 0; i < numerosAIngresar; i++){
            System.out.println("Digite en nombre del Atleta: " + (i + 1));
            String NombreAtleta = scan.next();
            System.out.println("Digite el tiempo del Atleta: " + (i + 1));
            double tiempoAtleta = scan.nextDouble();
            registrarTiempos(NombreAtleta,tiempoAtleta);
        }
        System.out.println("La lista de los tiempos sin ordenar");
        mostrarTiempos();
        ordenarPorSeleccion();
        System.out.println("Lista de los tiempos ordenados de mayor a menor");
        mostrarTiempos();
  }                          
    public static void registrarTiempos(String Nombre, double Tiempo){
        Atleta nuevoTiempo = new Atleta(Nombre, Tiempo);
        atletas.add(nuevoTiempo);
    }
     public static void mostrarTiempos (){
        for(Atleta a : atletas){
            System.out.println(a.getTiempo() + " : " + a.getNombre());
        }
    }
     public static void ordenarPorSeleccion(){
        for(int i = 0; i < atletas.size() - 1; i++){
        Atleta mayor = atletas.get(i);
        int posMayor = i;
        for(int j = i+1; j < atletas.size(); j++){
            Atleta actual = atletas.get(j);
            if(actual.getTiempo()> mayor.getTiempo()){
                mayor = actual;
                posMayor=j;
            }
        }
        Atleta temp = atletas.get(i);
        atletas.set(i, mayor);
        atletas.set(posMayor, temp);
     }
    }
   }
    

