import ListaParqueo.Parqueo;

public class Main {
    public static void main(String[] args) {



        Parqueo par = new Parqueo();
        boolean yes = par.eliminarEstacionamiento();
        System.out.println("yes: "+ yes);

    }
}