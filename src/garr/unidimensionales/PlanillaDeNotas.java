package garr.unidimensionales;

public class PlanillaDeNotas {

    private int[] notas;

    public PlanillaDeNotas(int alumnos) {
        notas = new int[alumnos];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = 0;
        }
    }

    public void cargarNota(int alumno, int nota) {
        if (nota > 10 || nota < 1) {
            throw new Error("Nota debe estar entre 1 y 10");
        } else {
            notas[alumno] = nota;
        }
    }

    public int notaMaxima() {
        int candidato = notas[0];
        for (int i = 0; i < notas.length; i++) {
            int actual = notas[i];
            if (actual > candidato) {
                candidato = actual;
            }
        }
        return candidato;
    }

    public int notaMinima() {
        int candidato = notas[0];
        for (int i = 0; i < notas.length; i++) {
            int actual = notas[i];
            if (actual < candidato) {
                candidato = actual;
            }
        }
        return candidato;
    }

    public int promedio() {
        int promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            promedio += notas[i];
        }
        return promedio / notas.length;
    }

    public int aprobados() {
        int cantidadAprobados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 4) {
                cantidadAprobados++;
            }
        }
        return cantidadAprobados;
    }

    public static void main(String[] args) {
        PlanillaDeNotas test = new PlanillaDeNotas(10);

        test.cargarNota(0, 1);
        test.cargarNota(1, 10);
        test.cargarNota(2, 4);
        test.cargarNota(3, 2);
        test.cargarNota(4, 8);
        test.cargarNota(5, 4);
        test.cargarNota(6, 7);
        test.cargarNota(7, 2);
        test.cargarNota(8, 9);
        test.cargarNota(9, 3);

        System.out.println(test.notaMaxima());
        System.out.println(test.notaMinima());
        System.out.println(test.promedio());
        System.out.println(test.aprobados());

    }

}
