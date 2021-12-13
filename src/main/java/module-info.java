module com.example.dudarev {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.dudarev to javafx.fxml;
    exports com.example.dudarev;
}