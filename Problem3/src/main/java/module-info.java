module com.example.problem3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.problem3 to javafx.fxml;
    exports com.example.problem3;
}