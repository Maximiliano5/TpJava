package Clases;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;

public class Perfil {
    private String Nombre;
    private String Apellido;
    private int Seguidores;
    private int Seguidos;
    private int Publicaciones;
    private ArrayList<Publicacion> pubList;  
    private List<Album> albumList;
    
    //constructor

    public Perfil(String Nombre, String Apellido, int Seguidores, int Seguidos, ArrayList<Publicacion> pubList, List<Album> albumList) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Seguidores = Seguidores;
        this.Seguidos = Seguidos;
        this.Publicaciones = pubList.size();
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

    public int getPublicaciones() {
        return Publicaciones;
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
    public void filtraPubli(ArrayList<Imagen> imgList,ArrayList<Video> vidList, ArrayList<Audio> audList)
    {
        TreeSet<Publicacion> mgDescendente = new TreeSet<>(Comparator.comparingInt(Publicacion::getCantMG).reversed());
        mgDescendente.addAll(pubList);
        pubList.clear();
        pubList.addAll(mgDescendente);
        for(Publicacion auxp:pubList)
        {
            if(auxp instanceof Imagen)
                imgList.add((Imagen)auxp);
            else if(auxp instanceof Audio)
                audList.add((Audio)auxp);
            else
                vidList.add((Video)auxp);
        }
    }
     public float calcularPromedioLikes(List<? extends Publicacion> listaPublicaciones,int cantidadPubs) {
        if (listaPublicaciones.isEmpty()) {
            return 0;
        }

        int totalLikes = 0;
        for (Publicacion publicacion : listaPublicaciones) {
            totalLikes += publicacion.getCantMG();
        }

        return (float) totalLikes / cantidadPubs;
    }
    
    public ArrayList<Publicacion> masComentados(){
        ArrayList<Publicacion> lista =new ArrayList<>();
        for (Publicacion pubaux: pubList){
            if (pubaux.getComentarios()>100){
                lista.add(pubaux);
            }
        }
        return lista;
    }
     
}
