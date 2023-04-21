package proyecto;
import java.util.TreeMap;

public class Perfil {
    private String Nombre;
    private int Seguidores;
    private int Seguidos;
    private int Publicaciones;
    private TreeMap<Integer, Publicacion> treeMap;  

    public Perfil(String Nombre, int Seguidores, int Seguidos, int Publicaciones, TreeMap<Integer, Publicacion> treeMap) {
        this.Nombre = Nombre;
        this.Seguidores = Seguidores;
        this.Seguidos = Seguidos;
        this.Publicaciones = Publicaciones;
        this.treeMap = treeMap;
    }
}