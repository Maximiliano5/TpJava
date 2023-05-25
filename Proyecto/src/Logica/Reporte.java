package Logica;

import Clases.Album;
import Clases.Audio;
import Clases.Imagen;
import Clases.Publicacion;
import Clases.Video;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reporte{
  
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
    private static void generarReporteAlbum(Album album, BufferedWriter writer, String fechaInicio, String fechaFin) throws IOException {
    writer.write("Álbum: " + album.getNombreAlbum() + "\n");

    int cantPublicaciones = 0;

    for (Publicacion publicacion : album.getLpubli()) {
        String fechaPublicacion = publicacion.getFecha();

        if (fechaPublicacion.compareTo(fechaInicio) >= 0 && fechaPublicacion.compareTo(fechaFin) <= 0) {
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

private static String generarReporteAlbumes(String nombreArchivo, List<Album> albumList, String fechaInicio, String fechaFin) {
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

    //pasarle la lista de album del perfil y la lista de publicaciones filtrada
    public void reportesAlbum(ArrayList<Imagen> imgList,ArrayList<Video> vidList, ArrayList<Audio> audList, int cantVideos, float promMGVideos,int cantAudios, float promMGAudios,int cantImg,float promMGImg,String fechaInicio, String fechaFin,List<Album> albumList )//agregar metodo que calcule el promedio pasandole lista de publicaciones y cant
    {
        System.out.println(generarReporteAlbumes("ReporteAlbumes.txt",albumList,fechaInicio,fechaFin)); 
    }
    public void reportesPubs(ArrayList<Imagen> imgList,ArrayList<Video> vidList, ArrayList<Audio> audList, int cantVideos, float promMGVideos,int cantAudios, float promMGAudios,int cantImg,float promMGImg )//agregar metodo que calcule el promedio pasandole lista de publicaciones y cant
    {
        System.out.println(generarReportePubs("ReportePublicaciones.txt",vidList,audList,imgList,cantVideos,promMGVideos,cantAudios,promMGAudios,cantImg,promMGImg)); 
    }
   
}