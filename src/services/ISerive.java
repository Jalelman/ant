/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;

/**
 *
 * @author islem
 */
public interface ISerive<E> {
    void ajouter(E e);
    List<E> afficher();
    void supprimer(E e);
    void modifier(E e);
}
