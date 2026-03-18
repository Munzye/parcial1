package co.edu.udistrital.metromovil.observer;

import co.edu.udistrital.metromovil.model.Evento;

public class SuscriptorConcreto implements Observador {
    private String nombre;
    private String cargo;

    public SuscriptorConcreto(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    @Override
    public void actualizar(Evento evento) {
        System.out.println("--------------------------------------------------");
        System.out.println("Notificación recibida por: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Tipo de evento: " + evento.getTipo());
        System.out.println("Descripción: " + evento.getDescripcion());
        System.out.println("Ubicación: " + evento.getUbicacion());
        System.out.println("Prioridad: " + evento.getNivelPrioridad());
        System.out.println("--------------------------------------------------");
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
