/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package database;
import java.sql.*;
/**
 *
 * @author jeshanpatel1510
 */
public class Database {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nexushub","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("Select * from tname");
            while(rs.next()){
                System.out.println("Id"+rs.getInt("Id")+"Name"+rs.getString("Name"));
            }
        }
        catch(Exception e){
            System.out.println("Exception"+e.getMessage());
        }
    }
}
