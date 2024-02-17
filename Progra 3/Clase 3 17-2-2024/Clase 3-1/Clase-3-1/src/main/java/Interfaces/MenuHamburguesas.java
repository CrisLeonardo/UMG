package Interfaces;
import java.util.Scanner;
import Interfaces.IMenu;
import Interfaces.MenuHamburguesas;
public class MenuHamburguesas implements IMenu{
    @Override
    public void mostrarOpciones() {
        System.out.println("*Menu Hamburguesas*");
        System.out.println("1. Hamburguesa Simple");
        System.out.println("2. Hamburguesa de chucho");
        System.out.println("3. Hamburguesa de chucho con queso");
        System.out.println("4. Hamburguesa de chucho y tocino");

    }

    @Override
    public void seleccionarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Hamburguesa Simple");
                break;
            case 2:
                System.out.println("Hamburguesa de chucho");
                break;
            case 3:
                System.out.println("Hamburguesa de chucho con queso");
                break;
            case 4:
                System.out.println("Hamburguesa de chucho y tocino");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
  }
}



}
