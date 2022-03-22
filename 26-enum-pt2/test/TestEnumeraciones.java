package test;

import enumeracion.Dias;
import enumeracion.Continentes;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1:" + Dias.LUNES);
        indicarDiaSemana(Dias.MARTES);

        // Enumeracion con mas datos
        System.out.println("Continente no.4: " + Continentes.AMERICA);
        System.out.println("Paises en el Continente no.4: " + Continentes.AMERICA.getPaises());

    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
        }
    }
}
