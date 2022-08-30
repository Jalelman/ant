
package login;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Elife-Kef-056
 */
public class ConnexionMysql{
  Connection cn = null;
  
    public static Connection connexionDB() throws SQLException{
        try { 
            Class.forName("com.mysql.jdbc.Driver");
           Connection cn= DriverManager.getConnection("jdbc:Mysql://localhost/ant", "root", "");
           JOptionPane.showMessageDialog(null, "cnx etablir");
           return cn;
        } catch (ClassNotFoundException |SQLException ex) {
                    JOptionPane.showMessageDialog(null, "cnx echouee");
          return null;
        }
        
    }
    
}
