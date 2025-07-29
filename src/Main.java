import Actores.Cliente;
import ListaParqueo.Parqueo;

public class Main {
    public static void main(String[] args) {

        Parqueo est1 = new Parqueo();
        Parqueo est2 = new Parqueo();
        Parqueo est3 = new Parqueo();

        est1.añadirEstacionamiento(1);
        Cliente clie1 = new Cliente(123, "jack", "yo@.com");
        clie1.reservarEstacio(1, est1, 140);
    }
}