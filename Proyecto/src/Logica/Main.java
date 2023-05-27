package Logica;

import Clases.Album;
import Clases.Perfil;
import Clases.Publicacion;
import InterfazGrafica.Pantalla;
import Persistencia.Carga;
import java.util.ArrayList;


public class Main {
    public enum Filtro{
      Blanco_negro,
      Noche,
      Luminoso,
      Polarizado
    }
    public static void main(String[] args){
        ArrayList<Publicacion> Lista = new ArrayList<>();
       Carga Datos = new Carga();
       Datos.CargaDatos(Lista);
       Datos.OrdenaDatos(Lista);
       ArrayList<Album> A = new ArrayList<>();
       Perfil objPerfil = new Perfil("Facundo","Gonzales",1000,900,Lista,A);
       Pantalla Panta = new Pantalla(objPerfil);
       Panta.setVisible(true);
       Panta.setLocationRelativeTo(null);
    }
    
}