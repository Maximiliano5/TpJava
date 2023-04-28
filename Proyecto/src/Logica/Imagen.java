package Logica;

import java.util.ArrayList;

public class Imagen extends Publicacion implements Filtrable{
    private int Resolucion;
    private int Alto;
    private int Ancho;
    private Boolean Filtro;

    //constructor
    public Imagen(int Resolucion, int Alto, int Ancho, Boolean Filtro, String n, int f, int cant, ArrayList e, ArrayList com) {    
        super(n, f, cant, e, com);
        this.Resolucion = Resolucion;
        this.Alto = Alto;
        this.Ancho = Ancho;
        this.Filtro = Filtro;
    }

    //metodo de la interfaz
    @Override
    public void Filtro() {
        //hay que redefinir el metodo
    }

    //getters
    public int getResolucion() {
        return Resolucion;
    }

    public int getAlto() {
        return Alto;
    }

    public int getAncho() {
        return Ancho;
    }

    public Boolean getFiltro() {
        return Filtro;
    }
    
}
