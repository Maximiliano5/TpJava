package Logica;

public interface Durable {
    public void avanzar(int seg); //en segundos
    public void renaudar(int seg); //en segundos
    public void pausar(boolean res);
}
