package Clases;
import Clases.Publicacion;
import java.util.List;


public class Album {
    private String nombreAlbum;//Criterio para separar publicaciones  
    private  List<Publicacion> Lpubli;
    private  List<Album> subAlbum;
     
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
        for (Album auxAlbum:subAlbum) {
            for(Publicacion auxpub:Lpubli)//dudoso esto hay que preguntar!!!
                Lpubli.remove(auxpub);
            auxAlbum.eliminar();
        }
        subAlbum.clear();
    }  
}