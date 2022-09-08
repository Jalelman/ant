package GUI;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DINA CHIHAOUI
 */
public class controller1 implements Initializable {
    
    @FXML
    private Button button;

    @FXML
    private Button design3;
     
          @Override
    public void initialize(URL url, ResourceBundle rb) {
    }


    @FXML
    void afficher(ActionEvent event) throws IOException {
   
           try {
            Parent parent = FXMLLoader.load(getClass().getResource("test.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(controller1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


        @FXML
    void afficher_grp(ActionEvent event) throws IOException {
        
        
           try {
            Parent parent = FXMLLoader.load(getClass().getResource("groupes.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(controller1.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    
    
       void RETOUR(ActionEvent event) throws IOException {
              try {
            Parent parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(controller1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
    
    
    
    
    
    
    
  

   


    

