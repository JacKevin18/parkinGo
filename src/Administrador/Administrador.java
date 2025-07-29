import java.util.ArrayList;

public class Administrador {
    private String nombre;
    private String correo;
    private String telefono;
    private ArrayList<Parqueo> parqueos;
    private ArrayList<Reserva> reservas;

    public Administrador(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.parqueos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public boolean iniciarSesion(String nombreIngresado, String correoIngresado, String telefonoIngresado) {
        boolean ingreso = false;
        ingreso = this.nombre.equals(nombreIngresado) && this.correo.equals(correoIngresado) 
                  && this.telefono.equals(telefonoIngresado);
        return ingreso;
}
    public void añadirParqueo(Parqueo parqueo) {
        parqueos.add(parqueo);
        System.out.println("Parqueo añadido: " + parqueo.getId());
    }

    public void eliminarParqueo(int idParqueo) {
        for (Parqueo parqueo : parqueos){
            if (parqueo.getId() == idParqueo) { 
                parqueos.remove(parqueo);
                System.out.println("Parqueo eliminado: " + idParqueo);
                break; 
            }
        }
    }

    public void espaciosDisponibles() {
        System.out.println("Parqueos disponibles:");
        for (Parqueo p : parqueos) {
            if (p.isDisponible()) {
                System.out.println(p);
            }
        }
    }

    public void cambiarEstadoParqueo(int idParqueo, boolean disponible) {
        for (Parqueo p : parqueos) {
            if (p.getId() == idParqueo) {
                p.setDisponible(disponible);
                return;
            }
        }
        System.out.println("Parqueo no encontrado.");
    }

    public void verParqueos() {
        System.out.println("Lista de todos los parqueos:");
        for (Parqueo p : parqueos) {
            System.out.println(p);
        }
    }

    public void gestionarReserva(Reserva reserva) {
        reservas.add(reserva);
        reserva.getParqueo().setDisponible(false);
        System.out.println("Reserva gestionada: " + reserva.getIdReserva());
    }

    public void verReservas() {
        System.out.println("Lista de reservas:");
        for (Reserva r : reservas) {
            System.out.println(r);
        }
    }
}