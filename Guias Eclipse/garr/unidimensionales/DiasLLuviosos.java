package garr.unidimensionales;

public class DiasLLuviosos {

    private boolean[] dias;

    public DiasLLuviosos(boolean esBisiesto) {
        if (esBisiesto == false) {
            dias = new boolean[365];
        } else {
            dias = new boolean[366];
        }
        for (int i = 0; i < dias.length; i++) {
            dias[i] = false;
        }
    }

    public void registrarQueLLovioElDia(int diaDeAnio, boolean llovio) {
        if (diaDeAnio < 1 || diaDeAnio > dias.length) {
            throw new Error("diaDeAnio debe ser entre 1 y 365 o 366 si es bisiesto");
        } else {
            dias[diaDeAnio - 1] = llovio;
        }
    }

    public boolean consultarSiLLovioElDia(int diaDeAnio) {
        if (diaDeAnio < 1 || diaDeAnio > dias.length) {
            throw new Error("diaDeAnio debe ser entre 1 y 365 o 366 si es bisiesto");
        } else {
            for (int i = 0; i < dias.length; i++) {
                if (dias[diaDeAnio - 1] == true) {
                    return true;
                }
            }
        }
        return false;

    }

    int contarDiasLLuviosos() {
        int llovio = 0;
        for (int i = 0; i < dias.length; i++) {
            if (dias[i] == true) {
                llovio++;
            }
        }
        return llovio;
    }

    int consultarCuatrimestreMasLLuvioso() {
        int[] cuatrimestres = new int[4];
        for (int i = 0; i < dias.length; i++) {
            if (dias[i]) {
                if (i < 91) {
                    cuatrimestres[0]++;
                } else if (i < 182) {
                    cuatrimestres[1]++;
                } else if (i < 274) {
                    cuatrimestres[2]++;
                } else {
                    cuatrimestres[3]++;
                }
            }
        }

        int candidato = cuatrimestres[0];
        int cuatrimestreMasLluvioso = 0;

        for (int i = 1; i < cuatrimestres.length; i++) {
            if (cuatrimestres[i] > candidato) {
                candidato = cuatrimestres[i];
                cuatrimestreMasLluvioso = i;
            }
        }
        return cuatrimestreMasLluvioso + 1;
    }

    int consultarPrimerDiaConLluvia() {
        int primerDiaDeLLuvia = 1;
        for (int i = 0; i < dias.length; i++) {
            if (dias[i] == true) {
                primerDiaDeLLuvia = i + 1;
                return primerDiaDeLLuvia;
            }
        }
        return primerDiaDeLLuvia;
    }

    public static void main(String[] args) {
        DiasLLuviosos test = new DiasLLuviosos(true);

        test.registrarQueLLovioElDia(1, true);
        test.registrarQueLLovioElDia(56, true);
        test.registrarQueLLovioElDia(300, true);
        test.registrarQueLLovioElDia(200, true);
        test.registrarQueLLovioElDia(245, true);
        test.registrarQueLLovioElDia(134, true);
        test.registrarQueLLovioElDia(10, true);
        test.registrarQueLLovioElDia(24, true);
        test.registrarQueLLovioElDia(30, true);
        test.registrarQueLLovioElDia(366, true);
        test.registrarQueLLovioElDia(365, true);

        test.consultarSiLLovioElDia(26);
        test.contarDiasLLuviosos();
        test.consultarCuatrimestreMasLLuvioso();
        test.consultarPrimerDiaConLluvia();

        System.out.println("El dia llovio = " + test.consultarSiLLovioElDia(366));
        System.out.println("Llovieron " + test.contarDiasLLuviosos() + " dias.");
        System.out.println("El cuatrimestre mas lluvioso fue el " + test.consultarCuatrimestreMasLLuvioso() + "°.");
        System.out.println("El primer dia con lluvia fue el " + test.consultarPrimerDiaConLluvia());
    }
}
