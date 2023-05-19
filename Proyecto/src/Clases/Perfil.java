package Clases;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


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
    public void filtraPubli(ArrayList<Imagen> imgList,ArrayList<Video> vidList, ArrayList<Audio> audList)
    {
        TreeSet<Publicacion> mgDescendente = new TreeSet<>(Comparator.comparingInt(Publicacion::getCantMG).reversed());
        mgDescendente.addAll(pubList);
        pubList.clear();
        pubList.addAll(mgDescendente);
        for(Publicacion auxp:pubList)
        {
            if(auxp instanceof Imagen)
                imgList.add(auxp);
            else if(auxp instanceof Audio)
                audList.add(auxp);
            else
                vidList.add(auxp);
        }
    }
    public void reportes(ArrayList<Imagen> imgList,ArrayList<Video> vidList, ArrayList<Audio> audList, int cantVideos, float promMGVideos,int cantAudios, float PromMGAudios,int cantImg,float PromMGImg)//agregar metodo que calcule el promedio pasandole lista de publicacoines y cant
    {
        filtraPubli(ArrayList<Imagen> imgList,ArrayList<Video> vidList, ArrayList<Audio> audList);
        cantVideos=vidList.size();
        cantAudios=audList.size();
        cantImg=imgList.size();
        float sumamg;
        sumamg=0;
        for(Imagen auxImg:imgList){
                suma+=auxImg.getCantMG();}
        promMGImg=suma/cantImg;
        suma=0;
        for(Audio auxAud:audList){
                suma+=auxAud.getCantMG();}
        promMGAudios=suma/cantAudios;
        suma=0;
        for(Video auxVid:vidList){
            suma+=auxVid.getCantMG();}
        promMGVideos=suma/cantVideos;
    }
}