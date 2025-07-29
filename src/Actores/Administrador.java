package Actores;

import ListaParqueo.Parqueo;

public class Administrador {
    private String nombre;
    private String correo;
    private Parqueo parqueo;

    public Administrador(String nombre,String correo, Parqueo parqueo){
        this.nombre = nombre;
        this.correo = correo;
        this.parqueo =  parqueo;
    }








    public Parqueo getParqueo() {
        return parqueo;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }
}
