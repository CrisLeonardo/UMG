package edu.formularios;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class frmPizza {
    private JPanel jpanelPrincipal;
    private JComboBox comboBoxToppings;
    private JTextField txtPizza;
    private JButton btnAddingingrediente;
    private JLabel lblTotal;
    private JList lista1;
    private JButton prepararpizza;
    private JTabbedPane tabbedPane1;
    private JComboBox comboBoxPer;
    private JButton btnPizza;
    private JList lista2;
    private JLabel btTotal;
    private JList list3;
    private JComboBox comboBox1;
    private JComboBox comboBoxTamaño;
    private JComboBox comboBoxTamaño2;
    private JButton prepararpizza2;
    private JList list4;
    private List<Topping> ingredientesPizzaEndiablada = new ArrayList<>();
    private List<Topping> ingredientesPizzaItaliana = new ArrayList<>();

    private List<Topping> ingredientesPizzaEncantada = new ArrayList<>();
    private List<Topping> ingredientesPizzaCyberPunk = new ArrayList<>();

    private List<Topping> ingredientesPizzaZombie = new ArrayList<>();

    private double total = 0.0;
    private DefaultListModel modeloLista = new DefaultListModel();

    private List<Topping> ingredientes = new ArrayList<>();

    public JPanel getJpanelPrincipal() {
        return jpanelPrincipal;
    }

    private JTextArea textAreaPreparation;

    public frmPizza() {

        comboBoxPer.addItem("Pizza Endiablada");
        comboBoxPer.addItem("Pizza Italiana");
        comboBoxPer.addItem("Pizza Encantada");
        comboBoxPer.addItem("Pizza CyberPunk");
        comboBoxPer.addItem("Pizza Zombie");
        DefaultListModel modeloLista2 = new DefaultListModel();
        lista2.setModel(modeloLista2);

        DefaultListModel modeloLista3 = new DefaultListModel();
        list3.setModel(modeloLista3);
        cargarToppings();
        pizzaEndiablada();
        pizzaItaliana();
        pizzaEncantada();
        pizzaCyberPunk();
        pizzaZombie();

        comboBoxTamaño.addItem("Pueña");
        comboBoxTamaño.addItem("Mediana");
        comboBoxTamaño.addItem("Grande");

        comboBoxTamaño2.addItem("Pueña");
        comboBoxTamaño2.addItem("Mediana");
        comboBoxTamaño2.addItem("Grande");

        DefaultListModel modeloLista4 = new DefaultListModel();
        list4.setModel(modeloLista4);


        btnAddingingrediente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Topping ingrediente = (Topping) comboBoxToppings.getSelectedItem();
                modeloLista.addElement(ingrediente); // Add the actual Topping object
                lista1.setModel(modeloLista);
                total += ingrediente.getPrice();
                lblTotal.setText(String.valueOf(total));
            }
        });



        //Accion listeren para pizzas preestablecidas


        btnPizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pizzaSeleccionada = (String) comboBoxPer.getSelectedItem();
                modeloLista2.clear(); // Limpiamos la lista2 antes de agregar nuevos ingredientes
                total = 0.0; // Reiniciamos el total

                List<Topping> selectedPizzaIngredients = new ArrayList<>();

                if (pizzaSeleccionada.equals("Pizza Endiablada")) {
                    selectedPizzaIngredients.addAll(ingredientesPizzaEndiablada);
                } if (pizzaSeleccionada.equals("Pizza Encantada")) {
                    selectedPizzaIngredients.addAll(ingredientesPizzaEncantada);

                } if(pizzaSeleccionada.equals("Pizza CyberPunk")){
                    selectedPizzaIngredients.addAll(ingredientesPizzaCyberPunk);
                } if( pizzaSeleccionada.equals("Pizza Zombie")){
                    selectedPizzaIngredients.addAll(ingredientesPizzaZombie);
                }
                else if (pizzaSeleccionada.equals("Pizza Italiana")) {
                    selectedPizzaIngredients.addAll(ingredientesPizzaItaliana);
                }

                for (Topping ingrediente : selectedPizzaIngredients) {
                    modeloLista2.addElement(ingrediente.toString());
                    total += ingrediente.getPrice();
                }

                lista2.setModel(modeloLista2);
                btTotal.setText(String.valueOf(total));
            }
        });
        prepararpizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pizza pizza = new Pizza(txtPizza.getText());
                Topping topi;
                for (int i = 0; i < lista1.getModel().getSize(); i++) {
                    topi = (Topping) lista1.getModel().getElementAt(i);
                    pizza.addTopping(topi);
                }
                if (pizza.getToppings().size() == 0) {
                    JOptionPane.showMessageDialog(null, "Debe agregar al menos un ingrediente");
                    return;
                } else {
                    // Captura la salida del proceso de preparación
                    StringBuilder preparationOutput = new StringBuilder();
                    preparationOutput.append("Preparando... ").append(pizza.getName()).append("\n");

                    for (Topping topping : pizza.getToppings()) {
                        preparationOutput.append("Añadiendo ").append(topping.getNombre()).append(" Q").append(topping.getPrice()).append("\n");



                    }

                    preparationOutput.append("\n¡La pizza está lista!\n");

                    modeloLista3.addElement(preparationOutput.toString()); // Agrega el proceso de preparación a list3
                    list3.setModel(modeloLista3); // Actualiza el modelo de list3
                }
            }
        });

        comboBoxTamaño.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tamañoSeleccionado = (String) comboBoxTamaño.getSelectedItem();
                double precioBase = 0.0; // Define los precios base para cada tamaño

                // Asigna el precio base según el tamaño seleccionado
                if (tamañoSeleccionado.equals("Pequeña")) {
                    precioBase = 0; // Precio base para pizza pequeña
                } else if (tamañoSeleccionado.equals("Mediana")) {
                    precioBase = 5; // Precio base para pizza mediana
                } else if (tamañoSeleccionado.equals("Grande")) {
                    precioBase = 10; // Precio base para pizza grande
                }

                // Actualiza el precio total sumando el precio base
                total = precioBase;
                lblTotal.setText(String.valueOf(total));
            }
        });

        prepararpizza2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pizzaSeleccionada = (String) comboBoxPer.getSelectedItem();
                DefaultListModel modeloLista4 = new DefaultListModel();
                boolean pizzaLista = false;

                if (pizzaSeleccionada.equals("Pizza Endiablada")) {
                    for (Topping ingrediente : ingredientesPizzaEndiablada) {
                        modeloLista4.addElement(ingrediente.getNombre()); // Aquí obtenemos el nombre del ingrediente
                    }
                } else if (pizzaSeleccionada.equals("Pizza Encantada")) {
                    for (Topping ingrediente : ingredientesPizzaEncantada) {
                        modeloLista4.addElement(ingrediente.getNombre());
                    }
                } else if (pizzaSeleccionada.equals("Pizza CyberPunk")) {
                    for (Topping ingrediente : ingredientesPizzaCyberPunk) {
                        modeloLista4.addElement(ingrediente.getNombre());
                    }
                } else if (pizzaSeleccionada.equals("Pizza Zombie")) {
                    for (Topping ingrediente : ingredientesPizzaZombie) {
                        modeloLista4.addElement(ingrediente.getNombre());
                    }
                } else if (pizzaSeleccionada.equals("Pizza Italiana")) {
                    for (Topping ingrediente : ingredientesPizzaItaliana) {
                        modeloLista4.addElement(ingrediente.getNombre());
                    }
                }

                list4.setModel(modeloLista4); // Actualiza el modelo de list4 con los nombres de los ingredientes

                pizzaLista = true;
                if (pizzaLista) {
                    JOptionPane.showMessageDialog(null, "¡La pizza está lista!");
                }
            }
        });
                comboBoxTamaño2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tamañoSeleccionado = (String) comboBoxTamaño2.getSelectedItem();
                double precioBase = 0.0; // Define los precios base para cada tamaño

                // Asigna el precio base según el tamaño seleccionado
                if (tamañoSeleccionado.equals("Pequeña")) {
                    precioBase = 0; // Precio base para pizza pequeña
                } else if (tamañoSeleccionado.equals("Mediana")) {
                    precioBase = 5; // Precio base para pizza mediana
                } else if (tamañoSeleccionado.equals("Grande")) {
                    precioBase = 10; // Precio base para pizza grande
                }

                // Actualiza el precio total sumando el precio base
                total = precioBase;
                lblTotal.setText(String.valueOf(total));
            }
        });
    }

    // Carga los ingredientes en lista2


    private void cargarToppings(){

        ingredientes.add(new Topping("Champiñones", 2.55));
        ingredientes.add(new Topping("Jamon", 1.55));
        ingredientes.add(new Topping("Queso mozzarella", 3));
        ingredientes.add(new Topping("Jamon de pavo", 2.55));
        ingredientes.add(new Topping("Cebolla", 1.99));
        ingredientes.add(new Topping("Pimientos", 0.99));
        ingredientes.add(new Topping("Pepperoni", 2.99));
        ingredientes.add(new Topping("Anchoas", 2.99));
        ingredientes.add(new Topping("Aceitunas", 1));
        ingredientes.add(new Topping("Champiñones rojos", 2.55));
        ingredientes.add(new Topping("Jamon Picante", 1.55));
        ingredientes.add(new Topping("Queso Cabrales", 3));
        ingredientes.add(new Topping("Jamon de pavo a la brava", 2.55));
        ingredientes.add(new Topping("Cebolla Morda", 1.99));
        ingredientes.add(new Topping("Pimientos naga viper", 0.99));
        ingredientes.add(new Topping("Chile del cachudo", 2.99));
        ingredientes.add(new Topping("Chile abanero", 2.99));
        ingredientes.add(new Topping("chile normalito pero picoso", 1.99));
        ingredientes.add(new Topping("Hongos Mágicos", 5.99));
        ingredientes.add(new Topping("Polvo de Hada", 4.49));
        ingredientes.add(new Topping("Salsa de Unicornio", 3.99));
        ingredientes.add(new Topping("Queso de Elfo", 5.99));
        ingredientes.add(new Topping("Tuercas de Robot", 4.99));
        ingredientes.add(new Topping("Salsa de Plasma", 5.99));
        ingredientes.add(new Topping("Queso Nanotecnológico", 6.99));
        ingredientes.add(new Topping("Alambre de Fibra Óptica", 7.99));
        ingredientes.add(new Topping("Aceite Espacial", 4.99));
        ingredientes.add(new Topping("Cerebros Fritos", 4.99));
        ingredientes.add(new Topping("vísceras de humanos", 5.99));
        ingredientes.add(new Topping("Hueso en polvo", 2.99));
        ingredientes.add(new Topping("Higado a la parrilla", 3.99));
        ingredientes.add(new Topping("Carne humana asada", 3.99));


        DefaultComboBoxModel model = new DefaultComboBoxModel(ingredientes.toArray());
        comboBoxToppings.setModel(model);

    }

    private void pizzaItaliana() {
        ingredientesPizzaItaliana.clear(); // Clear the list before adding ingredients
        ingredientesPizzaItaliana.add(new Topping("Champiñones", 2.55));
        ingredientesPizzaItaliana.add(new Topping("Jamon", 1.55));
        ingredientesPizzaItaliana.add(new Topping("Queso mozzarella", 3));
        ingredientesPizzaItaliana.add(new Topping("Jamon de pavo", 2.55));
        ingredientesPizzaItaliana.add(new Topping("Cebolla", 1.99));
        ingredientesPizzaItaliana.add(new Topping("Pimientos", 0.99));
        ingredientesPizzaItaliana.add(new Topping("Pepperoni", 2.99));
        ingredientesPizzaItaliana.add(new Topping("Anchoas", 2.99));
        ingredientesPizzaItaliana.add(new Topping("Aceitunas", 1));
    }

    private void pizzaEndiablada() {
        ingredientesPizzaEndiablada.clear(); // Clear the list before adding ingredients
        ingredientesPizzaEndiablada.add(new Topping("Champiñones rojos", 2.55));
        ingredientesPizzaEndiablada.add(new Topping("Jamon Picante", 1.55));
        ingredientesPizzaEndiablada.add(new Topping("Queso Cabrales", 3));
        ingredientesPizzaEndiablada.add(new Topping("Jamon de pavo a la brava", 2.55));
        ingredientesPizzaEndiablada.add(new Topping("Cebolla Morda", 1.99));
        ingredientesPizzaEndiablada.add(new Topping("Pimientos naga viper", 0.99));
        ingredientesPizzaEndiablada.add(new Topping("Chile del cachudo", 2.99));
        ingredientesPizzaEndiablada.add(new Topping("Chile abanero", 2.99));
        ingredientesPizzaEndiablada.add(new Topping("chile normalito pero picoso", 1.99));
    }

    private void pizzaEncantada() {
        ingredientesPizzaEncantada.clear();
        ingredientesPizzaEncantada.add(new Topping("Hongos Mágicos", 5.99));
        ingredientesPizzaEncantada.add(new Topping("Polvo de Hada", 4.49));
        ingredientesPizzaEncantada.add(new Topping("Salsa de Unicornio", 3.99));
        ingredientesPizzaEncantada.add(new Topping("Queso de Elfo", 5.99));
    }

    private void pizzaCyberPunk() {
        ingredientesPizzaCyberPunk.clear();
        ingredientesPizzaCyberPunk.add(new Topping("Tuercas de Robot", 4.99));
        ingredientesPizzaCyberPunk.add(new Topping("Salsa de Plasma", 5.99));
        ingredientesPizzaCyberPunk.add(new Topping("Queso Nanotecnológico", 6.99));
        ingredientesPizzaCyberPunk.add(new Topping("Alambre de Fibra Óptica", 7.99));
        ingredientesPizzaCyberPunk.add(new Topping("Aceite Espacial", 4.99));
    }

    private void pizzaZombie() {
        ingredientesPizzaZombie.clear();
        ingredientesPizzaZombie.add(new Topping("Cerebros Fritos", 4.99));
        ingredientesPizzaZombie.add(new Topping("vísceras de humanos", 5.99));
        ingredientesPizzaZombie.add(new Topping("Hueso en polvo", 2.99));
        ingredientesPizzaZombie.add(new Topping("Higado a la parrilla", 3.99));
        ingredientesPizzaZombie.add(new Topping("Carne humana asada", 3.99));
    }




    }

