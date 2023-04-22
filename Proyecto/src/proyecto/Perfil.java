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
    
    //constructor
    public Perfil(String Nombre, String Apellido, int Seguidores, int Seguidos, int Publicaciones, TreeMap<Integer, Publicacion> PubliMap, TreeMap<Integer, Album> AlbuMap) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Seguidores = Seguidores;
        this.Seguidos = Seguidos;
        this.Publicaciones = Publicaciones;
        this.PubliMap = PubliMap;
        this.AlbuMap = AlbuMap;
    }
    
    //getters
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getSeguidores() {
        return Seguidores;
    }

    public int getSeguidos() {
        return Seguidos;
    }

    public int getPublicaciones() {
        return Publicaciones;
    }
    
    //setters
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setSeguidores(int Seguidores) {
        this.Seguidores = Seguidores;
    }

    public void setSeguidos(int Seguidos) {
        this.Seguidos = Seguidos;
    }

    public void setPublicaciones(int Publicaciones) {
        this.Publicaciones = Publicaciones;
    } 
}