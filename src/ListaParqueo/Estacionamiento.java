package ListaParqueo;

public class Estacionamiento {
    private int id;
    private boolean disponible;
    private int idClient;
    private Estacionamiento sig;

    public Estacionamiento(int id){
        this.id = id;
        sig = null;
        disponible = true;
    }

    public Estacionamiento getSig() {
        return sig;
    }

    public int getId() {
        return id;
    }

    public int getIdClient() {
        return idClient;
    }

    public boolean getDisponible(){
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setSig(Estacionamiento sig) {
        this.sig = sig;
    }
}
