/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import services.Serviceniveau;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import models.niveau;
import models.niveau;
import org.controlsfx.control.Notifications;
import utils.MyDb;

/**
 * FXML Controller class
 *
 * @author HO
 */
public class AddniveauController implements Initializable {

    @FXML
    private Label text_categories;
    @FXML
    private JFXTextField type;

      private boolean update;
    int categorie_id;
    String query = null;
    Connection connection = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void save(MouseEvent event) {
        connection = MyDb.getInstance().getCnx();
        String typee = type.getText();

        if (typee.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Please Fill All DATA");
            alert.showAndWait();

        } else {
            insert2();
            clean();

        }
    }

    @FXML
    private void clean() {
        type.setText(null);
    }

    void setTextField(int id, String nom) {
        categorie_id = id;
        type.setText(nom);
    }
    void setUpdate(boolean b) {
        this.update = b;
    }
    
        private void insert2() {
        if (update == false) {

            niveau nv = new niveau(type.getText());
            services.Serviceniveau Ip = new Serviceniveau();
            Ip.ajouter(nv);
            type.setText(null);
            
        } else {
            niveau nv = new niveau(categorie_id, type.getText());
            Serviceniveau Ip = new Serviceniveau();
            Ip.modifier(nv);
            type.setText(null);
           

        }

    }

}