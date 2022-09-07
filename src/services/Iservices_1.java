/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;

/**
 *
 * @author DINA CHIHAOUI
 */
public interface Iservices_1<T> {

    void ajouter(T t);

    List<T> afficher();

    void supprimer(T t);

    void modifier(T t);
}
