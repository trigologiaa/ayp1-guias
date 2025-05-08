package garr.unidimensionales;

import java.util.Arrays;

public class Basicas {
    public int contarValores(int[] a) {
        return a.length;
    }

    public int contarValoresPares(int[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public int contarValoresPositivos(int[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                contador++;
            }
        }
        return contador;
    }

    public int contarValoresPosicionPar(int[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public int sumarValores(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        return suma;
    }

    public int sumarValoresPares(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                suma += a[i];
            }
        }
        return suma;
    }

    public int sumarValoresPositivos(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                suma += a[i];
            }
        }
        return suma;
    }

    public int sumarValoresPosicionPares(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                suma += a[i];
            }
        }
        return suma;
    }

    public int promedio(int[] a) {
        int promedio = 0;
        for (int i = 0; i < a.length; i++) {
            promedio += a[i];
        }
        return promedio / a.length;
    }

    public int promedioPares(int[] a) {
        int promedio = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                promedio += a[i];
            }
        }
        return promedio / a.length;
    }

    public int promedioPositivos(int[] a) {
        int promedio = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                promedio += a[i];
            }
        }
        return promedio / a.length;
    }

    public int promedioPosicionesPares(int[] a) {
        int promedio = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                promedio += a[i];
            }
        }
        return promedio / a.length;
    }

    public int[] pisarValores(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
        return a;
    }

    public int[] pisarValoresPrimero(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[0];
        }
        return a;
    }

    public int[] pisarValoresUltimo(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[a.length - 1];
        }
        return a;
    }

    public int[] invertir(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int b = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = b;
        }
        return a;
    }

    public int maximoOMinimo(int[] a, boolean configurar) {
        int candidato = 0;
        for (int i = 0; i < a.length; i++) {
            int actual = a[i];
            if (configurar == true) {
                if (actual > candidato) {
                    candidato = actual;
                }
            } else {
                if (actual < candidato) {
                    candidato = actual;
                }
            }
        }
        return candidato;
    }

    public int picos(int[] a) {
        int pico = -1;
        if (a.length < 3) {
            return pico;
        }
        for (int i = 1; i < a.length - 1; i++) {
            int posicionSiguiente = a[i + 1];
            int actual = a[i];
            int posicionAnterior = a[i - 1];
            if (actual > posicionAnterior && actual > posicionSiguiente) {
                pico = actual;
            }
        }
        return pico;
    }

    public int[] unir(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        return c;
    }

    public int[] separar(int[] a, boolean configurar) {
        int mitad = a.length / 2;
        int[] b = new int[mitad];
        int[] c = new int[a.length - mitad];
        if (configurar == true) {
            for (int i = 0; i < mitad; i++) {
                b[i] = a[i];
            }
            return b;
        } else
            for (int i = (a.length / 2); i < a.length; i++) {
                c[i - a.length / 2] = a[i];
            }

        return c;
    }

    public int[] separarPares(int[] a, boolean configurar) {
        int contarPares = 0;
        int contarImpares = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                contarPares++;
            } else {
                contarImpares++;
            }
        }
        if (configurar == true) {
            int b[] = new int[contarPares];
            int posicionesPares = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0) {
                    b[posicionesPares++] = a[i];
                }
            }
            return b;
        } else {
            int c[] = new int[contarImpares];
            int posicionesImpares = 0;
            for (int i = 0; i < a.length; i++) {
                if ((a[i] % 2 != 0)) {
                    c[posicionesImpares++] = a[i];
                }
            }
            return c;
        }

    }

    public int[] separarPositivosYNegativos(int[] a, boolean configurar) {
        int contarPositivos = 0;
        int contarNegativos = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                contarPositivos++;
            } else {
                contarNegativos++;
            }
        }
        if (configurar == true) {
            int b[] = new int[contarPositivos];
            int posicionesPositivas = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > 0) {
                    b[posicionesPositivas++] = a[i];
                }
            }
            return b;
        } else {
            int c[] = new int[contarNegativos];
            int posicionesImpares = 0;
            for (int i = 0; i < a.length; i++) {
                if ((a[i] < 0)) {
                    c[posicionesImpares++] = a[i];
                }
            }
            return c;
        }

    }

    public static void main(String[] args) {

        int[] a = { 10, 12, 8, 4, 5, 3 };
        int[] b = { 69, 69, 69, 69 };
        int[] si = { 1, 2, 3, 4, 5, -8, -4, 69, 9, 10, 121 };

        Basicas test = new Basicas();

        System.out.println(test.unir(a, b));
        System.out.println(test.contarValoresPosicionPar(b));
        System.out.println(test.maximoOMinimo(si, false));
        System.out.println(Arrays.toString(test.unir(a, b)));
        System.out.println(Arrays.toString(test.separarPositivosYNegativos(si, false)));
    }
}
