
package proyecto;

import java.util.ArrayList;

public class Audio extends Publicacion implements Durable{
    private int duracion; //segundos
    private int velbits; //Mbit/s
    private boolean avanzar; //Sí o no
    private boolean reanudar; //Sí o no
    private boolean detener; //Sí o no

    //constructor

    public Audio(int duracion, int velbits, boolean avanzar, boolean reanudar, boolean detener, String n, int f, int cant, ArrayList e, ArrayList com) {
        super(n, f, cant, e, com);
        this.duracion = duracion;
        this.velbits = velbits;
        this.avanzar = avanzar;
        this.reanudar = reanudar;
        this.detener = detener;
    }
       

    //Metodos
    public int obtDuracion(){
        return duracion;
    }
    public int obtVelbits(){
        return velbits;
    }
    public boolean obtAvanzar(){
        return avanzar;
    }
    public boolean obtRenaudar(){
        return reanudar;
    }
    public boolean obtDetener(){
        return detener;
    }
    public void avanzar(){}
    public void reanudar(){}
    public void pausar(){}

}
