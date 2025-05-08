package src.testGalg;

import static org.junit.jupiter.api;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Test;
import src.galg.MezcladorLineal;

public class TestMezcladorLineal {

    MezcladorLineal MezcladorLineal = new MezcladorLineal();

    @Test
    public void testMezcladorLinealArraysOrdenados() {
        int[] a = new int[] { 1, 2, 3, 4 };
        int[] b = new int[] { 3, 4, 5, 6 };
        int[] resultadoEsperado = new int[] { 1, 2, 3, 3, 4, 4, 5, 6 };

        int[] resultado = MezcladorLineal.mezclar(a, b);

        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testMezcladorLinealConPrimerArrayVacio() {
        int[] a = new int[] {};
        int[] b = new int[] { 3, 4, 5, 6 };
        int[] resultadoEsperado = new int[] { 3, 4, 5, 6 };

        int[] resultado = MezcladorLineal.mezclar(a, b);

        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testMezcladorLinealConSegundoArrayVacio() {
        int[] a = new int[] { 1, 2, 3, 4 };
        int[] b = new int[] {};
        int[] resultadoEsperado = new int[] { 1, 2, 3, 4 };

        int[] resultado = MezcladorLineal.mezclar(a, b);

        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testMezcladorLinealArraysConElementosIgualesYNegativos() {
        int[] a = new int[] { 1, 1, 1, 1, 1 };
        int[] b = new int[] { -1, -1, -1 };
        int[] resultadoEsperado = new int[] { -1, -1, -1, 1, 1, 1, 1, 1 };

        int[] resultado = MezcladorLineal.mezclar(a, b);

        assertArrayEquals(resultadoEsperado, resultado);
    }

}
