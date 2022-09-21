/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.sql.Date;

/**
 *
 * @author islem
 */
public class Evenement {
    private int id;
    private String nom;
    private Date date;
    private String lieu;
    private String type;
    private String description; 
    private int id_formateur; 

public Evenement(){
  super();
}
public Evenement(int id, String nom, Date date, String lieu, String type, String description, int id_formateur ){
  this.id= id;
  this.nom= nom; 
  this.date= date; 
  this.lieu= lieu;
  this.type= type;
  this.description= description; 
  this.id_formateur= id_formateur;
}
public int getId(){
    return id;
}
public void setId(int id){
    this.id=id;
}
public String getNom(){
    return nom;
}
public void setNom(String nom){
    this.nom=nom;
}
public Date getDate(){
    return date;
}
public void setDate(Date date){
    this.date= date;
}
public String getLieu(){
    return lieu;
}
public void setLieu(String lieu){
    this.lieu= lieu;
}
public String getType(){
    return type; 
}
public void setType(String type){
    this.type= type;
}
public String getDescription(){
    return description;
}
public void setDescription(String description){
    this.description= description;
}
public int getIdFormateur(){
    return id_formateur;
}
public void setIdFormateur(int id_formateur){
    this.id_formateur= id_formateur;
}
  @Override
    public String toString() {
        return "Evenement{" + "id=" + id + ", nom=" + nom +  ", lieu=" + lieu + ", type" +type+ ", description" +description+ ", id_formateur" +id_formateur+ "\n";
    }
}