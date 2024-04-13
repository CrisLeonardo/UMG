package org.example;
import org.example.clases.ClsUsuariosMongo;
public class Main {
    public static void main(String[] args) {
        ClsUsuariosMongo u = new ClsUsuariosMongo();
        u.conexion();
        u.crearUsuario();
        u.leerUsuario();
    }
}