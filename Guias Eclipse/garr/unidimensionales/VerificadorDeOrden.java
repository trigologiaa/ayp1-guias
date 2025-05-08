package garr.unidimensionales;

public class VerificadorDeOrden {
    /*
     * pre: configurar == true (maximos)
     * configurar == false (minimos)
     */
    boolean verificar(int[] enteros, boolean configurar) {
        if (enteros == null || enteros.length < 2) {
            return true;
        }
        for (int i = 0; i < enteros.length - 1; i++) {
            if (configurar) {
                if (enteros[i] > enteros[i + 1]) {
                    return false;
                }
            } else {
                if (enteros[i] < enteros[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        VerificadorDeOrden test = new VerificadorDeOrden();
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 2, 1, 5, 3, 4 };
        int[] c = { 5, 4, 3, 2, 1 };
        int[] d = { 1 };
        int[] e = {};

        System.out.println(test.verificar(a, true));
        System.out.println(test.verificar(b, true));
        System.out.println(test.verificar(c, true));
        System.out.println(test.verificar(d, true));
        System.out.println(test.verificar(e, true));

    }
}
