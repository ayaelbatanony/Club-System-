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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ngm5s
 */
public class SecondController implements Initializable {
    @FXML
    private Label l1;
    @FXML
    private Label l2;
    @FXML
    private Label l3;
     
    @FXML
    private Button b;
    @FXML
    private TextField corsename;
    @FXML
    private TextField coachname;
    @FXML
    private TextField price;
 @FXML
    void handleButtonAction1(ActionEvent event) throws SQLException{
         try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
                System.out.println(ex);
        }
      try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javafxproject", "root", "")){ 
       
            PreparedStatement p = con.prepareStatement("insert into  basant (corsename , coachname ,price ) values (?,?,?)");
            p.setString(1,corsename.getText());
            p.setString(2,coachname.getText());
            p.setString(3,price.getText());
           
            p.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
       }

        
        
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
