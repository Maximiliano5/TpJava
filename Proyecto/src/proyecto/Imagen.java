package proyecto;

public class Imagen extends Publicacion implements Filtrable{
    private int Resolucion;
    private int Alto;
    private int Ancho;
    private Boolean Filtro;

    //constructor
    public Imagen(int Resolucion, int Alto, int Ancho, Boolean Filtro) {
        this.Resolucion = Resolucion;
        this.Alto = Alto;
        this.Ancho = Ancho;
        this.Filtro = Filtro;
    } 
    //metodo
    @Override
    public void Filtro() {
        //hay que redefinir el metodo
    }
    
}
