public class Ordenador {
    private int ip1;
    private int ip2;
    private int ip3;
    private int ip4;
    private String nombre;
    protected int bitsRed;

    public Ordenador(String nombre){
        this(0,0,0,0,0,nombre);
    }
    public Ordenador(int ip1, int ip2, int ip3, int ip4){
        this(ip1,ip2,ip3,ip4,0,"");
    }
    public Ordenador(int ip1, int ip2, int ip3, int ip4, int bitsRed){
        this(ip1,ip2,ip3,ip4,0,"");
    }
    public Ordenador(int ip1, int ip2, int ip3, int ip4,int bitsRed,String nombre){
        this.ip1=ip1;
        this.ip2=ip2;
        this.ip3=ip3;
        this.ip4=ip4;
        this.nombre=nombre;
        this.bitsRed=bitsRed;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "("+this.ip1+","+this.ip2+","+this.ip3+","+this.ip4+")"+"\nNombre:"
                +this.nombre+"\nBits Red:"+this.bitsRed;
    }
}
