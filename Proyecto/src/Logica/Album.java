package Logica;
import java.util.List;


public class Album {
    private String nombreAlbum;//Criterio para separar publicaciones  
    private  List<Publicacion> Lpubli;
    private  List<Album> Lalbum;
     
    //Constructor
    public Album(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

  
    //Getters
    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public List<Publicacion> getLpubli() {
        return Lpubli;
    }

    public List<Album> getLalbum() {
        return Lalbum;
    }
    
    //Setters
    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public void setLpubli(List<Publicacion> Lpubli) {
        this.Lpubli = Lpubli;
    }

    public void setLalbum(List<Album> Lalbum) {
        this.Lalbum = Lalbum;
    }   
}
