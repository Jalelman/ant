/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ant_elearning;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Marwa
 */
public class ANT_Elearning extends Application {
    
    
//    
//    @Override
//    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("/Interface/Afficher_Universite.fxml"));       
//        Scene scene = new Scene(root); 
//        stage.setScene(scene);
//        stage.show();
//    }
    
    @Override
    public void start(Stage primaryStage) throws IOException {
       
        try {
        Parent root = FXMLLoader.load(getClass().getResource("/Interface/Afficher_Universite.fxml"));
        primaryStage = new Stage();
        Scene scene = new Scene(root, 1080, 1920);
        scene.getStylesheets().add(getClass().getResource("/Interface/afficher_universite.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
//        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
