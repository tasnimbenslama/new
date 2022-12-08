/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service_formation;


import com.sun.org.apache.bcel.internal.classfile.Utility;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;

import javafx.scene.Scene;
import javafx.stage.Stage;
import service_formation.*;

/**
 * FXML Controller class
 *
 * @author TASNIM
 */
    
public class EspaceFXMLController implements Initializable {
    
    Stage stage;
    Scene scene;

    @FXML
    private Button enseignant;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onClickchoix(ActionEvent event) throws Exception {
           Node node = (Node) event.getSource();
        stage = (Stage) node.getScene().getWindow();
        

        try {
            scene = new Scene(FXMLLoader.load(getClass().getResource("FXMLDocument.fxml")));
        } catch (IOException ex) {
             Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void onclick(ActionEvent event) throws Exception {
         Node node = (Node) event.getSource();
        stage = (Stage) node.getScene().getWindow();
        

        try {
            scene = new Scene(FXMLLoader.load(getClass().getResource("etudiantFXML.fxml")));
        } catch (IOException ex) {
             Logger.getLogger(EtudiantFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        stage.setScene(scene);
        stage.show();
    }
    }
        
    
    

