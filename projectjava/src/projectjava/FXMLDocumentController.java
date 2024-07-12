/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.util.Collections.list;
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
import javafx.stage.StageStyle;


public class FXMLDocumentController implements Initializable {

    @FXML
    private TableView<hoppy> table;
    @FXML
    private TableColumn<hoppy, String> c1;
    @FXML
    private TableColumn<hoppy, String> c2;
    @FXML
    private TableColumn<hoppy, String> c3;
    @FXML
    private Button show_button;
    @FXML
    private Button add;
    @FXML
    private Button update;
    @FXML
    private Button delete;
    @FXML
    private Button back;
    
    
    
    ObservableList<hoppy> list3;
    
 @FXML
 void handleButtonAction1(ActionEvent event){
         try{
            FXMLLoader fxmlLoader =new FXMLLoader(getClass().getResource("second.fxml"));
            Parent root1=(Parent) fxmlLoader.load();
            Stage stage=new Stage();
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle("second");
            stage.setScene(new Scene(root1));
            stage.show();
            
            
        }catch(Exception e){
            System.out.print("cant load new window");
        }
         

        
    };
 @FXML
 void handleButtonAction2(ActionEvent event){
     try{
            FXMLLoader fxmlLoader =new FXMLLoader(getClass().getResource("updatea.fxml"));
            Parent root2=(Parent) fxmlLoader.load();
            Stage stage=new Stage();
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle("update");
            stage.setScene(new Scene(root2));
            stage.show();
            
            
        }catch(Exception e){
            System.out.print("cant load new window");
        }
 
 }
 @FXML
    private void handleButtonAction4(ActionEvent event) {
        
        
        try{
            FXMLLoader fxmlLoader =new FXMLLoader(getClass().getResource("Delete_1.fxml"));
            Parent root3=(Parent) fxmlLoader.load();
            Stage stage=new Stage();
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle("Delete");
            stage.setScene(new Scene(root3));
            stage.show();
            
            
        }catch(Exception e){
            System.out.print("cant load new window");
        }
    }
    @FXML
    private void handleButtonActionBack(ActionEvent event) {
    try{
            FXMLLoader fxmlLoader =new FXMLLoader(getClass().getResource("login.fxml"));
            Parent root1=(Parent) fxmlLoader.load();
            Stage stage=new Stage();
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle("back");
            stage.setScene(new Scene(root1));
            stage.show();
            
            
        }catch(Exception e){
            System.out.print("cant load new window");
        }
         
    }

           
    
    @FXML
    private void showButtonAction(ActionEvent event) throws SQLException {
 
        for ( int i = 0; i<table.getItems().size(); i++) table.getItems().clear();
        
              Connectivity connectivity=new Connectivity();
            Connection connection=connectivity.getConnection();
        // Select
        String sql = "SELECT * FROM `basant`";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        while(resultSet.next()){
            hoppy h = new hoppy(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
            ObservableList<hoppy> list3= table.getItems();
            list3.add(h);
            table.setItems(list3);
        }
      
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       c1.setCellValueFactory(new PropertyValueFactory<hoppy,String>("course_name"));
       c2.setCellValueFactory(new PropertyValueFactory<hoppy,String>("coach_name"));
       c3.setCellValueFactory(new PropertyValueFactory<hoppy,String>("price"));
     //  table.setItems(list);
    }    

    @FXML
    private void printButtonAction(ActionEvent event) {
//        ObservableList<hoppy> listPro;
//        listPro=table.getSelectionModel().getSelectedItems();
//        System.out.println(listPro.get(0).getHoppy_name() + listPro.get(0).getSession() + listPro.get(0).getCoach_name());
    }
    
}
