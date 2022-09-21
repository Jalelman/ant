module tn.elite.learning {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;
    requires com.jfoenix;
    requires javax.mail;
    requires javafx.web;

    opens tn.elite.learning to javafx.fxml;
    exports tn.elite.learning;
}