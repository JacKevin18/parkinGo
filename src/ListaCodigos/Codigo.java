package ListaCodigos;

public class Codigo {
    private String codigo;
    private int idEstacionamiento;
    private Codigo sig;

    public Codigo (String codigo){
        this.codigo = codigo;
    }

    public Codigo getSig() {
        return sig;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setSig(Codigo sig) {
        this.sig = sig;
    }
}
