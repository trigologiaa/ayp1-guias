package gstring;

public class StringDemo {

    public static void main(String[] args) {
        String nombre = "Leo";
        String apellido = "Blautzik";

        System.out.println(nombre + " " + apellido);
        System.out.println(nombre.concat(apellido));
        System.out.println(nombre.concat(" ").concat(apellido));

        String saludo = "Hola";
        String otroSaludo = new String("    Como andás?");

        System.out.println("a) " + saludo.length());
        System.out.println("b) " + saludo.charAt(0));
        System.out.println("c) " + saludo.substring(1));
        System.out.println("d) " + saludo.substring(1, 3));
        System.out.println("e) " + saludo.equals("Hol"));
        System.out.println("f) " + saludo.equals("Hola"));
        System.out.println("g) " + (saludo == "Hola"));
        System.out.println("h) " + saludo.equalsIgnoreCase("hola"));
        System.out.println("i) " + otroSaludo.trim());
        System.out.println("j) " + otroSaludo.indexOf("a"));
        System.out.println("k) " + saludo.indexOf("o", 2));
        System.out.println("l) " + saludo.toLowerCase());
        System.out.println("m) " + saludo.toUpperCase());
        System.out.println("n) " + saludo.endsWith("la"));
        System.out.println("o) " + saludo.compareTo("adios"));

        char[] adchar = otroSaludo.trim().toCharArray();
        for (char c : adchar) {
            System.out.println(c);
        }
    }
}