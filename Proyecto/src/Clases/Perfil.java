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
                imgList.add((Imagen)auxp);
            else if(auxp instanceof Audio)
                audList.add((Audio)auxp);
            else
                vidList.add((Video)auxp);
        }
    }
     private static float calcularPromedioLikes(List<? extends Publicacion> listaPublicaciones,int cantidadPubs) {
        if (listaPublicaciones.isEmpty()) {
            return 0;
        }

        int totalLikes = 0;
        for (Publicacion publicacion : listaPublicaciones) {
            totalLikes += publicacion.getCantMG();
        }

        return (float) totalLikes / cantidadPubs;
    }
     private static void escribirPublicaciones(BufferedWriter writer, List<? extends Publicacion> listaPublicaciones)
        throws IOException {
    if (listaPublicaciones.isEmpty()) {
        writer.write("No hay publicaciones\n");
    } else {
        for (int i = 0; i < listaPublicaciones.size(); i++) {
            writer.write("Publicación " + (i + 1) + ": " + listaPublicaciones.get(i).getNombre()+"\n");
        }
        writer.write("\n");
    }
}
     private static String generarReportePubs(String nombreArchivo, List<Video> listaVideos, List<Audio> listaAudios,
        List<Imagen> listaImagenes,int cantVideos, float promedioLikesVideos,int cantAudios, float promedioLikesAudios,int cantImagenes, float promedioLikesImagenes) {
     cantVideos = listaVideos.size();
     cantAudios = listaAudios.size();
     cantImagenes = listaImagenes.size();
     promedioLikesVideos=calcularPromedioLikes(listaVideos,cantVideos);
     promedioLikesAudios=calcularPromedioLikes(listaAudios,cantAudios);
     promedioLikesImagenes=calcularPromedioLikes(listaImagenes,cantImagenes);
    
     StringBuilder reporte = new StringBuilder();

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
        writer.write("Reporte de Publicaciones\n\n");

        writer.write("Videos:\n");
        escribirPublicaciones(writer, listaVideos);
        writer.write("Cantidad de videos: " + cantVideos + "\n");
        writer.write("Promedio de likes en videos: " + promedioLikesVideos + "\n\n");

        writer.write("Audios:\n");
        escribirPublicaciones(writer, listaAudios);
        writer.write("Cantidad de audios: " + cantAudios + "\n");
        writer.write("Promedio de likes en audios: " + promedioLikesAudios + "\n\n");

        writer.write("Imágenes:\n");
        escribirPublicaciones(writer, listaImagenes);
        writer.write("Cantidad de imágenes: " + cantImagenes + "\n");
        writer.write("Promedio de likes en imágenes: " + promedioLikesImagenes + "\n");

        reporte.append("Se generó el reporte en el archivo: ").append(nombreArchivo);
    } catch (IOException e) {
        reporte.append("Error al generar el reporte: ").append(e.getMessage());
    }

    return reporte.toString();
}
    private static void generarReporteAlbum(Album album, BufferedWriter writer, long fechaInicio, long fechaFin) throws IOException {
    writer.write("Álbum: " + album.getNombreAlbum() + "\n");

    int cantPublicaciones = 0;

    for (Publicacion publicacion : album.getLpubli()) {
        long fechaPublicacion = publicacion.getFecha();

        if (fechaPublicacion >= fechaInicio && fechaPublicacion <= fechaFin) {
            cantPublicaciones++;
            int cantComentarios = publicacion.getComentarios();

            writer.write("Publicación: " + publicacion.getNombre() + "\n");
            writer.write("Cantidad de comentarios: " + cantComentarios + "\n\n");
        }
    }

    writer.write("Cantidad de publicaciones: " + cantPublicaciones + "\n\n");

    List<Album> subAlbums = album.getAlbumList();
    Collections.sort(subAlbums, (a1, a2) -> a1.getNombreAlbum().compareToIgnoreCase(a2.getNombreAlbum()));

    for (Album subAlbum : subAlbums) {
        generarReporteAlbum(subAlbum, writer, fechaInicio, fechaFin);
    }
}

private static String generarReporteAlbumes(String nombreArchivo, List<Album> albumList, long fechaInicio, long fechaFin) {
    StringBuilder reporte = new StringBuilder();

    try {
        // Verificar si el archivo ya existe y eliminarlo si es necesario
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            archivo.delete();
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
        writer.write("Reporte de Álbumes\n\n");

        // Ordenar los álbumes principales alfabéticamente
        Collections.sort(albumList, (a1, a2) -> a1.getNombreAlbum().compareToIgnoreCase(a2.getNombreAlbum()));

        for (Album album : albumList) {
            generarReporteAlbum(album, writer, fechaInicio, fechaFin);
        }

        writer.close();

        reporte.append("Se generó el reporte de álbumes en el archivo: ").append(nombreArchivo);
    } catch (IOException e) {
        reporte.append("Error al generar el reporte de álbumes: ").append(e.getMessage());
    }

    return reporte.toString();
}


    public void reportes(ArrayList<Imagen> imgList,ArrayList<Video> vidList, ArrayList<Audio> audList, int cantVideos, float promMGVideos,int cantAudios, float promMGAudios,int cantImg,float promMGImg,long fechaInicio, long fechaFin)//agregar metodo que calcule el promedio pasandole lista de publicaciones y cant
    {
        filtraPubli(imgList,vidList, audList);
        System.out.println(generarReportePubs("ReportePublicaciones.txt",vidList,audList,imgList,cantVideos,promMGVideos,cantAudios,promMGAudios,cantImg,promMGImg));
        System.out.println(generarReporteAlbumes("ReporteAlbumes.txt",albumList,fechaInicio,fechaFin)); 
    }
}