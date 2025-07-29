// Clase VerificadorDeCodigo
import java.util.List;

public class VerificadorDeCodigo {
    private final List<Reserva> reservas;

    public VerificadorDeCodigo(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public boolean validarCodigo(String codigoIngresado) {
        for (Reserva reserva : reservas) {
            if (reserva.getCodigo().equals(codigoIngresado)) {
                if (reserva.estaActiva()) {
                    System.out.println("✅ Codigo valido. Acceso permitido.");
                    return true;
                } else {
                    System.out.println("⛔ Codigo inactivo. Reserva cancelada o usada.");
                    return false;
                }
            }
        }
        System.out.println("❌ Codigo no encontrado.");
        return false;
    }
}
