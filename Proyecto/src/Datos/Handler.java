package Datos;

import Logica.Audio;
import Logica.Imagen;
import Logica.Publicacion;
import Logica.Video;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler{
    private ArrayList<Publicacion> Publicaciones = new ArrayList();
    private Publicacion Publica;
    private StringBuilder Buffer = new StringBuilder();

    public ArrayList<Publicacion> getPublicaciones() {
        return (ArrayList<Publicacion>) Publicaciones;
    }
    
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length); //To change body of generated methods, choose Tools | Templates.
        Buffer.append(ch,start,length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName); //To change body of generated methods, choose Tools | Templates.
        switch(qName){
            case "Nombre":
                Publica.setNombre(Buffer.toString());
                break;
            case "Fecha":
                Publica.setFecha(Long.parseLong(Buffer.toString()));
                break;
            case "CantMG":
                Publica.setCantMG(Integer.parseInt(Buffer.toString()));
                break;
            case "Etiquetas":
                Publica.setEtiquetas(Integer.parseInt(Buffer.toString()));
                break;
            case "Comentarios":
                Publica.setComentarios(Integer.parseInt(Buffer.toString()));
                break;
            case "Duracion":
                Publica.setDuracion(Integer.parseInt(Buffer.toString()));
                break;
            case "Resolucion":
                Publica.setResolucion(Integer.parseInt(Buffer.toString()));
                break;
            case "Fps":
                Publica.setFps(Integer.parseInt(Buffer.toString()));
                break;
            case "Alto":
                Publica.SetAlto(Integer.parseInt(Buffer.toString()));
                break;
            case "Ancho":
                Publica.setAncho(Integer.parseInt(Buffer.toString()));
                break;
            case "Filtro":
                Publica.setFiltro(Boolean.parseBoolean(Buffer.toString()));
                break;
            case "Velocidad":
                Publica.setVelocidad(Integer.parseInt(Buffer.toString()));
                break;  
        }
        Buffer.setLength(0);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes); //To change body of generated methods, choose Tools | Templates.
        switch(qName){
            case "video":
                Publica = new Video(0,0,0,0,false,"sin",0,0,0,0);
                Publicaciones.add(Publica);
                break;
            case "Imagen":
                Publica = new Imagen(0,0,0,false,"sin",0,0,0,0);
                Publicaciones.add(Publica);
                break;
            case "Audio":
                Publica = new Audio(0,0,0,false,"sin",0,0,0,0); 
                Publicaciones.add(Publica);
                break;
            case "Nombre":
            case "Fecha":
            case "CantMG":
            case "Etiquetas":
            case "Comentarios":
            case "Duracion":
            case "Resolucion":
            case "Fps":
            case "Alto":
            case "Ancho":
            case "Filtro":
            case "Velocidad":
                Buffer.delete(0,Buffer.length());
                break;
        }
    } 
}
