<<<<<<< HEAD:Proyecto/src/Logica/Video.java
package Logica;

public class Video extends Publicacion implements Durable{
   private int duracion;//segundos
   private int resolucion;
   private int fps;
   private  int tiempoact;
   private  boolean reproduciendo;


    //constructor
    public Video(int duracion, int resolucion, int fps, int tiempoact, boolean reproduciendo, String n, long f, int cant, int e, int com) {
        super(n, f, cant, e, com);
        this.duracion = duracion;
        this.resolucion = resolucion;
        this.fps = fps;
        this.tiempoact = 0;
        this.reproduciendo = reproduciendo;
    }

   //Metodos de la interfaz
   @Override
    public void avanzar(){
        tiempoact+=5;}
    
   @Override
    public void pausar(){
        reproduciendo=false;}
    
   @Override
    public void reanudar(){
        reproduciendo=true;}

    //getters
    public int getDuracion() {
        return duracion;
    }

    public int getResolucion() {
        return resolucion;
    }

    public int getFps() {
        return fps;
    }

    public int getTiempoact() {
        return tiempoact;
    }

    public boolean isReproduciendo() {
        return reproduciendo;
    }
    //setters
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    public void setTiempoact(int tiempoact) {
        this.tiempoact = tiempoact;
    }

    public void setReproduciendo(boolean reproduciendo) {
        this.reproduciendo = reproduciendo;
    }   
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Pc
 */
public class Video {
    
>>>>>>> 6f1a9af5843337788159ea1c4acd7010bfc9e3cf:Proyecto/src/proyecto/Video.java
}
