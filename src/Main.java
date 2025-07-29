import Actores.Cliente;
import ListaParqueo.Parqueo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Parqueo parqueo1 = new Parqueo();
        Cliente cliente1 = new Cliente(123, "jack", "jackK@.com");

        parqueo1.añadirEstacionamiento(1);
        parqueo1.añadirEstacionamiento(2);
        parqueo1.añadirEstacionamiento(3);
        parqueo1.añadirEstacionamiento(4);

        cliente1.consultarEspacios(parqueo1);

        System.out.print("Ingresa ID de estacionamiento para reservar: ");
        int estacio = scanner.nextInt();
        scanner.nextLine();

        cliente1.reservarEstacio(estacio, parqueo1, 140);
        cliente1.verCodigos();

        System.out.print("Ingresa código para verificar: ");
        String codigo = scanner.nextLine();

        System.out.println("Verificando código...");
        cliente1.verificarCodigo(codigo, parqueo1);

        System.out.print("Ingresa otro ID de estacionamiento para reservar: ");
        estacio = scanner.nextInt();
        scanner.nextLine();

        cliente1.reservarEstacio(estacio, parqueo1, 140);
        cliente1.verCodigos();

        System.out.print("Ingresa código para cancelar: ");
        codigo = scanner.nextLine();

        System.out.println("Cancelando reserva...");
        cliente1.cancelarReserva(codigo, parqueo1);

        scanner.close();
    }
}