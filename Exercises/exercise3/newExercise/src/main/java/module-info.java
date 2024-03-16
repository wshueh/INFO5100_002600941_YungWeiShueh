module org.example.newexercise {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.newexercise to javafx.fxml;
    exports org.example.newexercise;
}