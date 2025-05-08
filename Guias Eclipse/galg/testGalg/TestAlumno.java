package src.testGalg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import src.galg.Alumno;

public class TestAlumno {

    @Test
    public void testOrdamientoPorLegajo() {
        Alumno alumno1 = new Alumno(102, "Perez", "Juan", 8.5);
        Alumno alumno2 = new Alumno(101, "Lopez", "Ana", 9.2);
        Alumno alumno3 = new Alumno(103, "Garcia", "Carlos", 7.8);
        Alumno[] alumnos = new Alumno[] { alumno1, alumno2, alumno3 };

        Assertions.assertEquals(102, alumnos[0].obtenerLegajo());
        Assertions.assertEquals(101, alumnos[1].obtenerLegajo());
        Assertions.assertEquals(103, alumnos[2].obtenerLegajo());

        alumno1.ordamientoPorLegajo(alumnos);

        Assertions.assertEquals(101, alumnos[0].obtenerLegajo());
        Assertions.assertEquals(102, alumnos[1].obtenerLegajo());
        Assertions.assertEquals(103, alumnos[2].obtenerLegajo());
    }

    @Test
    public void testOrdamientoPorPromedio() {
        Alumno alumno1 = new Alumno(102, "Perez", "Juan", 8.5);
        Alumno alumno2 = new Alumno(101, "Lopez", "Ana", 9.2);
        Alumno alumno3 = new Alumno(103, "Garcia", "Carlos", 7.8);

        Alumno[] alumnos = new Alumno[] { alumno1, alumno2, alumno3 };

        assertEquals(8.5, alumnos[0].obtenerPromedio());
        assertEquals(9.2, alumnos[1].obtenerPromedio());
        assertEquals(7.8, alumnos[2].obtenerPromedio());

        alumno1.ordamientoPorPromedio(alumnos);

        assertEquals(7.8, alumnos[0].obtenerPromedio());
        assertEquals(8.5, alumnos[1].obtenerPromedio());
        assertEquals(9.2, alumnos[2].obtenerPromedio());

    }
}
