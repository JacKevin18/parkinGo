package ListaCodigos;

public class Codigo {
    private String codigo;
    private int idEstacionamiento;
    private Codigo sig;

    public Codigo (String codigo, int idEstacionamiento){
        this.codigo = codigo;
        this.idEstacionamiento = idEstacionamiento;
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
