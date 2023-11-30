module com.juanite {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml.bind;
    requires jlayer;
    requires java.persistence;
    requires java.sql;

    opens com.juanite to javafx.fxml;
    exports com.juanite;
    exports com.juanite.controller;
    exports com.juanite.model;
    opens com.juanite.controller to javafx.fxml;
    opens com.juanite.connection to java.xml.bind;
}
