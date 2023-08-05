package com.example.demostracion1;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import javafx.stage.Stage;

public class HelloController {
    /*@FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/
    @FXML
    private TextField nombreTextField;

    @FXML
    private TextField apellidoTextField;

    @FXML
    private TextField correoTextField;

    @FXML
    private TextField IDTextField;

    @FXML
    private Slider edadSlider;

    @FXML
    private DatePicker fechaNacimientoPicker;

    @FXML
    private RadioButton generoMasculino;

    @FXML
    private RadioButton generoFemenino;

    @FXML
    private RadioButton generoOtro;

    @FXML
    private ComboBox<String> carreraComboBox;

    @FXML
    private ComboBox<String> combobox;

    @FXML
    private void initialize() {
        // Check the items property of the combobox
        System.out.println("The combobox has " + combobox.getItems().size() + " items.");

        // Check the visible property of the combobox
        System.out.println("The combobox is " + (combobox.isVisible() ? "visible" : "not visible"));

        // Check the disable property of the combobox
        System.out.println("The combobox is " + (combobox.isDisabled() ? "disabled" : "not disabled"));
    }
    @FXML
    private void carreraComboBoxSeleccionado() {
        String selectedCarrera = carreraComboBox.getSelectionModel().getSelectedItem();
        System.out.println("Carrera seleccionada: " + selectedCarrera);
    }
    // Método para manejar la acción del botón "Guardar" o cualquier otra interacción
    @FXML
    private void guardar() {
        // Obtener los valores de los controles y realizar la lógica necesaria aquí
        String nombre = nombreTextField.getText();
        double edad = edadSlider.getValue();

        // Obtener más valores y realizar acciones necesarias
        // ...

        // Ejemplo de impresión de los valores obtenidos
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        // Imprimir más valores
        // ...
    }
}