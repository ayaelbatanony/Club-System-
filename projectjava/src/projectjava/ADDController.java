/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class ADDController implements Initializable {

    @FXML
   private TextField time;
    @FXML
   private TextField session2;
    @FXML
   private TextField coursename;
    @FXML
   public void addaction(ActionEvent event) throws SQLException, ClassNotFoundException{
 try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
                System.out.println(ex);
        }
      try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javafxproject", "root", "")){ 
       
            PreparedStatement p = con.prepareStatement("INSERT INTO basant (corsename,session1,session2) VALUES (?,?,?)");
            p.setString(1,coursename.getText());
            p.setString(2,time.getText());
            p.setString(3,session2.getText());            
            p.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
       }}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
