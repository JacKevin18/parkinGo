package ListaParqueo;

public class Estacionamiento {
    private int id;
    private Estacionamiento sig;

    public Estacionamiento(int id){
        this.id = id;
        sig = null;
    }
    public Estacionamiento getSig() {
        return sig;
    }
    public int getId() {
        return id;
    }
}
