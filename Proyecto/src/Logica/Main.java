package Logica;

import Datos.Handler;
import java.io.File;
import java.io.IOException;
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
    }
    
}
