module com.example.dudarev {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dudarev to javafx.fxml;
    exports com.example.dudarev;
}