/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service_formation;

/**
 *
 * @author TASNIM
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;

/**
 *
 * @author TASNIM
 */
public class mysqlconnect {
    
    Connection conx=null;
    public static Connection connectDB(){
 
        try{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost/platforme";
        String user = "root";
        String password = "";
        Connection conx =DriverManager.getConnection(url,user,password);
       // JOptionPane.showMessageDialog(null, "connection etablie");
        return conx;
         } catch (Exception e) {
            e.printStackTrace();
         return null;
       }
}
//    public static ObservableList<formation> getAllformation()
//            {
//            Connection conx= connectDB();
//            ObservableList<formation> list =FXCollections.observableArrayList();
//            try{
//                
    
//                ResultSet rs =ps.executeQuery();
//                while(rs.next()){
//                    list.add(new formation(Integer.parseInt(rs.getString("id")), rs.getString("titre"), rs.getString("description"), rs.getString("niveau"), rs.getString("date_creation"), Integer.parseInt(rs.getString("prix"))));
//                }
//            }catch (Exception e){
//    }
//            return list;
//
//}
}
