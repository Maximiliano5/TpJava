package Logica;

import java.util.*;
public class Audio extends Publicacion implements durable{
    private int duracion; //segundos
    private int velbits; //Mbit/s
    private  int tiempoact;
    private  boolean reproduciendo;

    //constructor
    public Audio(int duracion, int velbits, int tiempoact, boolean reproduciendo, String n, int f, int cant, ArrayList e, ArrayList com) {
        super(n, f, cant, e, com);
        this.duracion = duracion;
        this.velbits = velbits;
        this.tiempoact = tiempoact;
        this.reproduciendo = reproduciendo;
    }

    //Metodos
    public int getDuracion(){
        return duracion;
    }
    public int getVelbits(){
        return velbits;
    }
    public int getTiempoact(){ 
        return tiempoact; }
    
    public boolean isReproduciendo(){
        return reproduciendo;
    }

    public void avanzar(){}
    public void renaudar(){}
    public void pausar(){}