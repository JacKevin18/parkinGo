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

    public String generarCodigo() {
        String cod;
        do {
            cod = generarCodigoAzar(6);
        } while (existeCodigo(cod));

        Codigo nuevo = new Codigo(cod);
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
}
