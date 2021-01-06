/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaventana;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Fredy
 */
public class ModificarProductoController implements Initializable {

    @FXML
    private Button btnModificar;
    @FXML
    private Button btnGuardar;
    @FXML
    private Button btnCambiar;
    @FXML
    private TextField tfModelo;
    @FXML
    private Label lblIdProducto;
    @FXML
    private TextField tfStock;
    @FXML
    private TextField tfPrecio;
    @FXML
    private ChoiceBox<?> cbTipo;
    @FXML
    private ChoiceBox<?> cbProveedor;
    @FXML
    private TextArea taDescripcion;
    @FXML
    private Button btnVolver;
    @FXML
    private AnchorPane apModificarProducto;
    @FXML
    private ChoiceBox<?> cbSeleccionaTalla;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
