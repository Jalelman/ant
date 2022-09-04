/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author ff
 */
public class dashboardController implements Initializable  {
    @FXML
    private Button gUniversity;

    @FXML
    private Button gInstitut;

    @FXML
    private Button gDepartment;

    @FXML
    private Button gFiliere;

    @FXML
    private Button gUtilisateur;

    @FXML
    private Button gniveau;

    @FXML
    private Button gGroupe;

    @FXML
    private Button gSection;

    @FXML
    private Button gEmploi;

    @FXML
    private Button gprofile;

    @FXML
    private Button gbureau;

    @FXML
    private Button gevent;

    @FXML
    private Button gMatiere;

    @FXML
    private Button edit;

    @FXML
    private Button logout;

    @FXML
    private Label user;
    public void account(){
        user.setText(User.username);
    }
    public void navButton(){
        
        gUniversity.setOnMouseClicked((MouseEvent event)->{
            
        gUniversity.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
         
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        });
        gInstitut.setOnMouseClicked((MouseEvent event)->{
            
        gInstitut.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
        
        gDepartment.setOnMouseClicked((MouseEvent event)->{
            
        gDepartment.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
        gFiliere.setOnMouseClicked((MouseEvent event)->{
            
        gFiliere.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gniveau.setOnMouseClicked((MouseEvent event)->{
            
        gniveau.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        }); 
       gGroupe.setOnMouseClicked((MouseEvent event)->{
            
        gGroupe.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gSection.setOnMouseClicked((MouseEvent event)->{
            
        gSection.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gEmploi.setOnMouseClicked((MouseEvent event)->{
            
        gEmploi.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gprofile.setOnMouseClicked((MouseEvent event)->{
            
        gprofile.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gbureau.setOnMouseClicked((MouseEvent event)->{
            
        gbureau.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gevent.setOnMouseClicked((MouseEvent event)->{
            
        gevent.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gMatiere.setOnMouseClicked((MouseEvent event)->{
            
        gMatiere.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gUtilisateur.setOnMouseClicked((MouseEvent event)->{
            
        gUtilisateur.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       
    }
    public void navButtonHover(){
        
        gUniversity.setOnMouseEntered((MouseEvent event)->{
            
        gUniversity.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
         
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
        gInstitut.setOnMouseEntered((MouseEvent event)->{
            
        gInstitut.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
        
        gDepartment.setOnMouseEntered((MouseEvent event)->{
            
        gDepartment.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
        gFiliere.setOnMouseEntered((MouseEvent event)->{
            
        gFiliere.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gniveau.setOnMouseEntered((MouseEvent event)->{
            
        gniveau.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        }); 
       gGroupe.setOnMouseEntered((MouseEvent event)->{
            
        gGroupe.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gSection.setOnMouseEntered((MouseEvent event)->{
            
        gSection.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gEmploi.setOnMouseEntered((MouseEvent event)->{
            
        gEmploi.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gprofile.setOnMouseEntered((MouseEvent event)->{
            
        gprofile.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gbureau.setOnMouseEntered((MouseEvent event)->{
            
        gbureau.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gevent.setOnMouseEntered((MouseEvent event)->{
            
        gevent.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gMatiere.setOnMouseEntered((MouseEvent event)->{
            
        gMatiere.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gUtilisateur.setOnMouseEntered((MouseEvent event)->{
            
        gUtilisateur.setStyle ( "-fx-background-color:linear-gradient(to bottom right, "+ "rgba ( 121 , 172 , 255 , 0.6) , rgba (255 , 106 , 239 , 0.6 ) ) ; "
        + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5) ; " + "-fx-border-width:0px 0px 0px 5px" ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gUniversity.setOnMouseExited((MouseEvent event)->{
            
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
         
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
        gInstitut.setOnMouseExited((MouseEvent event)->{
            
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
        
        gDepartment.setOnMouseExited((MouseEvent event)->{
            
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
        gFiliere.setOnMouseExited((MouseEvent event)->{
            
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gniveau.setOnMouseExited((MouseEvent event)->{
            
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        }); 
       gGroupe.setOnMouseExited((MouseEvent event)->{
            
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gSection.setOnMouseExited((MouseEvent event)->{
            
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gEmploi.setOnMouseExited((MouseEvent event)->{
            
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gprofile.setOnMouseExited((MouseEvent event)->{
            
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gbureau.setOnMouseExited((MouseEvent event)->{
            
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gevent.setOnMouseExited((MouseEvent event)->{
            
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gMatiere.setOnMouseExited((MouseEvent event)->{
            
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUniversity.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
       gUtilisateur.setOnMouseExited((MouseEvent event)->{
            
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gInstitut.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gDepartment.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gFiliere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gniveau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gGroupe.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gSection.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gEmploi.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gprofile.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gbureau.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gevent.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gMatiere.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        gUtilisateur.setStyle ( " -fx - background - color : linear - gradient ( to bottom right , "+
                "rgba ( 121 , 172 , 255 , 0.2 ) , rgba ( 255 , 106 , 239 , 0.2 ) ) " ) ;
        
        
        
        
        
        
        });
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle resource){
        account();
        //design ta3 il menu
        navButton();
        navButtonHover();
    }

    
    
}
