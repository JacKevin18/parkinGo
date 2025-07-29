package ListaCodigos;

import java.util.Random;

public class CodigosRegistrados {
    private Codigo inicio;

    public CodigosRegistrados(){
        inicio =  null;
    }

    private String generarCodigoAzar(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder codigo = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            codigo.append(caracteres.charAt(indice));
        }

        return codigo.toString();
    }

    private boolean existeCodigo(String cod) {
        Codigo actual = inicio;
        while (actual != null) {
            if (actual.getCodigo().equals(cod)) {
                return true;
            }
            actual = actual.getSig();
        }
        return false;
    }

    public String generarCodigo(int idEstacionamiento) {
        String cod;
        do {
            cod = generarCodigoAzar(6);
        } while (existeCodigo(cod));

        Codigo nuevo = new Codigo(cod, idEstacionamiento);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Codigo actual = inicio;
            while (actual.getSig() != null) {
                actual = actual.getSig();
            }
            actual.setSig(nuevo);
        }
        return cod;
    }


    private int obtenerIdEstacionamiento(String codigo) {
        Codigo actual = inicio;

        while (actual != null) {
            if (actual.getCodigo().equals(codigo)) {
                return actual.getIdEstacionamiento();
            }
            actual = actual.getSig();
        }
        return -1;
    }

    public int cancelarCodigo(String codigo){
        int res = obtenerIdEstacionamiento(codigo);
        if(-1 == res){
            System.out.print("No existe una reserva con ese codigo");
            return res;
        }
        eliminar(codigo);
        System.out.print("Cancelacion exitosa");
        return res;
    }

    public int verificarCodigos(String codigo){
        int res = obtenerIdEstacionamiento(codigo);
        if(-1 == res){
            System.out.print("No existe una reserva con ese codigo");
            return res;
        }
        eliminar(codigo);
        System.out.print("verificacion exitosa");
        return res;
    }

    private boolean eliminar(String codigo){
        Codigo actual = inicio;
        Codigo anterior = null;

        while (actual != null) {
            if (actual.getCodigo().equals(codigo)) {
                if (anterior == null) {
                    inicio = actual.getSig();
                } else {
                    anterior.setSig(actual.getSig());
                }
                return true;
            }
            anterior = actual;
            actual = actual.getSig();
        }
        return false;
    }
}
