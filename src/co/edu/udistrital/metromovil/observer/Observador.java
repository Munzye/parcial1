package co.edu.udistrital.metromovil.observer;  

//imp
import co.edu.udistrital.metromovil.model.Evento;
public interface Observador {
    void actualizar (Evento evento);
    String getNombre();
}
