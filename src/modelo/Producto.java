package modelo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lorena Cáceres Manuel
 *
 * Entidad producto está relacionada con la entidad Reserva, vendedor y
 * proveedor. Esta entidad tiene una identificador de producto, una descripción,
 * un precio y una imagen del producto.
 */

@XmlRootElement
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Identificador del producto
     */
    
    private Long id;
    /**
     * Descripcion del producto
     */
 
    private String descripcion;
    /**
     * Precio del producto
     */
    
    private Float precio;
    /**
     * Imagen del producto
     */
   
    private byte[] imagen;

    
    private String talla;

   
    
    private TipoProducto tipo;

    
    private Integer stock;

    
    private String modelo;

    /**
     * Relación con la entidad Reserva
     */
    
   // private Set<Reserva> reservas;
    /**
     * Relación con la entidad Proveedor
     */
    
   // private Proveedor proveedor;
    /**
     * Relación con la entidad Vendedor
     */
    
  //  private Set<Vendedor> vendedores;

    /**
     * Devuelve la imagen del producto
     *
     * @return imagen
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * Inserta la imagen del producto
     *
     * @param imagen que establecemos
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    /**
     * Devuelve una lista de reservas
     *
     * @return reseva
     */
  /*  @XmlTransient
    public Set<Reserva> getReservas() {
        return reservas;
    }*/

    /**
     * Establece una lista de reservas
     *
     * @param reserva que establecemos
     */
  /*  public void setReservas(Set<Reserva> reserva) {
        this.reservas = reserva;
    }*/

    /**
     * Devuelve un proveedor
     *
     * @return proveedor
     */
  /*  public Proveedor getProveedor() {
        return proveedor;
    }*/

    /**
     * Establece un proveedor
     *
     * @param proveedor que establecemos
     */
   /* public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }*/

    /**
     * Devuelve una lista de vendedores
     *
     * @return vendedores, contiene los vendedores que han gestionado un
     * producto
     */
   /* @XmlTransient
    public Set<Vendedor> getVendedores() {
        return vendedores;
    }*/

    /**
     * Establece una lista de vendedores
     *
     * @param vendedores que establecemos
     */
  /*  public void setVendedores(Set<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }*/

    /**
     * Devuelve una descripcion del producto
     *
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece una descripcion del producto
     *
     * @param descripcion que estableceremos
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve el precio del producto
     *
     * @return precio
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto
     *
     * @param precio que estableceremos
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    /**
     * Devuelve la id del producto
     *
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece la id del producto
     *
     * @param id que estableceremos
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * Devuelve la talla del producto
     *
     * @return talla
     */
    public String getTalla() {
        return talla;
    }

    /**
     * Establece la talla del producto
     *
     * @param talla
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }

    /**
     * Devuelve el tipo del producto
     *
     * @return tipo. Zapatillas. Ropa
     */
    public TipoProducto getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo del producto
     *
     * @param tipo
     */
    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve la cantidad en stock del producto
     *
     * @return stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * Establece la cantidad en stock del producto
     *
     * @param stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * Devuelve el modelo del producto
     *
     * @return modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del producto
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
