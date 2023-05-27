package Clases;
import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;


public class Album {
    private String nombreAlbum;//Criterio para separar publicaciones  
    private  ArrayList<Publicacion> Lpubli;
    private  ArrayList<Album> subAlbum;
     
    //Constructor
    public Album(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
        this.Lpubli = new ArrayList<Publicacion>();
        subAlbum = new ArrayList<Album>();
    }

  
    //Getters
    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public List<Publicacion> getLpubli() {
        return Lpubli;
    }

    public ArrayList<Album> getSubAlbum() {
        return subAlbum;
    }
    
    //Setters
    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public void setLpubli(ArrayList<Publicacion> Lpubli) {
        this.Lpubli = Lpubli;
    }

    public void setLalbum(ArrayList<Album> Lalbum) {
        this.subAlbum = Lalbum;
    }   
    public void agregaSubAlbum(String Nom)
    {
        Album Sub = new Album(Nom);
        subAlbum.add(Sub);
    }
    public boolean agregaPublicacion(String Nom,ArrayList<Publicacion> Public)
    {
        int i=0;
        while(i<Public.size() && (Nom.compareTo(Public.get(i).getNombre()))!=0){
           i++;
        }
        if(Nom.compareTo(Public.get(i).getNombre())==0){
          Lpubli.add(Public.get(i));
          System.out.println("se agrego la Publicacion");
          return true;
          
        }else{
          System.out.println("No existe esa Publicacion");
          return false;
        }
    }
    public void eliminarSubAlbum(String NomSub)
    {
        int i=0;
        while(i<subAlbum.size() && NomSub.compareTo(subAlbum.get(i).getNombreAlbum())!=0){
           i++;
        }
        subAlbum.remove(subAlbum.get(i));
    }
    public void eliminarPublicacion(String NomPublic)
    {
        int i = 0;
        while(i<Lpubli.size() && NomPublic.compareTo(Lpubli.get(i).getNombre())!=0){
           i++;
        }
        Lpubli.remove(Lpubli.get(i));
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
    public Album buscarAlbum(Album nodoRaiz, String nombreBuscado) {
       if (nodoRaiz.getNombreAlbum().equals(nombreBuscado)) {
           return nodoRaiz;
       }

       for (Album subAlbum : nodoRaiz.getSubAlbum()) {
           Album nodoEncontrado = buscarAlbum(subAlbum, nombreBuscado);
           if (nodoEncontrado != null) {
               return nodoEncontrado;
           }
       }

       return null; // El álbum no se encontró en la estructura anidada
    }
}