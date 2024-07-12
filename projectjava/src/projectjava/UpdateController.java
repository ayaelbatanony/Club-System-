/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

import java.awt.Checkbox;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class UpdateController implements Initializable {

     @FXML
   private TextField old_time;
     @FXML
   private TextField new_time;
    @FXML
   private CheckBox c1;
    @FXML
   private CheckBox c2;
    @FXML
    public void updateaction(ActionEvent event) throws SQLException{
       if(c1.isSelected()){ 
           try {
             Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
                System.out.println(ex);
        }
  
      try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javafxproject", "root", "")){ 
            PreparedStatement p = con.prepareStatement("update basant set session1=? where session1=? ");
            p.setString(1,new_time.getText());
            p.setString(2,old_time.getText());
            p.execute();
    }}
       else if(c2.isSelected()){ 
           try {
             Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
                System.out.println(ex);
        }
  
      try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javafxproject", "root", "")){ 
            PreparedStatement p = con.prepareStatement("update basant set session2=? where session2=? ");
            p.setString(1,new_time.getText());
            p.setString(2,old_time.getText());
            p.execute();
    }}
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
