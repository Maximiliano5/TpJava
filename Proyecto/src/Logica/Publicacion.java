package Logica;

public class Publicacion {
    private String nombre;
    private int fecha; //aaaammdd
    private int cantMG;
    private int etiquetas;
    private int comentarios;

    //Constructor
    public Publicacion(String n, int f, int cant, int e, int com){
        nombre=n;
        fecha=f;
        cantMG=cant;
        etiquetas=e;
        comentarios=com;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getFecha() {
        return fecha;
    }

    public int getCantMG() {
        return cantMG;
    }

    public int getEtiquetas() {
        return etiquetas;
    }

    public int getComentarios() {
        return comentarios;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setCantMG(int cantMG) {
        this.cantMG = cantMG;
    }

    public void setEtiquetas(int etiquetas) {
        this.etiquetas = etiquetas;
    }

    public void setComentarios(int comentarios) {
        this.comentarios = comentarios;
    } 
}

