/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import service_formation.mysqlconnect;
import static service_formation.mysqlconnect.connectDB;

/**
 * FXML Controller class
 *
 * @author TASNIM
 */
public class EtudiantFXMLController implements Initializable {

    @FXML
    private ListView<String> list4;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    Connection conx = mysqlconnect.connectDB();
   
    String connectQuery = "SELECT titre,description,niveau,date_creation,prix,enseignant FROM formation";
    try{
        Statement statement = connectDB().createStatement();
        ResultSet queryOutput = statement. executeQuery(connectQuery);
        
        while (queryOutput.next()){
            String titre=queryOutput.getString("titre");
            String description=queryOutput.getString("description");
             String niveau=queryOutput.getString("niveau");
            String date_creation=queryOutput.getString("date_creation");
            Integer prix=queryOutput.getInt("prix");
            String enseignant=queryOutput.getString("enseignant");
            String listOut= "LA FORMATION : "+titre+" est  "+description+" LES NIVEAUX { "+niveau+" }COMMENCE[ "+date_creation+" ]PRIX" +prix+" PESENTE PAR "+enseignant;
            list4.getItems().add(listOut);
    
        }
    }catch(Exception e){
    }
    }    
    

    @FXML
    private void addCliked(MouseEvent event) {
    }
    
}
