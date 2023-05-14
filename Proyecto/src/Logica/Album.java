package Logica;
import java.util.List;


public class Album {
    private String nombreAlbum;//Criterio para separar publicaciones  
    private  List<Publicacion> Lpubli;
<<<<<<< HEAD:Proyecto/src/Logica/Album.java
    private  List<Album> Lalbum;
=======
    private  List<Album> subAlbum;
>>>>>>> 6f1a9af5843337788159ea1c4acd7010bfc9e3cf:Proyecto/src/proyecto/Album.java
     
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
        return subAlbum;
    }
    
    //Setters
    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public void setLpubli(List<Publicacion> Lpubli) {
        this.Lpubli = Lpubli;
    }

    public void setLalbum(List<Album> Lalbum) {
<<<<<<< HEAD:Proyecto/src/Logica/Album.java
        this.Lalbum = Lalbum;
    }   
=======
        this.subAlbum = Lalbum;
    }   
    public void agregaSubAlbum(Album Album)
    {
        subAlbum.add(Album);
    }
    public void agregaPublicacion(Publicacion p)
    {
        Lpubli.add(p);  
    }
    public void eliminarSubAlbum(Album a)
    {
        subAlbum.remove(a);
    }
    public void eliminarPublicacion(Publicacion p)
    {
        Lpubli.remove(p);
    }
     public void eliminar()//elimina de forma recursiva los subalbumes
     {
        for (Album auxAlbum : subAlbum) {
            auxAlbum.eliminar();
        }
        subAlbum.clear();
    }
    
>>>>>>> 6f1a9af5843337788159ea1c4acd7010bfc9e3cf:Proyecto/src/proyecto/Album.java
}
