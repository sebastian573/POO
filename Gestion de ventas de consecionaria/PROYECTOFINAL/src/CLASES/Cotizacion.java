/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//SEBASTIAN PERALTA
package CLASES;

public class Cotizacion {
    private String codigo;
    private Cliente cliente;
    private Usuario vendedor;
    private Vehiculo vehiculo;
    private Promocion promocion;
    private double precioBase;
    private double descuento;
    private double montoTotal;
    private String fecha;
    private String estado;

    public Cotizacion(String codigo, Cliente cliente, Usuario vendedor, 
                      Vehiculo vehiculo, Promocion promocion, String fecha) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.promocion = promocion;
        this.precioBase = vehiculo.getPrecioBase();
        
        
        if (promocion != null) {
            this.descuento = promocion.calcularDescuento(precioBase);
        } else {
            this.descuento = 0;
        }
        
        
        this.montoTotal = precioBase - descuento;
        
        
        this.fecha = fecha;
        
        this.estado = "PENDIENTE";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
        if (promocion != null) {
            this.descuento = promocion.calcularDescuento(precioBase);
        } else {
            this.descuento = 0;
        }
        this.montoTotal = precioBase - descuento;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
