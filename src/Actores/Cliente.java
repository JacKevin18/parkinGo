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
}
