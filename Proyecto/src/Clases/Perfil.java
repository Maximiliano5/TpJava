package Clases;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Perfil {
    private String Nombre;
    private String Apellido;
    private int Seguidores;
    private int Seguidos;
    private int Publicaciones;
    private ArrayList<Publicacion> pubList;  
    private ArrayList<Album> albumList;
    
    //constructor

    public Perfil(String Nombre, String Apellido, int Seguidores, int Seguidos, ArrayList<Publicacion> pubList, ArrayList<Album> albumList) {
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

    public ArrayList<Publicacion> getPubList() {
        return pubList;
    }

    public ArrayList<Album> getAlbumList() {
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

    public void setAlbumList(ArrayList<Album> albumList) {
        this.albumList = albumList;
    }  
   // public void eliminarAlbum(String nombre) {
   //     Album albumEliminar = buscarAlbum(this, nombre);
   //     if (albumEliminar != null) {
   //         eliminarAlbumRecursivo(albumEliminar);
   //     }
   // }

    private void eliminarAlbumRecursivo(Album album) {
        pubList.removeAll(album.getLpubli());
        for (Album subAlbum : album.getSubAlbum()) {
            eliminarAlbumRecursivo(subAlbum);
        }
        albumList.remove(album);
    }
    public void filtraPubli(ArrayList<Imagen> imgList,ArrayList<Video> vidList, ArrayList<Audio> audList)
    {
        for(Publicacion auxp:pubList)
        {
            if(auxp instanceof Imagen)
                imgList.add((Imagen)auxp);
            else if(auxp instanceof Audio)
                audList.add((Audio)auxp);
            else
                vidList.add((Video)auxp);
        }
        Collections.sort(imgList, Collections.reverseOrder(Comparator.comparingInt(Imagen::getCantMG)));
        Collections.sort(audList, Collections.reverseOrder(Comparator.comparingInt(Audio::getCantMG)));
        Collections.sort(vidList, Collections.reverseOrder(Comparator.comparingInt(Video::getCantMG)));
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
    public Publicacion BuscaPublicacion(String Nom){
       int i=0;
       while(i<pubList.size() && (Nom.compareTo(pubList.get(i).getNombre()))!=0){
         i++;
       }
       if(i<pubList.size())
         return pubList.get(i);
       else
          return null; 
    }

  
     
}
