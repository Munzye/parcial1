package co.edu.udistrital.metromovil.app;

import co.edu.distrital.metromovil.observer.SistemaCentral;
import co.edu.distrital.metromovil.observer.SuscriptorConcreto;

public class Main {
    public static void main(String[] args) {
        SistemaCentral sistemaCentral = new SistemaCentral();

        SuscriptorConcreto carolina = new SuscriptorConcreto(
                "Carolina Niño",
                "Coordinadora de movilidad" );

        SuscriptorConcreto samuel = new SuscriptorConcreto(
                "Samuel Pérez",
                "Responsable de comunicaciones" );

        SuscriptorConcreto roberto = new SuscriptorConcreto(
                "Roberto Mena",
                "Supervisor técnico" );

        sistemaCentral.suscribir(carolina);
        sistemaCentral.suscribir(samuel);
        sistemaCentral.suscribir(roberto);

        sistemaCentral.generarEvento(
                "Llegada de nuevo vehículo eléctrico",
                "Se incorporó un nuevo bus eléctrico a la flota.",
                "Patio Norte",
                "Media"
        );

        sistemaCentral.generarEvento(
                "Cambio de ruta por mantenimiento vial",
                "La ruta T-24 modifica su recorrido por obras.",
                "Avenida Central",
                "Alta"
        );

        sistemaCentral.generarEvento(
                "Reporte de interrupción del servicio",
                "Se detectó una falla en la estación de recarga.",
                "Estación Sur",
                "Crítica"
        );

        sistemaCentral.desuscribir(samuel);

        sistemaCentral.generarEvento(
                "Mantenimiento preventivo",
                "Se requiere revisión técnica a bicicletas compartidas.",
                "Zona Universitaria",
                "Media"
        );
    }
}
