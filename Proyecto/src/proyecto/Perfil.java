package proyecto;
import java.util.List;

public class Perfil {
    private String Nombre;
    private String Apellido;
    private int Seguidores;
    private int Seguidos;
    private int Publicaciones;
    private List<Publicacion> PubliMap;  
    private List<Album> AlbuMap;
    
    //constructor
    public Perfil(String Nombre, String Apellido, int Seguidores, int Seguidos, int Publicaciones, List<Publicacion> PubliMap, List<Album> AlbuMap) {
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
}