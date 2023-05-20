package Persistencia;

import Clases.Publicacion;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public class Carga {
    private SAXParserFactory saxParserFactory;
    private SAXParser saxParser;
    private File Arch;
    private Handler Version;
    private TreeSet<Publicacion> persOrd;


    public Carga(){}
    
    public void CargaDatos(ArrayList<Publicacion> Lista) throws ParserConfigurationException, SAXException, IOException{
        saxParserFactory = SAXParserFactory.newInstance();
        saxParser = saxParserFactory.newSAXParser();
        Arch = new File("datos.xml");
        Version = new Handler();
        saxParser.parse(Arch,Version);
        Lista.addAll(Version.getPublicaciones());
        
    }
    
    public void OrdenaDatos(ArrayList<Publicacion> Lista){
       persOrd = new TreeSet<>(Comparator.comparing(Publicacion::getNombre));
       persOrd.addAll(Lista);
       Lista.clear();
       Lista.addAll(persOrd);
    }
}
