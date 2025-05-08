package src.testGalg;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.galg.MezcladorLinealV2;

public class TestMezcladorLinealV2 {

    MezcladorLinealV2 MezcladorLinealV2 = new MezcladorLinealV2();

    @Test
    public void testMezcladorLinealV2ArraysOrdenados() {
        int[] a = new int[] { 1, 2, 3, 4 };
        int[] b = new int[] { 3, 4, 5, 6 };
        int[] resultadoEsperado = new int[] { 1, 2, 3, 3, 4, 4, 5, 6 };

        int[] resultado = MezcladorLinealV2.mezclar(a, b);

        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testMezcladorLinealV2ConPrimerArrayVacio() {
        int[] a = new int[] {};
        int[] b = new int[] { 3, 4, 5, 6 };
        int[] resultadoEsperado = new int[] { 3, 4, 5, 6 };

        int[] resultado = MezcladorLinealV2.mezclar(a, b);

        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testMezcladorLinealV2ConSegundoArrayVacio() {
        int[] a = new int[] { 1, 2, 3, 4 };
        int[] b = new int[] {};
        int[] resultadoEsperado = new int[] { 1, 2, 3, 4 };

        int[] resultado = MezcladorLinealV2.mezclar(a, b);

        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testMezcladorLinealV2ArraysConElementosIgualesYNegativos() {
        int[] a = new int[] { 1, 1, 1, 1, 1 };
        int[] b = new int[] { -1, -1, -1 };
        int[] resultadoEsperado = new int[] { -1, -1, -1, 1, 1, 1, 1, 1 };

        int[] resultado = MezcladorLinealV2.mezclar(a, b);

        assertArrayEquals(resultadoEsperado, resultado);
    }

}
