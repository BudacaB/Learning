module org.example.fxtest {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.fxtest to javafx.fxml;
    exports org.example.fxtest;
}