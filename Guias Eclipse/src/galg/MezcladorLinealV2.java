package galg;

/**
 * Mezclador que implementa el algoritmo de mezcla lineal v2
 */
public class MezcladorLinealV2 {

    /**
     * post: devuelve un array con los elementos combinados, manteniendo
     * el orden original.
     */
    public int[] mezclar(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int[] d = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b.length / 2; i++) {
            int temp = b[i];
            b[i] = b[b.length - 1 - i];
            b[b.length - 1 - i] = temp;
        }

        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }

        int i = 0;
        int j = c.length - 1;
        int k = 0;

        while (k < d.length) {
            if (c[i] < c[j]) {
                d[k] = c[i];
                i++;
            } else {
                d[k] = c[j];
                j--;
            }
            k++;
        }
        return d;
    }
}
