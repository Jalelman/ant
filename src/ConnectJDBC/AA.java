/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectJDBC;

/**
 *
 * @author Marwa
 */
public class AA {
    private  static AA Instance ;
private AA(){
    
}

public static AA getInstance(){
    if (Instance == null)
    Instance= new AA();

    return Instance;
}
    
}
