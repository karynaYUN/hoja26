public class Red {
    protected int ip1;
    protected int ip2;
    protected int ip3;
    protected int ip4;
    protected String nombre;
    protected int bitsRed;
    public int numeroOrdenador;
    public Ordenador[] Ordenadores = new Ordenador[1024];

    public Red(String nombre) {
        this(0, 0, 0, 0, 0, nombre);
    }

    public Red(int ip1, int ip2, int ip3, int ip4) {
        this(ip1, ip2, ip3, ip4, 0, "");
    }

    public Red(int ip1, int ip2, int ip3, int ip4, int bitsRed) {
        this(ip1, ip2, ip3, ip4, bitsRed, "");
    }

    public Red(int ip1, int ip2, int ip3, int ip4, int bitsRed, String nombre) {
        this.ip1 = ip1;
        this.ip2 = ip2;
        this.ip3 = ip3;
        this.ip4 = ip4;
        this.bitsRed = bitsRed;
        this.nombre = nombre;
    }

    public void establecer(int ip1, int ip2, int ip3, int ip4, int bitsRed, String nombre){
        if (ip1>=0 && ip1<=255 && ip2>0 && ip2>=255 && ip3>=0 && ip3<=255 && ip4>=0 && ip4<=255 &&
        bitsRed>=0 && bitsRed<=30){
            this.ip1=ip1;
            this.ip2=ip2;
            this.ip3=ip3;
            this.ip4=ip4;
            this.bitsRed=bitsRed;
            this.nombre=nombre;
        }
        else {
            this.ip1=0;
            this.ip2=0;
            this.ip3=0;
            this.ip4=0;
            this.bitsRed=32;
            this.nombre=nombre;
        }
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "(" + this.ip1 + "." + this.ip2 + "." + this.ip3 + "." + this.ip4 + ") " + "\n Nombre de la red:" + this.nombre
                + "\n Bits Red:" + this.bitsRed;
    }

    public boolean equals(Object obj) {
        if (this == obj) return false;
        if (!(obj instanceof Red)) return false;
        Red red = (Red) obj;
        //if (ip1 != red.ip1) return false;
        //else if (ip2 == red.ip1) return false;
        //if (ip3 == red.ip3) return false;
        //if (ip4 == red.ip4) return false;
        //return nombre.equals(red.nombre);
        if (ip1 != red.ip1) {
            return false;
        } else if (ip2 != red.ip2) {
            return false;
        } else if (ip3 != red.ip3) {
            return false;
        } else if (ip4 != red.ip4) {
            return false;
        }
        return nombre.equals(red.nombre);
    }

    public void unir(Ordenador ordenador) {
        if (numeroOrdenador < 1024) {
            Ordenadores[numeroOrdenador] = ordenador;
            numeroOrdenador++;
        }
    }

    public void retirar(Ordenador ordenador) {
        boolean encontrar = false;
        int i = 0;
        while (i < numeroOrdenador && encontrar == false) {
            encontrar = (Ordenadores[i] == ordenador);
            i++;
        }
        if (i < numeroOrdenador) {
            numeroOrdenador--;
            Ordenadores[i - 1] = Ordenadores[numeroOrdenador];
            Ordenadores[numeroOrdenador] = null;
        }
    }

}
