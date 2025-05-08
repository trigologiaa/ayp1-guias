package testGarr;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import garr.multidimensionales.AnalizadorDeMatrices;

import static org.junit.jupiter.api.Assertions.*;

public class PruebaAnalizadorDeMatrices {

	AnalizadorDeMatrices analizador = new AnalizadorDeMatrices();

	@Test
	public void contarCerosEnUnaMatrizDe4Por3QueNoTieneCeros() {

		double[][] matriz = {
				{ 5.0, 3.5, 2.4 },
				{ 2.1, -9.2, 5.1 },
				{ 2.3, 7.9, -2.3 },
				{ 1.0, 6.1, -8.5 }
		};

		assertEquals(0, analizador.contarCeros(matriz));
	}

	@Test
	public void contarCerosEnUnaMatrizDe2Por4QueTiene3Ceros() {

		double[][] matriz = {
				{ 2.0, 0.0, 3.4, 0.0 },
				{ 0.0, 5.7, -2.3, 9.8 },
		};

		assertEquals(3, analizador.contarCeros(matriz));
	}

	@Test
	public void contarCerosEnUnaMatrizDe1Por1QueNoTieneCeros() {

		double[][] matriz = {
				{ 1.6 },
		};

		assertEquals(0, analizador.contarCeros(matriz));
	}

	@Test
	public void contarCerosEnUnaMatrizDeTodosCeros() {

		double[][] matriz = {
				{ 0.0, 0.0, 0.0 },
				{ 0.0, 0.0, 0.0 },
				{ 0.0, 0.0, 0.0 },
				{ 0.0, 0.0, 0.0 },
				{ 0.0, 0.0, 0.0 },
		};

		assertEquals(15, analizador.contarCeros(matriz));
	}

	@Test
	public void contarElementosEnUnaMatrizDe1Elemento() {
		double[][] matriz = {
				{ 1.0 },
		};

		assertEquals(1, analizador.contarElementosEnElRango(matriz, 0.0, 1.0));
	}

	@Test
	public void contarElementosEnUnaMatrizFueraDelRango() {
		double[][] matriz = {
				{ 2.0 },
		};

		assertEquals(0, analizador.contarElementosEnElRango(matriz, 0.0, 1.0));
	}

	@Test
	public void contarElementosEnUnaMatrizVacia() {
		double[][] matriz = {
				{},
		};

		assertEquals(0, analizador.contarElementosEnElRango(matriz, 0.0, 1.0));
	}

	@Test
	public void contarCerosPorColumna() {
		double[][] matriz = {
				{ 0, 5, 0, 8 },
				{ 2, 0, 9, 0 },
				{ 0, 6, 0, 0 },
				{ 4, 0, 7, 0 },
		};

		assertEquals(4, analizador.contarColumnasConCeros(matriz));
	}

	@Test
	public void contarCerosPorColumnaConTodo0() {
		double[][] matriz = {
				{ 0, 0, 0, 0 },
				{ 0, 0, 0, 0 },
				{ 0, 0, 0, 0 },
				{ 0, 0, 0, 0 },
		};

		assertEquals(4, analizador.contarColumnasConCeros(matriz));
	}

	@Test
	public void contarCerosPorColumnaConUnaMatrizVacia() {
		double[][] matriz = {
				{},
		};

		assertEquals(0, analizador.contarColumnasConCeros(matriz));
	}

	@Test
	public void contarCerosPorColumnaConUnaMatrizSinCeros() {
		double[][] matriz = {
				{ 1, 5, 3, 8 },
				{ 2, 7, 9, 4 },
				{ 6, 6, 5, 1 },
				{ 4, 3, 2, 9 },
		};

		assertEquals(0, analizador.contarColumnasConCeros(matriz));
	}

	@Test
	public void contarCerosPorColumnaConUnaMatrizIrregular() {
		double[][] matriz = {
				{ 1, 5, 0 },
				{ 2, 7, 9, 4 },
				{ 6, 0 },
				{ 4, 3, 2, 9, 1 }
		};

		assertEquals(2, analizador.contarColumnasConCeros(matriz));

	}

	@Test
	public void contarCerosPorFila() {
		double[][] matriz = {
				{ 0, 5, 0, 8 },
				{ 2, 0, 9, 0 },
				{ 0, 6, 0, 0 },
				{ 4, 1, 7, 1 },
		};

		assertEquals(3, analizador.contarFilasConCeros(matriz));
	}

	@Test
	public void contarCerosPorFilaConTodo0() {
		double[][] matriz = {
				{ 0, 0, 0, 0 },
				{ 0, 0, 0, 0 },
				{ 0, 0, 0, 0 },
				{ 0, 0, 0, 0 },
		};

		assertEquals(4, analizador.contarFilasConCeros(matriz));
	}

	@Test
	public void contarCerosPorFilaConUnaMatrizVacia() {
		double[][] matriz = {
				{},
		};

		assertEquals(0, analizador.contarFilasConCeros(matriz));
	}

	@Test
	public void contarCerosPorFilaConUnaMatrizSinCeros() {
		double[][] matriz = {
				{ 1, 5, 3, 8 },
				{ 2, 7, 9, 4 },
				{ 6, 6, 5, 1 },
				{ 4, 3, 2, 9 },
		};

		assertEquals(0, analizador.contarFilasConCeros(matriz));
	}

	@Test
	public void contarCerosPorFilaConUnaMatrizIrregular() {
		double[][] matriz = {
				{ 1, 7, 0 },
				{ 2, 5, 9, 0 },
				{ 6, 0 },
				{ 4, 5, 2, 9, 0 }
		};

		assertEquals(4, analizador.contarColumnasConCeros(matriz));

	}

	@Test
	public void promediarFilasDeUnaMatrizPeroConTodoCeros() {
		double[][] matriz = {
				{ 0, 0, 0, 0 },
				{ 0, 0, 0, 0 },
				{ 0, 0, 0, 0 },
				{ 0, 0, 0, 0 },
		};

		assertArrayEquals(new double[] { 0.0, 0.0, 0.0, 0.0 }, analizador.promediarFilas(matriz));

	}

	@Test
	public void promediarFilasDeUnaMatriz() {
		double[][] matriz = {
				{ 1, 1, 1, 1 },
				{ 2, 2, 2, 2 },
				{ 3, 3, 3, 3 },
				{ 4, 4, 4, 4 },
		};

		assertArrayEquals(new double[] { 1.0, 2.0, 3.0, 4.0 }, analizador.promediarFilas(matriz));

	}

	@Test
	public void promediarFilasDeUnaMatrizVacia() {
		double[][] matriz = {
				{},
		};

		assertArrayEquals(new double[] { 0.0 }, analizador.promediarFilas(matriz));
	}

	@Test
	public void promediarFilasEnUnaMatrizDe2Por4() {

		double[][] matriz = {
				{ 6.0, 5.0, 4.0, 3.0 },
				{ 8.0, 7.0, 7.0, 8.0 }
		};

		double[] promedios = analizador.promediarFilas(matriz);

		double[] promediosEsperados = { 4.5, 7.5 };

		Assertions.assertArrayEquals(promediosEsperados, promedios, 0.001);
	}

}
