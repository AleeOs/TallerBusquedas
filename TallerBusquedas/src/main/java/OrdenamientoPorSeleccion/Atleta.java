/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrdenamientoPorSeleccion;

/**
 *
 * @author Alexis
 */
public class Atleta {
    private String Nombre;
    private double Tiempo;

    public Atleta(String Nombre, double Tiempo) {
        this.Nombre = Nombre;
        this.Tiempo = Tiempo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getTiempo() {
        return Tiempo;
    }

    public void setTiempo(double Tiempo) {
        this.Tiempo = Tiempo;
    }

   
}
