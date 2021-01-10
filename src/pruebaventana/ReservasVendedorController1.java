/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaventana;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import javax.imageio.ImageIO;
import modelo.BirthdayEvent;
import modelo.DatePickerCell;
import modelo.EstadoReserva;
import modelo.Producto;
import modelo.Reserva;
import modelo.ReservaT;

/**
 * FXML Controller class
 *
 * @author Fredy
 */
public class ReservasVendedorController1 implements Initializable {

    @FXML
    private Button btnVolver;
    @FXML
    private TextField tfBuscar;
    @FXML
    private Button btnBuscar;
    @FXML
    private AnchorPane apReservasVendedor;
    @FXML
    private TableView<Reserva> tvReservas;
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
    //  private TableColumn<BirthdayEvent, Timestamp> tcEntrega;
    @FXML
    private TableColumn<?, ?> tcEstado;
    private List<Reserva> reservas;

    private List<Reserva> getReservas() throws IOException {
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva;
        Producto producto;
        for (int i = 0; i < 20; i++) {
            producto = new Producto();
            producto.setPrecio(179.99f);
            producto.setModelo("Nike Air Max 97");
            producto.setImagen(extractBytes("E:\\reto2\\PruebaVentana\\src\\pruebaventana\\"));

            // reserva = new ReservaT(Long.valueOf(i),producto.getId(),"Buena reserva BRO","CONFIRMADA",i,new Timestamp(System.currentTimeMillis()),new Timestamp(System.currentTimeMillis()),"Pimp Flakito");
            reserva = new Reserva();
            reserva.setId(Long.valueOf(i));
            reserva.setCantidad(i);
            reserva.setUser("Pimp flakito");
            reserva.setDescripcion("Buena reserva BRO");
            reserva.setEstado(EstadoReserva.EXPIRADA);
            reserva.setProducto(producto);
            reserva.setFechaReserva(new Timestamp(System.currentTimeMillis()));
            reserva.setFechaEntrega(new Timestamp(System.currentTimeMillis()));

            reservas.add(reserva);
        }
        return reservas;
    }

    public byte[] extractBytes(String path) throws IOException {
        // abrimos la imagen
        File imgPath = new File(path);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(1000);
        BufferedImage img = ImageIO.read(new File(path, "nik.jpg"));
        ImageIO.write(img, "jpg", baos);
        baos.flush();
        //   String base64String = Base64.encode(baos.toByteArray());
        baos.close();

        return (baos.toByteArray());
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
             reservas.addAll(getReservas());
            tvReservas.setEditable(true);
           // reservas = FXCollections.observableArrayList(getReservas());
            tcIdReserva.setCellValueFactory(new PropertyValueFactory<>("id"));
            tcUsuario.setCellValueFactory(new PropertyValueFactory<>("user"));
            tcProducto.setCellValueFactory(new PropertyValueFactory<>("producto"));
           
            tcCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
            tcDescripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
          /*   tcDescripcion.setCellFactory(TextFieldTableCell.forTableColumn());
            tcDescripcion.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Reserva, String> event) {
            Reserva reserva = event.getRowValue();
            reserva.setDescripcion(event.getNewValue());
            }
            });*/
            tcRealizada.setCellValueFactory(new PropertyValueFactory<>("fechaReserva"));
            tcEntrega.setCellValueFactory(new PropertyValueFactory<>("fechaEntrega"));
            tcEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
            //     tcEstado.setCellValueFactory(new PropertyValueFactory<ChoiceBox<EstadoReserva>, EstadoReserva>("estado"));
            tvReservas.getSelectionModel().selectedItemProperty().addListener(this::handleReservaTableSelectionChanged);
            tvReservas.setItems((ObservableList<Reserva>) reservas);
            /*  reservas.forEach((r) -> {
            tvReservas.getItems().add(r);
            });*/
        } catch (IOException ex) {
            Logger.getLogger(ReservasVendedorController1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void handleReservaTableSelectionChanged(ObservableValue observable, Object oldValue, Object newValue) {

    }

}
