// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Nieto.Topping;
import Padre.Pizza;
import Hijo.PizzaItaliana;


public class Main {



    public static void main(String[] args) {

        System.out.println("");
        Pizza sm = new Pizza("De la Casa" , 60 , "Peperoni,piña,queso,aceitunas,carne");
        System.out.println(sm.toString());
        PizzaItaliana sm2 = new PizzaItaliana("Italiana" , 60 , "tomate");
        System.out.println(sm2.toString());
        Topping sm3 = new Topping("Queso,Peperoni,Piña,Aceitunas,Carne");
        System.out.println(sm3.toString());
        System.out.println(sm.preparPizaa());
    }
}