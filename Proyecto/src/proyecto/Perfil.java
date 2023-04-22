package proyecto;
import java.util.TreeMap;

public class Perfil {
    private String Nombre;
    private String Apellido;
    private int Seguidores;
    private int Seguidos;
    private int Publicaciones;
    private TreeMap<Integer, Publicacion> PubliMap;  
    private TreeMap<Integer, Album> AlbuMap;

    public Perfil(String Nombre, String Apellido, int Seguidores, int Seguidos, int Publicaciones, TreeMap<Integer, Publicacion> PubliMap, TreeMap<Integer, Album> AlbuMap) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Seguidores = Seguidores;
        this.Seguidos = Seguidos;
        this.Publicaciones = Publicaciones;
        this.PubliMap = PubliMap;
        this.AlbuMap = AlbuMap;
    }
    
}