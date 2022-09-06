/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Universite;
import Util.MyDB;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author Marwa
 */
public class Afficher_UniversiteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button buniversite;
    private TableView<Universite> table;

    @FXML
    private TableColumn<Universite, Integer> colid;

    @FXML
    private TableColumn<Universite, String> colnoms;

    @FXML
    private Button bajouter;

    @FXML
    private Button bmodifier;

    @FXML
    private Button bsupprimer;
       @FXML
    private Button brechercher;

       
     @FXML
    private AnchorPane AnchorPane;
    @FXML
    private TextField search;
    @FXML
    private TextField TFnom_universite;
   
    
     @FXML
    private TextField TFid;
     
     
    public ObservableList<Universite> data = FXCollections.observableArrayList();

    private PreparedStatement st ;
    private ResultSet rs ;
    private Connection cnx ;
  
    

    @FXML
            
   // public ObservableList<Universite> getUniversite();
    public void afficherUniversite(ActionEvent event) throws SQLException, IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Interface.Afficher_Universite.fxml"));
        Scene scene = new Scene(root,1920,1080);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        String select = "SELECT * FROM `universites` WHERE 1";
       try {
        st = cnx.prepareStatement(select);
        rs = st.executeQuery();
        while(rs.next()){
            
            data.add(new Universite(rs.getInt(1),rs.getString(2)));
           
        }
       }
       catch (SQLException ex){}
      
        colid.setCellValueFactory(new PropertyValueFactory<>("colid"));
        colnoms.setCellValueFactory(new PropertyValueFactory<>("colnoms"));
        data =  (ObservableList<Universite>) MyDB.getInstance().getCnx();
        table.setItems(data);
        

        
     }
    @FXML
    void rechercher_universite(ActionEvent event) throws SQLException {
        String rechercher = "SELECT `id_universite`, `nom` FROM `universites` WHERE nom ='"+TFnom_universite.getText()+"`";
        int m = 0;
        try {
        cnx = MyDB.getInstance().getCnx();
        st = cnx.prepareStatement(rechercher);
        rs = st.executeQuery();
        if (rs.next()){
            TFid.setText(rs.getString(1));
            TFnom_universite.setText(rs.getString(2));
            m = 1;
            
        }
        if (m == 0){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Rechercher Universite");
            alert.setContentText("aucun universite avec cette nom");
            
        }
                
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    
  
    
    void ajouteruniversite(ActionEvent event) throws IOException {
         Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Interface.Ajouter_Universite.fxml"));
        Scene scene = new Scene(root,1920,1080);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @FXML
    void modifieruniversite(ActionEvent event) {

    }

    @FXML
    void supprimeruniversite(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cnx = MyDB.getInstance().getCnx();
        // TODO
    }    

    @FXML
    private void Ajouter_Universite(ActionEvent event) {
    }
    
}

