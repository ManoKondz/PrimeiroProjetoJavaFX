module com.example.primeiroprojetojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primeiroprojetojavafx to javafx.fxml;
    exports com.example.primeiroprojetojavafx;
}