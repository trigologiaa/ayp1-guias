package src.testGalg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import src.galg.OrdenadorPorBurbujeo;
import src.galg.VerificadorDeOrden;

public class TestOrdenadorPorBurbujeo {

    @Test
    public void estaDesordenado() {
        OrdenadorPorBurbujeo ordenador = new OrdenadorPorBurbujeo();
        VerificadorDeOrden vo = new VerificadorDeOrden();

        int[] arreglo = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        ordenador.ordenar(arreglo);

        Assertions.assertTrue(vo.estaOrdenadoAscendentemente(arreglo));

    }

    @Test
    public void numerosRandom() {
        OrdenadorPorBurbujeo ordenador = new OrdenadorPorBurbujeo();
        VerificadorDeOrden vo = new VerificadorDeOrden();

        int[] arreglo = new int[] { 54, 25, 86, 12, 65, 76, 1, 68, 76, 87 };

        ordenador.ordenar(arreglo);

        Assertions.assertTrue(vo.estaOrdenadoAscendentemente(arreglo));

    }

    @Test
    public void estaOrdenado() {
        OrdenadorPorBurbujeo ordenador = new OrdenadorPorBurbujeo();
        VerificadorDeOrden vo = new VerificadorDeOrden();

        int[] arreglo = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        ordenador.ordenar(arreglo);

        Assertions.assertTrue(vo.estaOrdenadoAscendentemente(arreglo));

    }

}
