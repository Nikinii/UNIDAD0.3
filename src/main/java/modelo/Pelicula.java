/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Niko
 */
public class Pelicula {
 
    private String nombre;
    private int numdePelicula;
    private LocalDate yearEstreno;
    private int starPuntacion;
    private String descripcion;
    private ArrayList<Personaje> personajeList;

    public Pelicula(String nombre, int numdePelicula, LocalDate yearEstreno, int starPuntacion, String descripcion) {
        this.nombre = nombre;
        this.numdePelicula = numdePelicula;
        this.yearEstreno = yearEstreno;
        this.starPuntacion = starPuntacion;
        this.descripcion = descripcion;
        this.personajeList = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumdePelicula() {
        return numdePelicula;
    }

    public LocalDate getYearEstreno() {
        return yearEstreno;
    }

    public int getStarPuntacion() {
        return starPuntacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<Personaje> getPersonajeList() {
        return personajeList;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumdePelicula(int numdePelicula) {
        this.numdePelicula = numdePelicula;
    }

    public void setYearEstreno(LocalDate yearEstreno) {
        this.yearEstreno = yearEstreno;
    }

    public void setStarPuntacion(int starPuntacion) {
        this.starPuntacion = starPuntacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPersonajeList(ArrayList<Personaje> personajeList) {
        this.personajeList = personajeList;
    }
    
    public int yearPublication(){ 
    return 0;
    }
    public String mejorPersonaje(){
    return "";
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", numdePelicula=" + numdePelicula + ", yearEstreno=" + yearEstreno + ", starPuntacion=" + starPuntacion + ", descripcion=" + descripcion + '}';
    }
    
}
