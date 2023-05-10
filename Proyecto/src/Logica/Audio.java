package Logica;

public class Audio extends Publicacion implements Durable{
    private int duracion; //segundos
    private int velbits; //Mbit/s
    private  int tiempoact;
    private  boolean reproduciendo;

    //constructor
    public Audio(int duracion, int velbits, int tiempoact, boolean reproduciendo, String n, int f, int cant, int e, int com) {
        super(n, f, cant, e, com);
        this.duracion = duracion;
        this.velbits = velbits;
        this.tiempoact = tiempoact;
        this.reproduciendo = reproduciendo;
    }
    
    //Metodos de la interfaz
    @Override
    public void avanzar(){}
    @Override
    public void reanudar(){}
    @Override
    public void pausar(){}

    //Getters
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
}