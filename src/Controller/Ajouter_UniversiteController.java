/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Universite;
import Util.MyDB;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Marwa
 */
public class Ajouter_UniversiteController implements Initializable {
     @FXML
    private TextField TFid;

    @FXML
    private TextField TFnom_universite;

    @FXML
    private Button bsave;
    @FXML
    private Button brechercher;
    @FXML
    private PreparedStatement st ;
    private ResultSet rs ;
    private Connection cnx ;
     
    
    @FXML
   public void Ajouter_Universite(ActionEvent event) throws SQLException {
        String textid = TFid.getText();
        String nom = TFnom_universite.getText();
        String insert = "INSERT INTO `universites`(`id_universite`, `nom`) VALUES (?,?)";
        if(!nom.equals("")&&(!textid.equals(""))){
        try {
        cnx = MyDB.getInstance().getCnx();
        st = cnx.prepareStatement(insert);
        st.setString(1, textid);
        st.setString(2, nom);
        st.execute();
        TFid.clear();
        TFnom_universite.clear();
        
        
       
       
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Data Insert");
        alert.setHeaderText("Information dialogue");
        alert.setContentText("Reccord saved successfully");
        alert.showAndWait();
        
        }
        catch (SQLException ex){
        ex.printStackTrace();
        }
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Data Insert");
            alert.setHeaderText("Information Dialogue");
            alert.setContentText("Remplir tous les chemps");
            alert.showAndWait();
        }
        
//        
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
