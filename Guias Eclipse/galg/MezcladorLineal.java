package galg;

/**
 * Mezclador que implementa el algoritmo de mezcla lineal
 */
public class MezcladorLineal {

    /**
     * post: devuelve un array con los elementos combinados, manteniendo
     * el orden original.
     */
    public int[] mezclar(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        return c;
    }
}
