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


public class Table_form2Controller implements Initializable {
    
    @FXML
    private TableView<form2_table> form2_table;
    @FXML
    private TableColumn<form2_table, String> session_column;
    @FXML
    private TableColumn<form2_table, String> price_column;
    @FXML
    private Button back_button;
    @FXML
    private Button show_button;
    @FXML
    private Button cancel_button;
    @FXML
    private TableColumn<form2_table, String> hobby_column;
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       hobby_column.setCellValueFactory(new PropertyValueFactory<form2_table,String>("Hobby"));
       session_column.setCellValueFactory(new PropertyValueFactory<form2_table,String>("Session"));
       price_column.setCellValueFactory(new PropertyValueFactory<form2_table,String>("Price"));
     //  table.setItems(list);
    }    

    @FXML
    private void backButtonAction(ActionEvent event) throws IOException {
       Parent page5 = FXMLLoader.load(getClass().getResource("table_form1.fxml"));
       Scene scene5 = new Scene(page5);
       Stage win5=(Stage)((Node)event.getSource()).getScene().getWindow();
       win5.setScene(scene5);
       win5.show();
    }

    @FXML
    private void showButtonAction(ActionEvent event) throws SQLException {
        for(int i=0;i<form2_table.getItems().size();i++)  form2_table.getItems().clear();
        
        Connectivity connectivity=new Connectivity();
        Connection connection=connectivity.getConnection();
        
        // Select
        String sql = "SELECT h_name, session, price FROM `userform2` WHERE u_email='"+u_email+"'";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        while(resultSet.next()){
            form2_table h = new form2_table(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
            ObservableList<form2_table> list3= (ObservableList<form2_table>) form2_table.getItems();
            list3.add(h);
            form2_table.setItems(list3);
        }
    }

    @FXML
    private void cancelButtonAction(ActionEvent event) throws SQLException {
        Connectivity connectivity=new Connectivity();
        Connection connection=connectivity.getConnection();
        
        ObservableList<form2_table> listPro;
        listPro=form2_table.getSelectionModel().getSelectedItems();
        
        //Delete hoppy_name, session from hobby
        PreparedStatement preparedStatement=connection.prepareStatement("DELETE FROM `userform2` WHERE h_name=? and session=? and price=? and u_email=?");
        preparedStatement.setString(1, listPro.get(0).getHobby());
        preparedStatement.setString(2, listPro.get(0).getSession());
        preparedStatement.setString(3, listPro.get(0).getPrice());
        preparedStatement.setString(4, u_email);
        preparedStatement.execute();
        preparedStatement.close();
    }
    
}
