/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

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
import models.niveau;
import models.niveau;
import utils.MyDb;

/**
 *
 * @author DINA CHIHAOUI
 */
public class Serviceniveau implements Iservices<niveau> {

    Connection cnx = MyDb.getInstance().getCnx();
    ObservableList<niveau> niveauList = FXCollections.observableArrayList();

    public void ajouter(niveau t) {
        String req = "INSERT INTO `niveau`(`nom`) VALUES (?)";
        try {
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setString(1, t.getNom());
            ps.executeUpdate();
            System.out.println("PS :  ajoutée avec roupes succés!");
        } catch (SQLException ex) {
            Logger.getLogger(Serviceniveau.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<niveau> afficher() {
        String req = "SELECT * FROM niveau";
        try {
            niveauList.clear();

            PreparedStatement ps = cnx.prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                niveau nv = new niveau();
                nv.setId(rs.getInt("id"));
                nv.setNom(rs.getString("nom"));
                niveauList.add(nv);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Serviceniveau.class.getName()).log(Level.SEVERE, null, ex);
        }
        return niveauList;
    }

    /**
     *
     * @param t
     */
   

    public void supprimer(niveau t) {
        try {
            String req = "DELETE FROM `niveau` WHERE id = '" + t.getId() + "'";
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("niveau supprimer avec succés!");
        } catch (SQLException ex) {
            Logger.getLogger(Serviceniveau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modifier(niveau t) {
        String req = "UPDATE `niveau` SET "
                + "`nom`=? WHERE id = '" + t.getId() + "'";
        try {
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setString(1, t.getNom());
            ps.executeUpdate();
            System.out.println("PS : Catégorie de jeux Modifié avec succés!");
        } catch (SQLException ex) {
            Logger.getLogger(Serviceniveau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

}
