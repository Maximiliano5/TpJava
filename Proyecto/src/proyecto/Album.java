
package proyecto;

import java.util.List;



public class Album {
    
    private String nombreAlbum;//Criterio para separar publicaciones  
    private  List<Publicacion> Lalbum;

    public Album(String nombreAlbum, List<Publicacion> Lalbum) {
        this.nombreAlbum = nombreAlbum;
        this.Lalbum = Lalbum;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public List<Publicacion> getLalbum() {
        return Lalbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public void setLalbum(List<Publicacion> Lalbum) {
        this.Lalbum = Lalbum;
    }

    

  
    
    
    
}
