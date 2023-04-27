
package proyecto;

import java.util.ArrayList;

public class Video extends Publicacion implements Durable
{
private int duracion;//segundos
private int resolucion;
private int fps;
private  int tiempoact;
private  boolean reproduciendo;

    public Video(String n, int f, int cant, ArrayList e, ArrayList com) {
        super(n, f, cant, e, com);
    }

    //constructor
    public Video(int duracion, int resolucion, int fps, int tiempoact, boolean reproduciendo, String n, int f, int cant, ArrayList e, ArrayList com) {
        super(n, f, cant, e, com);
        this.duracion = duracion;
        this.resolucion = resolucion;
        this.fps = fps;
        this.tiempoact = 0;
        this.reproduciendo = reproduciendo;
    }


    public void avanzar(){
        tiempoact+=5;}
    
    public void pausar(){
        reproduciendo=false;}
    
    public void renaudar(){
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
    
    
    
}
