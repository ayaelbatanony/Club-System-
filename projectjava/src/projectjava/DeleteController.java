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
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class DeleteController implements Initializable {
@FXML
   private TextField time;
   
   @FXML
   private CheckBox c1;
    @FXML
   private CheckBox c2;
    public void deleteaction(ActionEvent event) throws SQLException{
       if(c1.isSelected()){
           try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
                System.out.println(ex);
        }
      try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javafxproject", "root", "")){ 
            PreparedStatement p = con.prepareStatement("delete from basant where session1=? ");
            p.setString(1,time.getText());
            p.execute();
    }}else if(c2.isSelected()){
           try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
                System.out.println(ex);
        }
      try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javafxproject", "root", "")){ 
            PreparedStatement p = con.prepareStatement("delete from basant where session2=? ");
            p.setString(1,time.getText());
            p.execute();
    }}}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
