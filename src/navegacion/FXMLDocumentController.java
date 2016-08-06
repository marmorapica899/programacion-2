/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navegacion;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import empleados.*;
import clientes.*;

/**
 *
 * @author Adrian
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btnEmpleados;
    
    @FXML
    private Button btnClientes;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;
        
        if (event.getSource() == btnEmpleados) {
            stage=(Stage) btnEmpleados.getScene().getWindow();            
            root = FXMLLoader.load(getClass().getResource("/empleados/FXMLEmpleados.fxml"));
        } else {
            stage=(Stage) btnClientes.getScene().getWindow();            
            root = FXMLLoader.load(getClass().getResource("/clientes/FXMLClientes.fxml"));
        }
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
