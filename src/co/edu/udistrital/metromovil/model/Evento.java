package co.edu.udistrital.metromovil.model;

public class Evento {
    private String tipo;
    private String descripcion;
    private String ubicacion;
    private String nivelPrioridad;

    public Evento(String tipo, String descripcion, String ubicacion, String nivelPrioridad){
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.ubicacion = descripcion;
        this.nivelPrioridad = nivelPrioridad;
    }
    public String getTipo(){
        return tipo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getUbicacion(){
        return ubicacion;
    }
    public String getNivelPrioridad(){
        return nivelPrioridad;
    }
    @Override
    public String toString(){
        return "Evento{" + tipo + '\'' + ", descripcion='" + descripcion + '\'' + ", ubicacion= '" + ubicacion + '\'' + ", nivelPrioridad='" + '\'' + '}';
    }
}
