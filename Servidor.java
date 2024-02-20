public class Servidor extends Ordenador {
    private int tipo;

    public Servidor(String nombre){
        super(nombre);
    }
    public Servidor(int ip1, int ip2, int ip3, int ip4){
        super(ip1,ip2,ip3,ip4);
    }
    public Servidor(int ip1, int ip2, int ip3, int ip4, int bitsRed){
        super(ip1,ip2,ip3,ip4,bitsRed);
    }
    public Servidor(int ip1, int ip2, int ip3, int ip4, int bitsRed, String nombre){
        super(ip1,ip2,ip3,ip4,bitsRed,nombre);
    }
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
