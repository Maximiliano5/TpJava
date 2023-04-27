
package proyecto;

import java.util.*;
public class Audio extends Publicacion implements durable{
    private int duracion; //segundos
    private int velbits; //Mbit/s
    private  int tiempoact;
    private  boolean reproduciendo;

    //constructor
<<<<<<< HEAD
    public Audio(int duracion, int velbits, boolean avanzar, boolean reanudar, boolean detener, String n, int f, int cant, ArrayList e, ArrayList com) {
=======
    public Audio(int duracion, int velbits, int tiempoact, boolean reproduciendo, String n, int f, int cant, ArrayList e, ArrayList com) {
>>>>>>> a3b5ecdf644ca96e440a9767510cc22013758c6b
        super(n, f, cant, e, com);
        this.duracion = duracion;
        this.velbits = velbits;
        this.tiempoact = tiempoact;
        this.reproduciendo = reproduciendo;
    }

<<<<<<< HEAD
    //Getters
    public int getDuracion() {
        return duracion;
    }

    public int getVelbits() {
        return velbits;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public boolean isReanudar() {
        return reanudar;
    }

    public boolean isDetener() {
        return detener;
    }
    
    //Metodos
    public void avanzar(){}
    public void reanudar(){}
    public void pausar(){}
=======
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
>>>>>>> a3b5ecdf644ca96e440a9767510cc22013758c6b

    public void avanzar(){}
    public void renaudar(){}
    public void pausar(){}
