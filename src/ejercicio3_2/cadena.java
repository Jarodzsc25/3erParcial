package ejercicio3_2;

public class cadena {
    public static int numMayusculas(String cadena) {
        int numMayusculas = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isUpperCase(cadena.charAt(i))) {
                numMayusculas++;
            }
        }
        return numMayusculas;
    }

    public static int numOcurrencias(String cadena, char letra) {
        int numOcurrencias = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra || cadena.charAt(i) == Character.toUpperCase(letra)) {
                numOcurrencias++;
            }
        }
        return numOcurrencias;
    }

    public static String eliminarEspacios(String cadena) {
        return cadena.replaceAll(" ", "");
    }

    public static String invertirCadena(String cadena) {
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        return cadenaInvertida;
    }
    public static void main(String[] args) {
        String cadena = " Programación Orientada a Objetos ";

        System.out.println("El número de mayúsculas es: " + numMayusculas(cadena));
        System.out.println("El número de ocurrencias de la letra 'a' es: " + numOcurrencias(cadena, 'a'));
        System.out.println("La cadena sin espacios en blanco es: " + eliminarEspacios(cadena));
        System.out.println("La cadena invertida es: " + invertirCadena(cadena));

    }
}
