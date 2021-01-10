package modelo;

import java.io.Serializable;
import java.sql.Timestamp;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Esta clase se encargará sobre la gestión de reservas
 *
 * @author Fredy Vargas Flores
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ReservaT implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Identificador de la reserva
     */
    
    private final SimpleLongProperty id;

    //producto contiene la reserva
    
    private final SimpleLongProperty producto;
    //descripcion de la reserva
    private final SimpleStringProperty  descripcion;
    //estado de la reserva
    
    private final SimpleStringProperty estado;

    //cliente  de la reserva
    
  //  private Cliente cliente;
    //cantidad del producto
    
    private final SimpleIntegerProperty cantidad;
    //Fecha de reserva
    
    private final SimpleObjectProperty<Timestamp> fechaReserva;
    //Fecha de entrega prevista
    
    private final SimpleObjectProperty<Timestamp> fechaEntrega;
    private final SimpleStringProperty user;

   
    
    public ReservaT(Long id, Long producto, String descripcion, String estado, Integer cantidad, Timestamp fechaReserva, Timestamp fechaEntrega, String user) {
        this.id =new SimpleLongProperty (id);
        this.producto = new SimpleLongProperty (producto);
        this.descripcion = new SimpleStringProperty (descripcion);
        this.estado = new SimpleStringProperty (estado);
        this.cantidad = new SimpleIntegerProperty (cantidad);
        this.fechaReserva = new SimpleObjectProperty<Timestamp> (fechaReserva);
        this.fechaEntrega = new SimpleObjectProperty<Timestamp> (fechaEntrega);
        this.user = new SimpleStringProperty (user);;
    } 
   

    public String getUser() {
        return this.user.get();
    }

    public void setUser(String user) {
        this.user.set(user);
    }
    

    /**
     * Devuelve la id de la reserva
     *
     * @return id
     */
    public Long getId() {
        return this.id.get();
    }

    /**
     * Establece la id de la reserva
     *
     * @param id
     */
    public void setId(Long id) {
        this.id.set(id);
    }

    /**
     * Devuelve la descripcion de la reserva
     *
     * @return descripcion
     */
    public String getDescripcion() {
        return this.descripcion.get();
    }

    /**
     * Inserta la descripcion de la reserva
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion.set(descripcion);
    }

    /**
     * Devuelve el estado de la reserva
     *
     * @return estado
     */
    public String getEstado() {
        return this.estado.get();
    }

    /**
     * Inserta el estado de la reserva
     *
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado.set(estado);
    }

    /**
     * Devuelve el cliente que ha realizado dicha reserva
     *
     * @return cliente
     */
    // @XmlTransient
   /* public Cliente getCliente() {
        return cliente;
    }*/

    /**
     * Añade al cliente de la reserva
     *
     * @param cliente
     */
   /* public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }*/

    /**
     * devuelve del producto
     *
     * @return producto
     */
    // @XmlTransient
    public Long getProducto() {
        return this.producto.get();
    }

    /**
     * inserta el producto a la reserva
     *
     * @param producto
     */
    public void setProducto(Long producto) {
        this.producto.set(producto);
    }

    /**
     * devuelve la cantidad del producto
     *
     * @return cantidad
     */
    public Integer getCantidad() {
        return this.cantidad.get();
    }

    /**
     * inserta la cantidad del producto
     *
     * @param cantidad
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad.set(cantidad);
    }

    /**
     * devuelve la fecha de la reserva
     *
     * @return fechaReserva
     */
    public Timestamp getFechaReserva() {
        return this.fechaReserva.get();
    }

    /**
     * inserta la fecha de reserva
     *
     * @param fechaReserva
     */
    public void setFechaReserva(Timestamp fechaReserva) {
        this.fechaReserva.set(fechaReserva);
    }

    /**
     * devuelve la fecha de la entrega prevista
     *
     * @return fechaEntrega
     */
    public Timestamp getFechaEntrega() {
        return this.fechaEntrega.get();
    }

    /**
     * inserta la fecha de la entrega prevista
     *
     * @param fechaEntrega
     */
    public void setFechaEntrega(Timestamp fechaEntrega) {
        this.fechaEntrega.setValue(fechaEntrega);
    }

}
