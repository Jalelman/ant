/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Elife-Kef-056
 */
public class FXMLDocumentController implements Initializable {

    Connection con;
    private PreparedStatement st;
    private ResultSet result;
    
    @FXML
    private AnchorPane connecter_form;
    
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button login_btn;

    @FXML
    private Hyperlink create_acc;

    @FXML
    private Label ant;

    @FXML
    private AnchorPane inscrire_form;
    @FXML
    private TextField email;

    private TextField name;
    @FXML
    private TextField second;

    @FXML
    private PasswordField pwd;

    @FXML
    private Button inscrire;

    @FXML
    private Hyperlink conn;

    @FXML
    private ComboBox<String> mybox;
    
    @FXML
    private Label ant1;

    private String[] role = {"Administrateur", "Enseignant(e)", "Formateur/Formatrice", "Etudiant(e)"};
    
    @FXML
    private TextField name1;
    
    @FXML
    void Connecter(ActionEvent event) throws Exception {

        con = MyDb.getInstance().getCnx();

        String sql = "Select * from users where Nom=? AND Password=? ";

        try {

            st = con.prepareStatement(sql);
            st.setString(1, username.getText());
            st.setString(2, password.getText());

            result = st.executeQuery();
            if(username.getText().isEmpty() && password.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Remplir les champs vides");
            }else{

            if (result.next()) {
                User.username = result.getString("nom");
                JOptionPane.showMessageDialog(null, "Connecter avec succé");

                String s1 = result.getString("Role");

                if (s1.equalsIgnoreCase("admin")) {
                    login_btn.getScene().getWindow().hide();
                    Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }

                if (s1.equalsIgnoreCase("formateur")) {
                    login_btn.getScene().getWindow().hide();
                    Parent root = FXMLLoader.load(getClass().getResource("formateur/Formateur.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
                if (s1.equalsIgnoreCase("enseignant")) {
                    login_btn.getScene().getWindow().hide();
                    Parent root = FXMLLoader.load(getClass().getResource("enseignant/Enseignant.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
                if (s1.equalsIgnoreCase("etudiant")) {
                    login_btn.getScene().getWindow().hide();
                    Parent root = FXMLLoader.load(getClass().getResource("etudiant/Etudiant.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Nom de l'utilisateur et mot de passe incorrectes");
            }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @FXML
    public void Inscrire(ActionEvent event) throws SQLException {
        con = MyDb.getInstance().getCnx();
        String s = mybox.getSelectionModel().getSelectedItem();
        String sql = "INSERT INTO users (Nom, Prenom, Email, Password, Role) VALUES (?,?,?,?,?)";
        if(isValidated()){
        try{
           st = con.prepareStatement(sql);
           String pass= pwd.getText();
           st.setString(1, name1.getText());
           st.setString(2, second.getText());
           st.setString(3, email.getText());
           st.setString(4, getHash(pass.getBytes(), "SHA-1"));
           st.setString(5, s);
           st.execute();
           name1.clear();
           second.clear();
           email.clear();
           pwd.clear();
           mybox.valueProperty().set(null);
           JOptionPane.showMessageDialog(null, "Utilisateur ajouter avec succé");
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        }  
    }

    @FXML
    public void changeForm(ActionEvent event) {
        if (event.getSource() == create_acc) {
            inscrire_form.setVisible(true);
            connecter_form.setVisible(false);

        } else if (event.getSource() == conn) {
            inscrire_form.setVisible(false);
            connecter_form.setVisible(true);
        }
    }
    
 
   
    
    public static String getHash(byte[]inputBytes, String algorithme){
        String hashValue="";
        try{
            MessageDigest messageDigest= MessageDigest.getInstance(algorithme);
            messageDigest.update(inputBytes);
            byte[] digesteBytes= messageDigest.digest();
            hashValue= DatatypeConverter.printHexBinary(digesteBytes).toLowerCase();
            

        } catch (NoSuchAlgorithmException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return hashValue;
}
    
    public boolean isAlreadyRegistered() throws SQLException{
        con = MyDb.getInstance().getCnx();
        boolean emailExist;
        emailExist = false;
        String sql= "SELECT * FROM users WHERE Email=?";
         try{
            st=con.prepareStatement(sql);
            st.setString(1, email.getText());
            result = st.executeQuery();
            if(result.next()){
                emailExist= true;
            }
         }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,ex);
         }    
        return emailExist;
    }

  
    public boolean isValidated() throws SQLException{
        String regex="^(.+)@(.+)$";
         String number="[0-9]+";
         Pattern p= Pattern.compile(regex);
         Pattern n= Pattern.compile(number);
        if(name1.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Remplir le champ du nom de l'utilisateur");
           name1.requestFocus();
        }else if(name1.getText().length()<5 || name1.getText().length()>25){
            JOptionPane.showMessageDialog(null, "Le nom ne doit pas etre inferieur à 5 et superieur à 25");
            name1.requestFocus();
        }else if(n.matcher(name1.getText()).matches()){
            JOptionPane.showMessageDialog(null, "Le nom doit contenir que des caractéres");
            name1.requestFocus();
        }else if(second.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Remplir le champ du prenom de l'utilisateur");
            second.requestFocus();
        }else if(second.getText().length()<5 || second.getText().length()>25){
            JOptionPane.showMessageDialog(null, "Le prenom ne doit pas etre inferieur à 5 et superieur à 25");
            second.requestFocus();
        }else if(n.matcher(second.getText()).matches()){
            JOptionPane.showMessageDialog(null, "Le nom doit contenir que des caractéres");
            name1.requestFocus();
        }else if(pwd.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Remplir le champ du mot de passe");
            pwd.requestFocus();
        }else if(pwd.getText().length()<5 || pwd.getText().length()>25){
            JOptionPane.showMessageDialog(null, "Le mot de passe ne doit pas etre inferieur à 5 et superieur à 25");
            pwd.requestFocus();
        }else if(email.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Remplir le champ de l'email");
            pwd.requestFocus();
        }else if(!p.matcher(email.getText()).matches()){
            JOptionPane.showMessageDialog(null, "Email non valide");
            name1.requestFocus();
        }else if(isAlreadyRegistered()){
        JOptionPane.showMessageDialog(null, "L'email de l'utilisateur exist déja ");
            email.requestFocus();
        }else{
            return true;
           
}
       return false;
    }    
    
     @Override
    public void initialize(URL location, ResourceBundle resources) {
        mybox.getItems().addAll(role);
    }
}