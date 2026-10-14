module com.mycompany.oopproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.oopproject to javafx.fxml;
    exports com.mycompany.oopproject;
}