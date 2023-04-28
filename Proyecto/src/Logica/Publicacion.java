
package Logica;
import java.util.*;

public class Publicacion {
    private String nombre;
    private int fecha; //aaaammdd
    private int cantMG;
    private ArrayList<String> etiquetas;
    private ArrayList<String> comentarios;

    //Constructor
    public Publicacion(String n, int f, int cant, ArrayList e, ArrayList com){
        nombre=n;
        fecha=f;
        cantMG=cant;
        etiquetas=e;
        comentarios=com;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getFecha() {
        return fecha;
    }

    public int getCantMG() {
        return cantMG;
    }

    public ArrayList<String> getEtiquetas() {
        return etiquetas;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }
}

