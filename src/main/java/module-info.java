module com.yogax.yogax {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.yogax.yogax to javafx.fxml;
    exports com.yogax.yogax;
}