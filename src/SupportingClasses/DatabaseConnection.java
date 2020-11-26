package SupportingClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    Connection con=null;
    public Connection getConnection(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:product.db");
//            System.out.println(con);
        }
        catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        return con;
    }
}
