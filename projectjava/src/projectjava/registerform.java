/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Bassant
 */
public class registerform extends Application {
              
    @FXML
    ToggleGroup togglegroup;
    @FXML
    RadioButton coach;
    @FXML
    RadioButton userr;
    @FXML
    TextField fname;
    @FXML
    TextField lname;
    @FXML
    TextField email;
    
    @FXML
    PasswordField pass;
   Connection con;
   PreparedStatement pst;
    
    
    
    @Override
    public void start(Stage primaryStage) throws IOException {
     
        FXMLLoader loader=new FXMLLoader();
        File file=new File("./src/FXML/registform.fxml");
        FileInputStream fileinputstream=new FileInputStream(file);
        VBox pane=loader.load(fileinputstream);
        pane.setStyle("-fx-background-color:#efe8eb");
        Scene scene = new Scene(pane, 800, 700);
       
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
@FXML
    public void createaccount(ActionEvent event) throws IOException  {
        if(fname.getText().isEmpty() || lname.getText().isEmpty() || email.getText().isEmpty() || pass.getText().isEmpty() || (! userr.isSelected() && ! coach.isSelected() ) ){
            Alert alert=new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Fill The Empety Textfield/s ( is requierd )");
         
            alert.show();
        } else{
        if(userr.isSelected()){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/javafxproject","root","");
            String query="INSERT INTO `user`(`u_fname`, `u_lname`, `u_email`, `u_password`) VALUES (?,?,?,?)";
            pst= con.prepareStatement(query);
            pst.setString(1, fname.getText());
            pst.setString(2, lname.getText());
            
            if((email.getText()).matches("[A-Za-z]+[0-9]*[.]*[A-Za-z]*@[A-Za-z]+.com")){
            pst.setString(3, email.getText());
            }
            else{
                Alert alert2= new Alert(Alert.AlertType.ERROR);
            alert2.setContentText("invalid email");
            alert2.show();
            }
            if(((pass.getText()).length())==8){
            pst.setString(4, pass.getText());
            }
            else if(((pass.getText()).length())<8){
            Alert alert2= new Alert(Alert.AlertType.WARNING);
            alert2.setContentText("Weak password please enter another password");
            alert2.show();
            }
            else{
                Alert alert2= new Alert(Alert.AlertType.ERROR);
            alert2.setContentText("invalid password enter another password");
            alert2.show();
            }
        
            pst.execute();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registerform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(registerform.class.getName()).log(Level.SEVERE, null, ex);
        }
         Parent pane= FXMLLoader.load(getClass().getResource("table_form1.fxml"));
    Scene scene =new Scene(pane);
    Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
        }
        
        else if (coach.isSelected()){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/javafxproject","root","");
            String query="INSERT INTO `coach`(`c_fname`, `c_lname`, `c_email`, `c_password`) VALUES (?,?,?,?)";
            pst= con.prepareStatement(query);
            pst.setString(1, fname.getText());
            pst.setString(2, lname.getText());
              
            if((email.getText()).matches("[A-Za-z]+[0-9]*[.]*[A-Za-z]*@[A-Za-z]+.com")){
            pst.setString(3, email.getText());
            }
            else{
                Alert alert2= new Alert(Alert.AlertType.ERROR);
            alert2.setContentText("invalid email");
            alert2.show();
            }
            if(((pass.getText()).length())==8){
            pst.setString(4, pass.getText());
            }
            else if(((pass.getText()).length())<8){
            Alert alert2= new Alert(Alert.AlertType.WARNING);
            alert2.setContentText("Weak password please enter another password");
            alert2.show();
            }
            else{
                Alert alert2= new Alert(Alert.AlertType.ERROR);
            alert2.setContentText("invalid password enter another password");
            alert2.show();
            }
            pst.execute();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registerform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(registerform.class.getName()).log(Level.SEVERE, null, ex);
        }
           
         Parent pane= FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
    Scene scene =new Scene(pane);
    Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
        
        
    }
        }
        
    }
    
    
    
        
    public void clear(){
     fname.setText("");
     lname.setText(""); 
     email.setText(""); 
     pass.setText(""); 
     userr.setSelected(false);
      coach.setSelected(false);
    }
    @FXML
     void back(ActionEvent event) throws IOException{
         Parent pane= FXMLLoader.load(getClass().getResource("login.fxml"));
    Scene scene =new Scene(pane);
    Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
        
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
