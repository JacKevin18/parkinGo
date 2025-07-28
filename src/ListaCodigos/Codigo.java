package ListaCodigos;

public class Codigo {
    private String codigo;
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
}
