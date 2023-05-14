
package proyecto;

public class Audio extends Publicacion implements durable{
    private int duracion; //segundos
    private int velbits; //Mbit/s
    private boolean avanzar; //Sí o no
    private boolean renaudar; //Sí o no
    private boolean detener; //Sí o no

    //constructor
    public Audio(int d, int v, boolean a, boolean det){
        duracion=d;
        velbits=v;
        avanzar=a;
        detener=det;
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
        return renaudar;
    }
    public boolean obtDetener(){
        return detener;
    }
    public void avanzar(){}
    public void renaudar(){}
    public void pausar(){}

}
