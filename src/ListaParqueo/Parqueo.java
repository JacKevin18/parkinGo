package ListaParqueo;

import ListaCodigos.CodigosRegistrados;

public class Parqueo {
    private Estacionamiento inicio;
    private CodigosRegistrados codigosRegistrados;

    public Parqueo() {
        inicio = null;
        codigosRegistrados = new CodigosRegistrados();
    }

    private Estacionamiento buscar(int idEstacio){
        Estacionamiento actual = inicio;
        while (actual != null) {
            if (actual.getId() == idEstacio) {
                return actual;
            }
            actual = actual.getSig();
        }
        return null;
    }

    public void añadirEstacionamiento(int id) {
        Estacionamiento actual = inicio;
        while (actual != null) {
            if (actual.getId() == id) {
                System.out.println("❌ Ya existe un estacionamiento con el ID: " + id);
                return;
            }
            actual = actual.getSig();
        }

        Estacionamiento nuevo = new Estacionamiento(id);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            actual = inicio;
            while (actual.getSig() != null) {
                actual = actual.getSig();
            }
            actual.setSig(nuevo);
        }
        System.out.println("✅ Estacionamiento añadido con ID: " + id);
    }

    public boolean eliminarEstacionamiento(int idEstacio) {
        Estacionamiento actual = inicio;
        Estacionamiento anterior = null;

        while (actual != null && actual.getId() != idEstacio) {
            anterior = actual;
            actual = actual.getSig();
        }

        if (actual == null) return false;

        if (anterior == null) {
            inicio = actual.getSig();
        } else {
            anterior.setSig(actual.getSig());
        }
        return true;
    }

    public boolean reservar(int idEstacio, int idClien){
        Estacionamiento est = buscar(idEstacio);
        if (est == null) {
            System.out.println("Estacionamiento no encontrado.");
            return false;
        }
        if (!est.getDisponible()) {
            System.out.println("Estacionamiento ocupado");
            return false;
        }
        est.setDisponible(false);
        est.setIdClient(idClien);
        return true;
    }

    public String consultar(){
        StringBuilder resultado = new StringBuilder();
        Estacionamiento actual = inicio;
        boolean hayDisponibles = false;

        while (actual != null) {
            if (actual.getDisponible()) {
                resultado.append("Estacionamiento ID: ").append(actual.getId()).append(" está disponible.\n");
                hayDisponibles = true;
            }
            actual = actual.getSig();
        }

        if (!hayDisponibles) {
            return "No hay espacios disponibles.";
        }

        return resultado.toString();
    }

    public boolean cancelar(String codigo){
        return codigosRegistrados.cancelarCodigo(codigo);
    }

    public CodigosRegistrados getCodigosRegistrados() {
        return codigosRegistrados;
    }
}
