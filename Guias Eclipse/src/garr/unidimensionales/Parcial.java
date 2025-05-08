package garr.unidimensionales;

public class Parcial {

    int encimaDelPromedio(int[] valores) {
        int promedio = valores[0];
        int contador = 0;
        for (int i = 1; i < valores.length; i++) {
            promedio += valores[i];
        }
        promedio = promedio / valores.length;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > promedio) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Parcial test = new Parcial();

        int a[] = { -1, -2, -3, -1, -1 };

        System.out.println(test.encimaDelPromedio(a));
    }
}
