module com.example.demostracion1 {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
                        
    opens com.example.demostracion1 to javafx.fxml;
    exports com.example.demostracion1;
}