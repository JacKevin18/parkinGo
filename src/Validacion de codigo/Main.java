// Clase principal para probar
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear reservas simuladas
        Reserva r1 = new Reserva("CAR12561");
        Reserva r2 = new Reserva("XYZ6798");
        r2.cancelar(); // Esta reserva está cancelada

        List<Reserva> lista = new ArrayList<>();
        lista.add(r1);
        lista.add(r2);

        // Verificador
        VerificadorDeCodigo verificador = new VerificadorDeCodigo(lista);

        // Pruebas
        verificador.validarCodigo("CAR12561");  //  válido
        verificador.validarCodigo("XYZ6798");  //  inactivo
        verificador.validarCodigo("000000");  //  no existe
    }
}
