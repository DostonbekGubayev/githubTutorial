module com.example.talabalartizimi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.talabalartizimi to javafx.fxml;
    exports com.example.talabalartizimi;
}