import Actores.Cliente;
import ListaParqueo.Parqueo;

public class Main {
    public static void main(String[] args) {

        Parqueo est1 = new Parqueo();

        est1.añadirEstacionamiento(1);
        est1.añadirEstacionamiento(2);
        est1.añadirEstacionamiento(3);
        est1.añadirEstacionamiento(4);

        Cliente clie1 = new Cliente(123, "jack", "yo@.com");
        clie1.reservarEstacio(1, est1, 140);

        clie1.consultarEspacios(est1);
        clie1.cancelarReserva("pepe", est1);


    }
}