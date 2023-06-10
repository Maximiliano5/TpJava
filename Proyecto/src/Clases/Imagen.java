package Clases;

import Interfaces.Filtrable;
import Logica.Main.Filtro;

public class Imagen extends Publicacion implements Filtrable{
    private int Resolucion;
    private int Alto;
    private int Ancho;
    private Boolean Filtro;
    private Filtro filtroPubli;  //enum

    //constructor
    public Imagen(int Resolucion, int Alto, int Ancho, Boolean Filtro, String n, String f, int cant, int e, int com) {
        super(n, f, cant, e, com);
        this.Resolucion = Resolucion;
        this.Alto = Alto;
        this.Ancho = Ancho;
        this.Filtro = Filtro;
    }
    


    //metodo de la interfaz
    @Override
    public boolean AplicarFiltro(Filtro F) //respuesta si poner filtro: sí o no
    {
      if(Filtro){
        filtroPubli = F;
        return true;
      }else
          return false;
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
    
    //Setters
    public void setResolucion(int Resolucion) {
        this.Resolucion = Resolucion;
    }

    public void setAlto(int Alto) {
        this.Alto = Alto;
    }

    public void setAncho(int Ancho) {
        this.Ancho = Ancho;
    }

    public void setFiltro(Boolean Filtro) {
        this.Filtro = Filtro;
    } 
    @Override
    public String muestra()
    {
        return "Imagen{" +
                "resolucion=" + Resolucion +
                ", alto=" + Alto +
                ", ancho=" + Ancho +
                ", filtro=" + filtroPubli +
                '}';
    }
}
