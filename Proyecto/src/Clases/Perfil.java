package Clases;
import java.util.ArrayList;
import java.util.List;


public class Perfil {
    private String Nombre;
    private String Apellido;
    private int Seguidores;
    private int Seguidos;
    private ArrayList<Publicacion> pubList;  
    private List<Album> albumList;
    
    //constructor
    public Perfil(String Nombre, String Apellido, int Seguidores, int Seguidos, ArrayList<Publicacion> pubList, List<Album> albumList) {
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
    
    //Setters
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

    public void setPubList(ArrayList<Publicacion> pubList) {
        this.pubList = pubList;
    }

    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }  
    public void eliminar()//elimina de forma recursiva los subalbumes
     {
        for (Album auxAlbum:albumList) {
            auxAlbum.eliminar();
        }
        albumList.clear();
    }  
}