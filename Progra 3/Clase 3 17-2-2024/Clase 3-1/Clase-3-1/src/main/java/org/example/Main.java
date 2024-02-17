package org.example;
import Interfaces.MenuHamburguesas;
import Interfaces.IMenu;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


            MenuHamburguesas m = new MenuHamburguesas();
            m.mostrarOpciones();
            m.seleccionarOpcion(2);

    }
}