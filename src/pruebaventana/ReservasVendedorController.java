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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Fredy
 */
public class ReservasVendedorController implements Initializable {

    @FXML
    private Button btnVolver;
    @FXML
    private TextField tfBuscar;
    @FXML
    private Button btnBuscar;
    @FXML
    private AnchorPane apReservasVendedor;
    @FXML
    private TableView<?> tvReservas;
    @FXML
    private TableColumn<?, ?> tcIdReserva;
    @FXML
    private TableColumn<?, ?> tcUsuario;
    @FXML
    private TableColumn<?, ?> tcProducto;
    @FXML
    private TableColumn<?, ?> tcCantidad;
    @FXML
    private TableColumn<?, ?> tcDescripcion;
    @FXML
    private TableColumn<?, ?> tcFecha;
    @FXML
    private TableColumn<?, ?> tcRealizada;
    @FXML
    private TableColumn<?, ?> tcEntrega;
    @FXML
    private TableColumn<?, ?> tcEstado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
