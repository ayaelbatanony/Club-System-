package projectjava;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectivity {
    public Connection connection;
    public Connection getConnection(){
        String dbName="javafxproject";
        String username="root";
        String password="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,username,password);
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return connection;
    }
}
