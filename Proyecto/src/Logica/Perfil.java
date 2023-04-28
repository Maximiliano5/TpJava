package Logica;
import java.util.List;

public class Perfil {
    private String Nombre;
    private String Apellido;
    private int Seguidores;
    private int Seguidos;
    private List<Publicacion> pubList;  
    private List<Album> albumList;
    
    //constructor
    public Perfil(String Nombre, String Apellido, int Seguidores, int Seguidos, List<Publicacion> pubList, List<Album> albumList) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Seguidores = Seguidores;
        this.Seguidos = Seguidos;
        this.pubList = pubList;
        this.albumList = albumList;
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

    public List<Publicacion> getPubList() {
        return pubList;
    }

    public List<Album> getAlbumList() {
        return albumList;
    } 
}