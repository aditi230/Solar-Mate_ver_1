package myconn;
import java.sql.*;

public class GetConnectionSqlite {
    public  Connection getConnect()
    {
       
        Connection con = null;
        try{
            String url ="jdbc:sqlite:C:/Users/Shivam/My database/Solar-Mate.db";
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established");
        }
        catch(ClassNotFoundException |SQLException e){
           System.out.println("Message: "+e.getMessage()); 
        }
        return con;
    }
    public static void main(String args[]){
   GetConnectionSqlite gc = new GetConnectionSqlite();
   System.out.println("connection "+gc.getConnect());
 }
}
