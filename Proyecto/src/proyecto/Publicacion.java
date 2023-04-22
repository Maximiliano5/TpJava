
package proyecto;
import java.util.*;

public class Publicacion {
    private String nombre;
    private int fecha; //aaaammdd
    private int cantMG;
    private ArrayList<String> etiquetas = new ArrayList<String>(50);
    private ArrayList<String> comentarios = new ArrayList<String>(50);

    //Constructor
    public Publicacion(String n, int f, int cant, ArrayList e, ArrayList com){
        nombre=n;
        fecha=f;
        cantMG=cant;
        etiquetas=e;
        comentarios=com;
    }

    //Metodos
    public String obtNombre(){
        return nombre;
    }
    public int obtFecha(){
        return fecha;
    }
    public int obtCantMG(){
        return cantMG;
    }
    public ArrayList obtEtiquetas(){
        return etiquetas;
    }
    public ArrayList obtComentarios(){
        return comentarios;
    }
}

