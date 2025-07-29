// Clase Reserva
public class Reserva {
    private String codigo;
    private boolean activa;

    public Reserva(String codigo) {
        this.codigo = codigo;
        this.activa = true;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean estaActiva() {
        return activa;
    }

    public void cancelar() {
        this.activa = false;
    }
}
