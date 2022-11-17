/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Niko
 */
public class Personaje {
    String nombrePersonaje;
    String nombreActor;
    String tipoPersonaje;
    String descripcionPersonaje;
    int puntuacionPersonaje;

    public Personaje(String nombrePersonaje, String nombreActor, String tipoPersonaje, String descripcionPersonaje, int puntuacionPersonaje) {
        this.nombrePersonaje = nombrePersonaje;
        this.nombreActor = nombreActor;
        this.tipoPersonaje = tipoPersonaje;
        this.descripcionPersonaje = descripcionPersonaje;
        this.puntuacionPersonaje = puntuacionPersonaje;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public String getTipoPersonaje() {
        return tipoPersonaje;
    }

    public String getDescripcionPersonaje() {
        return descripcionPersonaje;
    }

    public int getPuntuacionPersonaje() {
        return puntuacionPersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    public void setTipoPersonaje(String tipoPersonaje) {
        this.tipoPersonaje = tipoPersonaje;
    }

    public void setDescripcionPersonaje(String descripcionPersonaje) {
        this.descripcionPersonaje = descripcionPersonaje;
    }

    public void setPuntuacionPersonaje(int puntuacionPersonaje) {
        this.puntuacionPersonaje = puntuacionPersonaje;
    }
  public boolean mejorActor(){
  return true;
  }
  public String calidadPesonaje(){
  return "";
  }

    @Override
    public String toString() {
        return "Personaje{" + "nombrePersonaje=" + nombrePersonaje + ", nombreActor=" + nombreActor + ", tipoPersonaje=" + tipoPersonaje + ", descripcionPersonaje=" + descripcionPersonaje + ", puntuacionPersonaje=" + puntuacionPersonaje + '}';
    }
  
}
