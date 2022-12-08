/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service_formation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author TASNIM
 */
public class service {
     public List<formation> getAllformation() throws SQLException {

        List<formation> list = new ArrayList<>();
        String req = "select * from formation";
        Statement st = mysqlconnect.connectDB().createStatement();
        ResultSet rst = st.executeQuery(req);

        while (rst.next()) {
            formation f = new formation(rst.getInt("idF"),rst.getString("titre"), rst.getString("description"), rst.getString("niveau"), rst.getString("date_creation"), rst.getInt("prix"), rst.getString("enseignant"));
           
            list.add(f);
        }
        return list;
    }
//       public formation SearchById(int id) throws SQLException{
//        Statement stm = conx.createStatement();
//       formation for = new formation();
//        String query = "select * from formation where idF="+id;
//        ResultSet rs= stm.executeQuery(query);
//        while (rs.next()){
//                categorie.setId(rs.getInt("id"));
//                categorie.setNom(rs.getString("nom"));
//        }
//        return for;
//        
//        }     
 
//    public void ajouter(formation  p) {
//        Connection cnx=mysqlconnect.connectDB();
//        try {
//            String req = "INSERT INTO `formation`( `titre`, `description`, `niveau`, `date_creation`, `prix`, `enseignant` )"
//                    + "VALUES (?,?,?,?,?,?)";
//            PreparedStatement ps = cnx.prepareStatement(req);
//            ps.setString(2, p.getTitre());
//            ps.setString(3, p.getDescription());
//            ps.setString(4, p.getNiveau());
//            ps.setString(5, p.getDate_creation());
//            ps.setInt(6, p.getPrix());
//            ps.setString(7, p.getEnseignant());
//            ps.executeUpdate();
//            System.out.println("Reservation created !");
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//    

   
   }


