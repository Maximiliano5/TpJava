package Logica;

import Clases.Album;
import Clases.Audio;
import Clases.Imagen;
import Clases.Perfil;
import Clases.Publicacion;
import Clases.Video;
import Persistencia.Handler;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;


public class Main {
    public static ArrayList<Publicacion> Lista;
    public static void CargaDatos() throws SAXException, IOException, ParserConfigurationException{
       SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
       SAXParser saxParser = saxParserFactory.newSAXParser();
       File Arch = new File("datos.xml");
       Handler Version = new Handler();
       saxParser.parse(Arch,Version);
       Lista = Version.getPublicaciones();   
    }
    public static void OrdenaDatos(){
        TreeSet<Publicacion> personasOrdenadas = new TreeSet<>(Comparator.comparing(Publicacion::getNombre));
        personasOrdenadas.addAll(Lista);
        Lista.clear();
        Lista.addAll(personasOrdenadas);
        
    }

    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException{
       Lista = new ArrayList<>();
       CargaDatos();
       OrdenaDatos();
       
       ArrayList<Album> A = null;
       Perfil objPerfil = new Perfil("Pepe","Gomez",1000,900,Lista,A);//Crea Objeto Perfil y carga el constructor con el Arraylist ya ordenado
       
       
       for(int i=0; i<Lista.size(); i++){
         System.out.println("Nombre: " + Lista.get(i).getNombre());
         System.out.println("Fecha: "+ Lista.get(i).getFecha());
         System.out.println("Megustas: "+Lista.get(i).getCantMG());
         System.out.println("Comentarios: "+ Lista.get(i).getComentarios());
         System.out.println("Etiquetas: "+Lista.get(i).getEtiquetas());
         if(Lista.get(i) instanceof Imagen){
           System.out.println("Resolucion: "+((Imagen) Lista.get(i)).getResolucion());
           System.out.println("Alto: "+((Imagen) Lista.get(i)).getAlto());
           System.out.println("Ancho: "+((Imagen) Lista.get(i)).getAncho());
           System.out.println("Filtro: "+((Imagen) Lista.get(i)).getFiltro());
         }else if(Lista.get(i) instanceof Video){
                 System.out.println("Duracion: "+((Video) Lista.get(i)).getDuracion());
                 System.out.println("Resolucion: "+((Video) Lista.get(i)).getResolucion());
                 System.out.println("Fps: "+((Video) Lista.get(i)).getFps());
                 System.out.println("Filtro: "+((Video) Lista.get(i)).isFiltro());
               }else if(Lista.get(i) instanceof Audio){
                       System.out.println("Duracion: "+((Audio) Lista.get(i)).getDuracion());
                       System.out.println("Velocidad: "+((Audio) Lista.get(i)).getVelbits());
               }
         System.out.println();
         System.out.println();
       }
    }
    
}