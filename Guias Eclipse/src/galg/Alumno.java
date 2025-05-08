package galg;

public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private double promedio;

    public Alumno(int legajo, String apellido, String nombre, double promedio) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public int obtenerLegajo() {
        return legajo;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public String toString() {
        return "Alumno{" +
                "legajo=" + legajo +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", promedio=" + promedio +
                '}';
    }

    public void ordamientoPorLegajo(Alumno[] alumno) {
        Alumno temporal;
        for (int i = 0; i < alumno.length - 1; i++) {
            for (int j = 0; j < alumno.length - 1; j++) {
                int a = alumno[j].obtenerLegajo();
                int b = alumno[j + 1].obtenerLegajo();
                if (a > b) {
                    temporal = alumno[j];
                    alumno[j] = alumno[j + 1];
                    alumno[j + 1] = temporal;
                }
            }
        }
    }

    public void ordamientoPorPromedio(Alumno[] alumno) {
        Alumno temporal;
        for (int i = 0; i < alumno.length - 1; i++) {
            for (int j = 0; j < alumno.length - 1; j++) {
                double a = alumno[j].obtenerPromedio();
                double b = alumno[j + 1].obtenerPromedio();
                if (a > b) {
                    temporal = alumno[j];
                    alumno[j] = alumno[j + 1];
                    alumno[j + 1] = temporal;
                }
            }
        }
    }

    public int buscarPorLegajoBinario(Alumno[] alumno, int buscado) {
        int inicio = 0;
        int fin = alumno.length - 1;

        while (inicio <= fin) {
            int mitad = (inicio + fin) / 2;

            if (alumno[mitad].obtenerLegajo() == buscado) {
                return mitad;
            } else if (alumno[mitad].obtenerLegajo() > buscado) {
                fin = mitad - 1;
            } else if (alumno[mitad].obtenerLegajo() < buscado) {
                inicio = mitad + 1;
            }
        }
        return -1;
    }

    public int buscarPorLegajoSecuencial(Alumno[] alumno, int buscado) {
        for (int i = 0; i < alumno.length; i++) {
            if (alumno[i].obtenerLegajo() == buscado) {
                return alumno[i].obtenerLegajo();
            }
        }
        return -1;
    }

    public int buscarPorPromedioBinario(Alumno[] alumno, double buscado) {
        int inicio = 0;
        int fin = alumno.length - 1;

        while (inicio <= fin) {

            int mitad = (inicio + fin) / 2;

            if (alumno[mitad].obtenerPromedio() == buscado) {
                return mitad + 1;
            } else if (alumno[mitad].obtenerPromedio() > buscado) {
                fin = mitad - 1;
            } else if (alumno[mitad].obtenerPromedio() < buscado) {
                inicio = mitad + 1;
            }
        }
        return -1;
    }

    public int buscarPorPromedioSecuencial(Alumno[] alumno, double buscado) {
        for (int i = 0; i < alumno.length; i++) {
            if (alumno[i].obtenerPromedio() == buscado) {
                return i + 1;
            }
        }
        return -1;
    }

    public double buscarPorApellidoYNombreSecuencial(Alumno[] alumno, String apellido, String nombre) {
        for (int i = 0; i < alumno.length; i++) {
            if (alumno[i].obtenerApellido().equals(apellido) && alumno[i].obtenerNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public int buscarPorApellidoYNombreBinario(Alumno[] alumnos, String apellido, String nombre) {
        int inicio = 0;
        int fin = alumnos.length - 1;

        while (inicio <= fin) {
            int mitad = (inicio + fin) / 2;
            Alumno actual = alumnos[mitad];
            int cmpApellido = actual.obtenerApellido().compareTo(apellido);
            int cmpNombre = actual.obtenerNombre().compareTo(nombre);

            if (cmpApellido == 0 && cmpNombre == 0) {
                return mitad;
            } else if (cmpApellido > 0 || (cmpApellido == 0 && cmpNombre > 0)) {
                fin = mitad - 1;
            } else {
                inicio = mitad + 1;
            }
        }
        return -1;

    }
}
