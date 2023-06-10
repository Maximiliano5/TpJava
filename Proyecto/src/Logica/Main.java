package Logica;

import Clases.Album;
import Clases.Perfil;
import Clases.Publicacion;
import InterfazGrafica.Pantalla;
import Persistencia.Carga;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


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
       Collections.sort(Lista, new Comparator<Publicacion>() {
         @Override
         public int compare(Publicacion p1, Publicacion p2) {
            return p1.getNombre().compareTo(p2.getNombre());
         }
        });
       ArrayList<Album> A = new ArrayList<>();
       Perfil objPerfil = new Perfil("Facundo","Gonzales",1000,900,Lista,A);
       Pantalla Panta = new Pantalla(objPerfil);
       Panta.setVisible(true);
       Panta.setLocationRelativeTo(null);
    }
    
}