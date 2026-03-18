package co.edu.udistrital.metromovil.observer;

import java.util.ArrayList;
import java.util.List;

import co.edu.udistrital.metromovil.model.Evento;
import co.edu.udistrital.metromovil.subject.Sujeto;

public class SistemaCentral implements Sujeto{    
    private List<Observador> observadores;
    
    public SistemaCentral() {
        this.observadores = new ArrayList<>();
    }
    @Override
    public void suscribir(Observador observador){
        observadores.add(observador);
        System.out.println("Se suscribió: " + observador.getNombre());
    }
    @Override
    public void notificar(Evento evento){
        System.out.println("\n>>> Sitema Central notificando evento: "+ evento.getTipo());
        for (Observador observador : observadores){
            observador.actualizar(evento);
        }
    }
    @Override
    public void desuscribir(Observador observador){
        observadores.remove(observador);
        System.out.println(" Se desuscribió: " + observador.getNombre());
    }
    public void generarEvento(String tipo, String descripcion, String ubicacion, String prioridad){
        Evento evento = new Evento(tipo, descripcion, ubicacion, prioridad);
        notificar(evento);
    }
}
