package Clases;

import Interfaces.Durable;

public class Audio extends Publicacion implements Durable{
    private int duracion; //segundos
    private int velbits; //Mbit/s
    private  int tiempoact;
    private  boolean reproduciendo;

    //constructor
    public Audio(int duracion, int velbits, int tiempoact, boolean reproduciendo, String n, long f, int cant, int e, int com) {
        super(n, f, cant, e, com);
        this.duracion = duracion;
        this.velbits = velbits;
        this.tiempoact = tiempoact;
        this.reproduciendo = reproduciendo;
    }
    
    //Metodos de la interfaz
    @Override
    public void avanzar(int seg)
    {
        if (tiempoact+seg < duracion){
            tiempoact=tiempoact+seg;
        } else
        {
            tiempoact=duracion;
        }
    }
    @Override
    public void reanudar(int seg)
    {
        if (seg < tiempoact){
            tiempoact=tiempoact-seg;
        } else
        {
            tiempoact=0;
        }
    }
    @Override
    public void pausar(boolean res){ //respuesta si poner filtro: sí o no
        if (res){
            reproduciendo=true;
        } else{
            reproduciendo=false;
        }
    }

    //Getters
    public int getDuracion(){
        return duracion;
    }
    public int getVelbits(){
        return velbits;
    }
    public int getTiempoact(){ 
        return tiempoact; 
    }
    
    public boolean isReproduciendo(){
        return reproduciendo;
    }
    
    //Setters
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setVelbits(int velbits) {
        this.velbits = velbits;
    }

    public void setTiempoact(int tiempoact) {
        this.tiempoact = tiempoact;
    }

    public void setReproduciendo(boolean reproduciendo) {
        this.reproduciendo = reproduciendo;
    }    
}
