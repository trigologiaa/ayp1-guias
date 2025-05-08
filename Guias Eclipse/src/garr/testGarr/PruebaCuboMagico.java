package testGarr;

import org.junit.Test;

import garr.multidimensionales.CuboMagico;

import static org.junit.jupiter.api.Assertions.*;

public class PruebaCuboMagico {

    @Test
    public void esMagico() {

        int[][] cubo = {
                { 8, 1, 6 },
                { 3, 5, 7 },
                { 4, 9, 2 }
        };

        assertEquals(true, CuboMagico.verificar(cubo));

    }

    @Test
    public void esMagicoPeroConTodo0() {
        int[][] cubo = {
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 }
        };

        assertEquals(true, CuboMagico.verificar(cubo));
    }

    @Test
    public void noEsMagicoEnColumna() {
        int[][] cubo = {
                { 1, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 }
        };
        assertEquals(false, CuboMagico.verificar(cubo));
    }

    @Test
    public void noEsMagicoEnFila() {
        int[][] cubo = {
                { 0, 1, 0 },
                { 0, 1, 0 },
                { 0, 1, 0 }
        };
        assertEquals(false, CuboMagico.verificar(cubo));
    }

    @Test
    public void noEsMagicoEnDiagonal() {
        int[][] cubo = {
                { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 1 }
        };
        assertEquals(false, CuboMagico.verificar(cubo));
    }
}
