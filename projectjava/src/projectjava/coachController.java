/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class coachController implements Initializable {
    
     @FXML
    private TableView<session> table;
    @FXML
    private TableColumn<session, String> c1;
    @FXML
    private TableColumn<session, String> c2;
    @FXML
    private TableColumn<session, String> c3;
    @FXML
    private Button show_button;
    
    ObservableList<session> list = FXCollections.observableArrayList(new session("Tennis", "Sunday", "Ahmed"), new session("Football", "Monday", "Mohammed"));
    
    @FXML
    private Button print_button;
    @FXML
    private Button add;
    
    ObservableList<session> list3;
    
    @FXML
    private void showButtonAction(ActionEvent event) throws SQLException {
 
        for ( int i = 0; i<table.getItems().size(); i++) table.getItems().clear();
         try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
                System.out.println(ex);
        }
      try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javafxproject", "root", "")){ 
       
            PreparedStatement p = con.prepareStatement("select corsename, session1, session2 from basant ");
           ResultSet r=p.executeQuery();
           while(r.next()){
            session h = new session(r.getString(1), r.getString(2), r.getString(3));
            ObservableList<session> list3= table.getItems();
            list3.add(h);
            table.setItems(list3);
        }
      
    }}
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
    FXMLLoader loader=new FXMLLoader(getClass().getResource("ADD.fxml"));
     Parent root1=(Parent) loader.load();
        Stage stage=new Stage();
        stage.setTitle("Add Sessions");
        stage.setScene(new Scene(root1));
        stage.show();
    }
    @FXML
    private void updateAction(ActionEvent event) throws IOException {
     FXMLLoader loader=new FXMLLoader(getClass().getResource("update.fxml"));
     Parent root1=(Parent) loader.load();
        Stage stage=new Stage();
        stage.setTitle("Update Sessions");
        stage.setScene(new Scene(root1));
        stage.show();   
    }
    @FXML
    private void deleteAction(ActionEvent event) throws IOException {
       FXMLLoader loader=new FXMLLoader(getClass().getResource("delete.fxml"));
     Parent root1=(Parent) loader.load();
        Stage stage=new Stage();
        stage.setTitle("Delete Sessions");
        stage.setScene(new Scene(root1));
        stage.show();  
    }
    @FXML
    private void backAction(ActionEvent event) throws IOException {
        FXMLLoader loader=new FXMLLoader(getClass().getResource("login.fxml"));
     Parent root1=(Parent) loader.load();
        Stage stage=new Stage();
        stage.setTitle("Delete Sessions");
        stage.setScene(new Scene(root1));
        stage.show();  
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        c1.setCellValueFactory(new PropertyValueFactory<session,String>("course"));
       c2.setCellValueFactory(new PropertyValueFactory<session,String>("session1"));
       c3.setCellValueFactory(new PropertyValueFactory<session,String>("session2"));
    }    
    
}
