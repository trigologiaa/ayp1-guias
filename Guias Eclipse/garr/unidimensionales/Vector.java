package garr.unidimensionales;

public class Vector {

    public int encontrarDoble(int[] vector) {
        int pos = -1;
        if (vector == null || vector.length < 2) {
            throw new Error("El vector debe ser con al menos 2 valores.");
        }
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] == vector[i - 1] * 2) {
                pos = -1;
            } else {
                return vector[i];
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        Vector test = new Vector();

        int a[] = { 2, 4, 8, 16 };
        int b[] = { 3, 6, 12, 24 };
        int c[] = {};
        int d[] = { 1 };
        int e[] = { 1, 2, 3, 4, 5 };

        System.out.println(test.encontrarDoble(a));
        System.out.println(test.encontrarDoble(b));
        System.out.println(test.encontrarDoble(e));
        System.out.println(test.encontrarDoble(c));
        System.out.println(test.encontrarDoble(d));

    }
}