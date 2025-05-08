package src.testGalg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import src.galg.BuscadorSecuencial;

public class TestBuscadorSecuencial {
    @Test
    public void Buscador65() {
        BuscadorSecuencial buscadorcito = new BuscadorSecuencial();

        int[] vector = new int[] { 54, 25, 86, 12, 65, 76, 1, 68, 76, 87 };
        int buscado = 65;

        Assertions.assertEquals(4, buscadorcito.buscar(vector, buscado));
    }

    @Test
    public void Buscador9() {
        BuscadorSecuencial buscadorcito = new BuscadorSecuencial();

        int[] vector = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int buscado = 9;

        Assertions.assertEquals(8, buscadorcito.buscar(vector, buscado));
    }

    @Test
    public void Buscador10() {
        BuscadorSecuencial buscadorcito = new BuscadorSecuencial();

        int[] vector = new int[] { 10, 5, 3, 2, 10, 3, 1, 6, 2, 0 };
        int buscado = 10;

        Assertions.assertEquals(0, buscadorcito.buscar(vector, buscado));
    }

    @Test
    public void BuscadorFueraDelVector() {
        BuscadorSecuencial buscadorcito = new BuscadorSecuencial();

        int[] vector = new int[] { 10, 5, 3, 2, 10, 3, 1, 6, 2, 0 };
        int buscado = 8;

        Assertions.assertEquals(-1, buscadorcito.buscar(vector, buscado));
    }

}
