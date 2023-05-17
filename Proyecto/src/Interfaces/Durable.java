package Interfaces;

public interface Durable {
    public void avanzar(int seg); //en segundos
    public void reanudar(int seg); //en segundos
    public void pausar(boolean res);
}
