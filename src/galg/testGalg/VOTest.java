package src.testGalg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import src.galg.VerificadorDeOrden;

public class VOTest {

    @Test
    public void desordenado() {
        VerificadorDeOrden vo = new VerificadorDeOrden();

        int[] arreglo = new int[] { 54, 25, 86, 12, 65, 76, 1, 68, 76, 87 };

        Assertions.assertFalse(vo.estaOrdenadoAscendentemente(arreglo));
        Assertions.assertFalse(vo.estaOrdenadoDescendentemente(arreglo));

    }

    @Test
    public void ordenadoAscendente() {
        VerificadorDeOrden vo = new VerificadorDeOrden();

        int[] arreglo = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Assertions.assertTrue(vo.estaOrdenadoAscendentemente(arreglo));
        Assertions.assertFalse(vo.estaOrdenadoDescendentemente(arreglo));

    }

    @Test
    public void ordenadoDescendente() {
        VerificadorDeOrden vo = new VerificadorDeOrden();

        int[] arreglo = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        Assertions.assertFalse(vo.estaOrdenadoAscendentemente(arreglo));
        Assertions.assertTrue(vo.estaOrdenadoDescendentemente(arreglo));

    }

    @Test
    public void todosIguales() {
        VerificadorDeOrden vo = new VerificadorDeOrden();

        int[] arreglo = new int[] { 1, 1, 1, 1, 1, 1, 1, 1 };

        Assertions.assertTrue(vo.estaOrdenadoAscendentemente(arreglo));
        Assertions.assertTrue(vo.estaOrdenadoDescendentemente(arreglo));

    }

    @Test
    public void unoSolo() {
        VerificadorDeOrden vo = new VerificadorDeOrden();

        int[] arreglo = new int[] { 1 };

        Assertions.assertTrue(vo.estaOrdenadoAscendentemente(arreglo));
        Assertions.assertTrue(vo.estaOrdenadoDescendentemente(arreglo));

    }

    @Test
    public void unoVacio() {
        VerificadorDeOrden vo = new VerificadorDeOrden();

        int[] arreglo = new int[] {};

        Assertions.assertTrue(vo.estaOrdenadoAscendentemente(arreglo));
        Assertions.assertTrue(vo.estaOrdenadoDescendentemente(arreglo));

    }

}