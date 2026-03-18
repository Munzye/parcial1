package co.edu.udistrital.metromovil.subject;

import co.edu.udistrital.metromovil.model.Evento;
import co.edu.udistrital.metromovil.observer.Observador;
public interface Sujeto {
    void subscribir(Observador observador);
    void desubscribir(Observador observador;
    void notificar(Evento evento);
}
