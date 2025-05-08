package gstring;
public class Cadena {
  public static void main(String[] args) {
    Cadena cadenita = new Cadena("1");

    System.out.println("Longitud " + cadenita.Longitud());
    System.out.println("Es Vacio " + cadenita.esVacia());
    System.out.println("Contiene la letra " + cadenita.contiene('a'));
    System.out.println("Es digito " + cadenita.esDigito('1'));
  }

  private char[] cadena;

  public Cadena(String string) {
    this.cadena = string.toCharArray();
  }

  public int Longitud() {
    return this.cadena.length;
  }

  public boolean esVacia() {
    return this.Longitud() == 0;
  }

  public boolean contiene(char letra) {
    for (int i = 0; i < cadena.length; i++) {
      if (cadena[i] == letra) {
        return true;
      }
    }
    return false;
  }

  public boolean esDigito(char c) {
    return c >= 48 && c <= 57;
  }

  public boolean esLetra(char c) {
    if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
      return true;
    }
    return false;
  }

  public boolean esMayuscula(char c) {
    return c >= 65 && c <= 90;
  }

  public boolean esMiniscula(char c) {
    return c >= 97 && c <= 122;
  }

  public String toString() {
    String s = "";
    for (int i = 0; i < this.Longitud(); i++)
      s += this.cadena[i];
    return s;
  }
}
