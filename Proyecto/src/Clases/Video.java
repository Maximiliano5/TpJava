package Clases;

import Interfaces.Durable;
import Interfaces.Filtrable;

public class Video extends Publicacion implements Durable,Filtrable{
   private int duracion;//segundos
   private int resolucion;
   private int fps;
   private  int tiempoact;
   private  boolean reproduciendo;
   private boolean Filtro;


    //constructor
    public Video(int duracion, int resolucion, int fps, int tiempoact, boolean reproduciendo, boolean Filtro, String n, String f, int cant, int e, int com) {
        super(n, f, cant, e, com);
        this.duracion = duracion;
        this.resolucion = resolucion;
        this.fps = fps;
        this.tiempoact = tiempoact;
        this.reproduciendo = reproduciendo;
        this.Filtro = Filtro;
    }

    //Metodos de la interfaz
    @Override
    public void avanzar(int seg) {
        if (tiempoact+seg < duracion){
            tiempoact=tiempoact+seg;
        } else
        {
            tiempoact=duracion;
        }
    }
    
   @Override
    public void pausar(boolean res){ //respuesta si poner filtro: sí o no
        if (res){
            reproduciendo=true;
        }else{
            reproduciendo=false;
        }
    }
    
   @Override
    public void reanudar(int seg){
        if (seg < tiempoact){
            tiempoact=tiempoact-seg;
        }else{
           tiempoact=0;
        }
    }
   @Override
    public void Filtro(boolean res){ //respuesta si poner filtro: sí o no
        if (res){
            Filtro=true;
        } else{
            Filtro=false;
        }
    }

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

    public boolean isFiltro() {
        return Filtro;
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

    public void setFiltro(boolean Filtro) {
        this.Filtro = Filtro;
    }  
    @Override
    public String muestra(){
        return "Video{" +
                "duracion=" + duracion +
                ", resolucion=" + resolucion +
                ", fps=" + fps +
                ", tiempoAct=" + tiempoact +
                ", reproduciendo=" + reproduciendo +
                ", filtro=" + Filtro +
                '}';      
    }
}
