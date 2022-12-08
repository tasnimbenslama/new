/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service_formation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author TASNIM
 */

public class Service_formation extends Application {
     static Connection cnx;
    static Statement st;
    static ResultSet rst;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("espaceFXML.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conx=mysqlconnect.connectDB();

        launch(args);
    }
    
}
