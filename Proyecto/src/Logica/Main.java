package Logica;

import Datos.Handler;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;


public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
       SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
       SAXParser saxParser = saxParserFactory.newSAXParser();
       File Arch = new File("datos.xml");
       Handler Version = new Handler();
       saxParser.parse(Arch,Version);
       ArrayList<Publicacion> P = Version.getPublicaciones(); //El arraylist con los objetos esta en el arraylist "P"
       ArrayList<Album> A = null;
       Perfil objPerfil = new Perfil("Pepe","Coin",1000,900,P,A);
       
       //for(int i=0; i<P.size();i++){
       //  System.out.println(P.get(i).getNombre());
       //  System.out.println(P.get(i).getFecha());
       //  System.out.println(P.get(i).getCantMG());
       //  System.out.println(P.get(i).getComentarios());
       //  System.out.println(P.get(i).getEtiquetas());
       //}
    }
    
}
