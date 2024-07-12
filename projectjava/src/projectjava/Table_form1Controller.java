 package projectjava;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import static projectjava.Login.u_email;
//import static projectjava.Variables.u_email;

public class Table_form1Controller implements Initializable {

    @FXML
    private TableView<form1_table> form1_table;
    @FXML
    private TableColumn<form1_table, String> session_column;
    @FXML
    private TableColumn<form1_table, String> price_column;
    @FXML
    private Button back_button;
    @FXML
    private Button show_button;
    @FXML
    private Button book_button;
    @FXML
    private Button myBookings_button;
    @FXML
    private TableColumn<form1_table, String> hobby_column;
    @FXML
    private TableColumn<form1_table, String> coachName_column;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       hobby_column.setCellValueFactory(new PropertyValueFactory<form1_table,String>("Hobby"));
       session_column.setCellValueFactory(new PropertyValueFactory<form1_table,String>("Session"));
       price_column.setCellValueFactory(new PropertyValueFactory<form1_table,String>("Price"));
       coachName_column.setCellValueFactory(new PropertyValueFactory<form1_table,String>("Coach_name"));
     //  table.setItems(list);
    }    

    @FXML
    private void backButtonAction(ActionEvent event) throws IOException {
        Parent page5 = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene5 = new Scene(page5);
        Stage win5=(Stage)((Node)event.getSource()).getScene().getWindow();
        win5.setScene(scene5);
        win5.show();
    }

    @FXML
    private void showButtonAction(ActionEvent event) throws SQLException {
        for ( int i = 0; i<form1_table.getItems().size(); i++) form1_table.getItems().clear();
        
        Connectivity connectivity=new Connectivity();
        Connection connection=connectivity.getConnection();
        
        // Select
        String sql = "SELECT corsename,session1,price,coachname FROM `basant`";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        while(resultSet.next()){
            form1_table h = new form1_table(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
            ObservableList<form1_table> list3= (ObservableList<form1_table>) form1_table.getItems();
            list3.add(h);
            form1_table.setItems(list3);
        }
        sql = "SELECT corsename,session2,price,coachname FROM `basant`";
        statement=connection.createStatement();
        resultSet=statement.executeQuery(sql);
        while(resultSet.next()){
            form1_table h = new form1_table(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
            ObservableList<form1_table> list3= (ObservableList<form1_table>) form1_table.getItems();
            list3.add(h);
            form1_table.setItems(list3);
        }
        sql = "SELECT corsename,session3,price,coachname FROM `basant`";
        statement=connection.createStatement();
        resultSet=statement.executeQuery(sql);
        while(resultSet.next()){
            form1_table h = new form1_table(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
            ObservableList<form1_table> list3= (ObservableList<form1_table>) form1_table.getItems();
            list3.add(h);
            form1_table.setItems(list3);
        }
        sql = "SELECT corsename,session4,price,coachname FROM `basant`";
        statement=connection.createStatement();
        resultSet=statement.executeQuery(sql);
        while(resultSet.next()){
            form1_table h = new form1_table(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
            ObservableList<form1_table> list3= (ObservableList<form1_table>) form1_table.getItems();
            list3.add(h);
            form1_table.setItems(list3);
        }
//        sql = "SELECT corsename,session5,price FROM `basant`";
//        statement=connection.createStatement();
//        resultSet=statement.executeQuery(sql);
//        while(resultSet.next()){
//            form1_table h = new form1_table(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
//            ObservableList<form1_table> list3= (ObservableList<form1_table>) form1_table.getItems();
//            list3.add(h);
//            form1_table.setItems(list3);
//        }
    }

    @FXML
    private void bookButtonAction(ActionEvent event) throws SQLException {
        Connectivity connectivity=new Connectivity();
        Connection connection=connectivity.getConnection();
        ObservableList<form1_table> listPro;
        listPro=form1_table.getSelectionModel().getSelectedItems();
        
        PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO userform2 VALUES (?,?,?,?)");
        preparedStatement.setString(1, u_email);
//            preparedStatement.setString(1, "aya@gmail.com");
//            preparedStatement.setString(2, "mo@gmail.com");
        preparedStatement.setString(2, listPro.get(0).getHobby());
        preparedStatement.setString(3, listPro.get(0).getSession());
        preparedStatement.setString(4, listPro.get(0).getPrice());
        preparedStatement.execute();
        preparedStatement.close();
    //    System.out.println(new Login().u_email);
    }

    @FXML
    private void myBookingsButtonAction(ActionEvent event) throws IOException {
       Parent page5 = FXMLLoader.load(getClass().getResource("table_form2.fxml"));
       Scene scene5 = new Scene(page5);
       Stage win5=(Stage)((Node)event.getSource()).getScene().getWindow();
       win5.setScene(scene5);
       win5.show();
    }
    
}
