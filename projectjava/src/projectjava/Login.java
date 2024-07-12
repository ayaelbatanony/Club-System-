
package projectjava;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class Login implements Initializable {

    @FXML
    ComboBox comb;
    @FXML
    Label resultcom;
    @FXML
     TextField user_email;
    @FXML
    TextField user_password;
    @FXML
    Button log;
    Connection con;
    PreparedStatement pst1;
    PreparedStatement pst2;
    PreparedStatement pst3;
    ResultSet rs1;
    ResultSet rs2;
    ResultSet rs3;
    @FXML
    public void select_type(){
    String select =comb.getSelectionModel().getSelectedItem().toString();  
    resultcom.setText(select);
    }
    
    public static String u_email="";
    @FXML
    public void login(ActionEvent event) throws IOException {
        String user= user_email.getText();
        String pass=user_password.getText();
        if(user.equals("")|| pass.equals("")){
        JOptionPane.showMessageDialog(null,"Username or Password Blank");
        }else{
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/javafxproject","root","");
                switch (resultcom.getText()){
                 case "admin":   
                pst3=con.prepareStatement("select * from admin where a_email=? and a_password=?");
                pst3.setString(1,user);
                pst3.setString(2,pass);
                rs3=pst3.executeQuery();
                if(rs3.next()){
                JOptionPane.showMessageDialog(null,"login success");
                Parent root =FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
               Scene scene = new Scene(root);
               Stage admin=(Stage)((Node)event.getSource()).getScene().getWindow();
               admin.setScene(scene);
               admin.show();
                }else{
                JOptionPane.showMessageDialog(null,"login failed");
                user_email.setText(" ");
                user_password.setText(" ");
                user_email.requestFocus();
                }
                break;
                case "user":
                pst1=con.prepareStatement("select * from user where u_email=? and u_password=?");
                 pst1.setString(1,user);
                pst1.setString(2,pass);
                rs1=pst1.executeQuery();
                if(rs1.next()){
                JOptionPane.showMessageDialog(null,"login success");
                    //Parent root =FXMLLoader.load(getClass().getResource("user.fxml"));
               u_email = user_email.getText();
               Parent root =FXMLLoader.load(getClass().getResource("table_form1.fxml"));  
               Scene scene = new Scene(root);
               Stage userp=(Stage)((Node)event.getSource()).getScene().getWindow();
               userp.setScene(scene);
               userp.show();
                }else{
                JOptionPane.showMessageDialog(null,"login failed");
                user_email.setText(" ");
                user_password.setText(" ");
                user_email.requestFocus();
                }
                break;
                case "coach":
                pst2=con.prepareStatement("select * from coach where c_email=? and c_password=?");
                pst2.setString(1,user);
                pst2.setString(2,pass);
                rs2=pst2.executeQuery();
                if(rs2.next()){
                JOptionPane.showMessageDialog(null,"login success");
                Parent root =FXMLLoader.load(getClass().getResource("coach.fxml"));
               Scene scene = new Scene(root);
               Stage coach=(Stage)((Node)event.getSource()).getScene().getWindow();
               coach.setScene(scene);
               coach.show();
                }else{
                JOptionPane.showMessageDialog(null,"login failed");
                user_email.setText(" ");
                user_password.setText(" ");
                user_email.requestFocus();
                }
                break;
                }   
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }catch(SQLException ex){
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
        
    }
    
     public void sign_in(ActionEvent event) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("registform.fxml"));
        Scene scene = new Scene(root);
        Stage create_account=(Stage)((Node)event.getSource()).getScene().getWindow();
        create_account.setScene(scene);   
        create_account.show();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> list=FXCollections.observableArrayList("user","coach","admin");
        comb.setItems(list);
    }    
    
}
