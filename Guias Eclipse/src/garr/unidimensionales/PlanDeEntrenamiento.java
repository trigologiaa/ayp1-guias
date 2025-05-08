package garr.unidimensionales;

public class PlanDeEntrenamiento {

    private int[] plan;
    private int[] distanciaCorrida;

    public PlanDeEntrenamiento(int semanas) {
        plan = new int[semanas];
        distanciaCorrida = new int[semanas];
    }

    public void kilometrosPlan(int semana, int kilometros) {
        if (semana >= 0 && semana < plan.length) {
            plan[semana] = kilometros;
        }
    }

    public void distanciaEnKM(int semana, int corrioKM) {
        if (semana >= 0 && semana < plan.length) {
            distanciaCorrida[semana] = corrioKM;
        }
    }

    public int kilometrosCorridos(int semana) {
        if (semana >= 0 && semana < plan.length) {
            return distanciaCorrida[semana];
        }
        return -1;
    }

    public int semanasMax() {
        int contador = 0;
        for (int i = 0; i < plan.length; i++) {
            if (distanciaCorrida[i] > plan[i]) {
                contador++;
            }
        }
        return contador;
    }

    public int maximaDiferencia() {
        int maxDiferencia = 0;
        for (int i = 0; i < plan.length; i++) {
            if (distanciaCorrida[i] > plan[i]) {
                int diferencia = distanciaCorrida[i] - plan[i];
                if (diferencia > maxDiferencia) {
                    maxDiferencia = diferencia;
                }

            }

        }
        return maxDiferencia;
    }

    public static void main(String[] args) {
        PlanDeEntrenamiento plan = new PlanDeEntrenamiento(5); // Plan de 5 semanas

        plan.kilometrosPlan(0, 5);
        plan.kilometrosPlan(1, 7);
        plan.kilometrosPlan(2, 10);
        plan.kilometrosPlan(3, 6);
        plan.kilometrosPlan(4, 8);

        plan.distanciaEnKM(0, 6);
        plan.distanciaEnKM(1, 5);
        plan.distanciaEnKM(2, 12);
        plan.distanciaEnKM(3, 7);
        plan.distanciaEnKM(4, 7);

        System.out.println("Kilómetros recorridos en la semana 2: " + plan.kilometrosCorridos(2) + " Km");
        System.out.println("Cantidad de semanas donde la distancia recorrida fue mayor: " + plan.semanasMax());
        System.out
                .println("Máxima diferencia entre distancia planificada y corrida: " + plan.maximaDiferencia() + " Km");
    }

}
