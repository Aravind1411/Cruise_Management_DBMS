/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curisemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.lang.ClassNotFoundException;
import java.lang.NullPointerException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amrbh
 */
public class connectdb {
    public static Connection connectdb(){
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sh","ara");
            return con;
        }catch(SQLException | ClassNotFoundException | NullPointerException ex)
        {
              Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
