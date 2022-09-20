/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import models.section;
import utils.MyDb;

/**
 *
 * @author karima awedi
 */
public class ServiceGroupe implements Iservices<section>{
  Connection cnx = MyDb.getInstance().getCnx();
    ObservableList<section> sectionList = FXCollections.observableArrayList();
    @Override
    public void ajouter(section t) {
        String req = "INSERT INTO `ant`(`nom`) VALUES (?)";
        try {
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setString(1, t.getNom());
            ps.executeUpdate();
            System.out.println("PS :  ajoutée avec roupes succés!");
        } catch (SQLException ex) {
            Logger.getLogger(ServiceGroupe.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<section> afficher() {
String req = "SELECT * FROM ant";
        try {
            sectionList.clear();

            PreparedStatement ps = cnx.prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                section gp = new section();
                gp.setId(rs.getInt("id"));
                gp.setNom(rs.getString("nom"));
                sectionList.add(gp);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ServiceGroupe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sectionList ;        }

    @Override
    public void supprimer(section t) {
 try {
            String req = "DELETE FROM `ant` WHERE id = '" + t.getId() + "'";
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Groupes supprimer avec succés!");
        } catch (SQLException ex) {
            Logger.getLogger(ServiceGroupe.class.getName()).log(Level.SEVERE, null, ex);
        }    }

    @Override
    public void modifier(section t) {
 String req = "UPDATE `ant` SET "
                + "`nom`=? WHERE id = '" + t.getId() + "'";
        try {
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setString(1, t.getNom());
            ps.executeUpdate();
            System.out.println("PS : Catégorie de jeux Modifié avec succés!");
        } catch (SQLException ex) {
            Logger.getLogger(ServiceGroupe.class.getName()).log(Level.SEVERE, null, ex);
        }    }
    
}
