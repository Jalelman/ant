/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import services.Iservices;
import services.Serviceniveau;
import services.Serviceniveau;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;
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
public class NiveauController implements Initializable {

    @FXML
    private TableView<niveau> Categories_jeux_TableView;
    @FXML
    private TableColumn<niveau, String> idcol;
    @FXML
    private TableColumn<niveau, String> typeCol;
    @FXML
    private TableColumn<niveau, String> editCol;
    
    niveau niveau = null;
    Connection cnx = null;
    String query = null;
    PreparedStatement preparedStatement = null;
    ObservableList<niveau> niveauList = FXCollections.observableArrayList();
   // private ObservableList<niveau> niveauList;

    /**
     * Initializes the controller class.
     */
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadDate();
        showData();
    }

    @FXML
    private void getAddView(MouseEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("AddNiveau.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(niveauController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void showData() {
       Serviceniveau ip = new Serviceniveau();
        Categories_jeux_TableView.setItems((ObservableList<niveau>) ip.afficher());
    }
    
    private void loadDate() {
        cnx = MyDb.getInstance().getCnx();
        showData();
        idcol.setCellValueFactory(new PropertyValueFactory<>("id"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("nom"));


        //add cell of button edit 
        Callback<TableColumn<niveau, String>, TableCell<niveau, String>> cellFoctory;
        cellFoctory = (TableColumn<niveau, String> param) -> {
            // make cell containing buttons
            final TableCell<niveau, String> cell;
            cell = new TableCell<niveau, String>() {
                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    //that cell created only on non-empty rows
                    if (empty) {
                        setGraphic(null);
                        setText(null);

                    } else {

                        FontAwesomeIconView deleteIcon = new FontAwesomeIconView(FontAwesomeIcon.TRASH);
                        FontAwesomeIconView editIcon = new FontAwesomeIconView(FontAwesomeIcon.PENCIL_SQUARE);

                        deleteIcon.setStyle(
                                " -fx-cursor: hand ;"
                                + "-glyph-size:28px;"
                                + "-fx-fill:#b8b1b1;"
                        );
                        editIcon.setStyle(
                                " -fx-cursor: hand ;"
                                + "-glyph-size:28px;"
                                + "-fx-fill:#b8b1b1;"
                        );
                        deleteIcon.setOnMouseClicked((MouseEvent event) -> {
                            niveau =Categories_jeux_TableView.getSelectionModel().getSelectedItem();
                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                            alert.initStyle(StageStyle.TRANSPARENT);
                            alert.setTitle(null);
                            alert.setHeaderText("Supprimer " + niveau.getNom() +"  ?");
                            alert.setContentText("Are you sure ?");
                            Optional<ButtonType> action = alert.showAndWait();
                            if (action.get() == ButtonType.CANCEL) {
                                showData();

                            } else if (action.get() == ButtonType.OK) {
                                Serviceniveau ip = new Serviceniveau();
                                ip.supprimer(niveau);
                                 showData();
                                Image img = new Image("https://i.pinimg.com/736x/d5/79/3f/d5793f3a65b52f6cd76b324118a348ac.jpg");
                                Notifications notificationBuilder = Notifications.create();
                                notificationBuilder.title("Suppression terminé");
                                notificationBuilder.text(niveau.getNom() + " Supprimer avec succées");
                                notificationBuilder.graphic(new ImageView(img));
                                notificationBuilder.hideAfter(Duration.seconds(5));
                                notificationBuilder.position(Pos.TOP_RIGHT);
                                notificationBuilder.darkStyle();
                                notificationBuilder.showConfirm();
                               
                            }

//                           try {
//                                personne = showLabel.getSelectionModel().getSelectedItem();
//                                Ipersonne ip = new PersonneService();
//                                ip.supprimerPersonne(personne);
//                                query = "DELETE FROM `personne` WHERE id  =" + personne.getId();
//                                cnx = MaConnexion.getInstance().getCnx();
//                                preparedStatement = cnx.prepareStatement(query);
//                                preparedStatement.execute();
//                                showData();
//                            } catch (SQLException ex) {
//                                Logger.getLogger(FirstFXMLController.class.getName()).log(Level.SEVERE, null, ex);
//                            }
                        });
                        editIcon.setOnMouseClicked((MouseEvent event) -> {

                            niveau = (niveau) Categories_jeux_TableView.getSelectionModel().getSelectedItem();
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("AddGroupes.fxml"));
                            try {
                                loader.load();
                            } catch (IOException ex) {
                                Logger.getLogger(niveauController.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            AddniveauController AddCategorieController = loader.getController();
                            AddCategorieController.setUpdate(true);
                            AddCategorieController.setTextField(niveau.getId(), niveau.getNom());
                            Parent parent = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(parent));
                            stage.initStyle(StageStyle.UTILITY);
                            stage.show();

                        });

                        HBox managebtn = new HBox(editIcon, deleteIcon);
                        managebtn.setStyle("-fx-alignment:center");
                        HBox.setMargin(deleteIcon, new Insets(2, 2, 0, 3));
                        HBox.setMargin(editIcon, new Insets(2, 3, 0, 2));

                        setGraphic(managebtn);

                        setText(null);

                    }
                }

            };

            return cell;
        };
        editCol.setCellFactory(cellFoctory);
        Categories_jeux_TableView.setItems(niveauList);

    }

    private static class niveauController {

        public niveauController() {
        }
    }

}
