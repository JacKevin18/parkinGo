public void procesarCodigo(String codigo) {
    if (codigosRegistrados.verificarCodigo(codigo)) {
        parqueo.asignarEstacionamiento();
    } else {
        System.out.println("Código inválido");
    }
}
