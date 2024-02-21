public class UtilBin {
    public static int[] cambiarBinarioInt(String binario) {
        int[] aux = new int[binario.length()];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = binario.charAt(i) - '0';
        }
        return aux;
    }

    public static int obtenerBinario(String binario) {
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
    public static  String obteneBin8(int numero) {
        if(numero<0 || numero>255) return "00000000";
        else{
            String binario = obtenerBin(numero);
            while(binario.length()<8){
                binario = "0" + binario;
            }
            return binario;
        }
    }
    public static boolean EsUnaRed(int ip1, int ip2, int ip3, int ip4,int bitsRed){
        String binario=obteneBin8(ip1)+obteneBin8(ip2)+
                obteneBin8(ip3)+obteneBin8(ip4);
        char[]binarioChar=binario.toCharArray();
        boolean esRed=true;
        int i=bitsRed;
        while (i<32 && esRed){
            esRed=(binarioChar[i]=='0');
        }
        return esRed;
    }
}
