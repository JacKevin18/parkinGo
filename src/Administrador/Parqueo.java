public class Parqueo {
    private int id;
    private String tipo;
    private String ubicacion;
    private boolean disponible;

    public Parqueo(int id, String tipo, String ubicacion) {
        this.id = id;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.disponible = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id= id ;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    public boolean isDisponible() {
        return disponible;
    }

    public boolean getDisponible(){
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Parqueo{" +
               "id='" + id + '\'' +
               ", tipo='" + tipo + '\'' +
               ", ubicacion='" + ubicacion + '\'' +
               ", disponible=" + disponible +
               '}';
    }
}