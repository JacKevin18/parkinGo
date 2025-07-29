package Actores;

import ListaParqueo.Parqueo;

import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nombre;
    private String correo;
    private ArrayList<String> codigos;
    private boolean registrado = false;

    public Cliente(int id, String nombre, String correo){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        codigos = new ArrayList<>();
    }

    public boolean registrase(){
        if(registrado == true){
            System.out.println("usuario registrado");
            return false;
        }
        registrado = true;
        return true;
    }

    public boolean reservarEstacio(int idEstacio, Parqueo parqueo, int pago){
        boolean res  = parqueo.reservar(idEstacio, id);
        if(res == false){
            return false;
        }
        if(pago< 100){
            System.out.print("pago incompleto");
            return false;
        }

        String codigo = parqueo.getCodigosRegistrados().generarCodigo();
        codigos.add(codigo);

        System.out.println("Recibo: El pago fue completado con éxito. Estacionamiento reservado: " + idEstacio);
        System.out.println("Código de reserva: " + codigo);

        return true;
    }

    public String consultarEspacios(Parqueo parqueo){
        String res = parqueo.consultar();
        System.out.print(res);
        return res;
    }

    public boolean cancelarReserva(String codigo, Parqueo parqueo){
        return parqueo.cancelar(codigo);
    }

    public void verCodigos() {
        if (codigos.isEmpty()) {
            System.out.println("Este cliente no tiene códigos registrados.");
            return;
        }
        System.out.println("Códigos registrados por el cliente:");
        for (String codigo : codigos) {
            System.out.println("- " + codigo);
        }
    }
}
