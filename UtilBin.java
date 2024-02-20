public class UtilBin {
    public static int[] cambiarBinarioInt(String binario) {
        int[] aux = new int[binario.length()];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = binario.charAt(i) - '0';
        }
        return aux;
    }

    public static int obtenerBinarioInt(String binario) {
        int[] cifra = UtilBin.cambiarBinarioInt(binario);
        int resultado = 0;
        int peso = 1;
        for (int i = cifra.length - 1; i >= 0; i--) {
            resultado += cifra[i] * peso;
            peso *= 2;
        }
        return resultado;
    }

    public static String obtenerBin(int entero) {
        String aux = "";
        int resto;
        String resultado = "";
        while (entero > 0) {
            resto = entero % 2;
            aux += resto;
            entero /= 2;
        }
        //para dar vuelta al String que hemos hecho antes
        for (int i = aux.length() - 1; i >= 0; i--) {
            resultado +=aux.charAt(i);
        }
        return resultado;
    }
}
