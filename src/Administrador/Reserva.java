public class Reserva {
    private String idReserva;
    private String nombreUsuario;
    private Parqueo parqueo;

    public Reserva(String idReserva, String nombreUsuario, Parqueo parqueo) {
        this.idReserva = idReserva;
        this.nombreUsuario = nombreUsuario;
        this.parqueo = parqueo;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva){
        this.idReserva = idReserva;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }

    public Parqueo getParqueo() {
        return parqueo;
    }

    @Override
    public String toString() {
        return "Reserva{" +
               "idReserva='" + idReserva + '\'' +
               ", usuario='" + nombreUsuario + '\'' +
               ", parqueo=" + parqueo.getId() +
               '}';
    }
}
