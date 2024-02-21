public class App {public static void main(String[] args) {
    String b="11010010";
        /* para cambiarBinario
        int[] n = UtilBin.cambiarBinarioInt(b);
        for (int cifra:n) {
            System.out.print(cifra);
        }
        System.out.println();

         */
    //System.out.println(UtilBin.obtenerBinarioInt(b));
   /* int n=97;
    System.out.println(UtilBin.obtenerBin(n));
    n=254;
    System.out.println(UtilBin.obtenerBin(n));

    */
    System.out.println("-----------redes");
    Red red1=new Red(192,168,0,0,26,"RED");
    System.out.println(red1.toString());
    System.out.println(UtilBin.EsUnaRed(red1.ip1, red1.ip2,red1.ip3,red1.ip4,red1.bitsRed ));
}
}
