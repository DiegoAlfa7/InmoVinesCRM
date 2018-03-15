/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.inmueble;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario 2 DAM
 */
@Entity
@Table(name = "inmuebles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inmuebles.findAll", query = "SELECT i FROM Inmuebles i")
    , @NamedQuery(name = "Inmuebles.findById", query = "SELECT i FROM Inmuebles i WHERE i.id = :id")
    , @NamedQuery(name = "Inmuebles.findByIdCliente", query = "SELECT i FROM Inmuebles i WHERE i.idCliente = :idCliente")
    , @NamedQuery(name = "Inmuebles.findByIdAgente", query = "SELECT i FROM Inmuebles i WHERE i.idAgente = :idAgente")
    , @NamedQuery(name = "Inmuebles.findByReferenciaCatastral", query = "SELECT i FROM Inmuebles i WHERE i.referenciaCatastral = :referenciaCatastral")
    , @NamedQuery(name = "Inmuebles.findByReferencia", query = "SELECT i FROM Inmuebles i WHERE i.referencia = :referencia")
    , @NamedQuery(name = "Inmuebles.findByTipo", query = "SELECT i FROM Inmuebles i WHERE i.tipo = :tipo")
    , @NamedQuery(name = "Inmuebles.findByDescripcion", query = "SELECT i FROM Inmuebles i WHERE i.descripcion = :descripcion")
    , @NamedQuery(name = "Inmuebles.findByTextoReclamo", query = "SELECT i FROM Inmuebles i WHERE i.textoReclamo = :textoReclamo")
    , @NamedQuery(name = "Inmuebles.findByGastosComunidad", query = "SELECT i FROM Inmuebles i WHERE i.gastosComunidad = :gastosComunidad")
    , @NamedQuery(name = "Inmuebles.findByAlturaEdificio", query = "SELECT i FROM Inmuebles i WHERE i.alturaEdificio = :alturaEdificio")
    , @NamedQuery(name = "Inmuebles.findByPrecioCompra", query = "SELECT i FROM Inmuebles i WHERE i.precioCompra = :precioCompra")
    , @NamedQuery(name = "Inmuebles.findByPrecioAlquiler", query = "SELECT i FROM Inmuebles i WHERE i.precioAlquiler = :precioAlquiler")
    , @NamedQuery(name = "Inmuebles.findByPrecioTraspaso", query = "SELECT i FROM Inmuebles i WHERE i.precioTraspaso = :precioTraspaso")
    , @NamedQuery(name = "Inmuebles.findByPrecioAlquilerOpcionCompra", query = "SELECT i FROM Inmuebles i WHERE i.precioAlquilerOpcionCompra = :precioAlquilerOpcionCompra")
})
public class Inmuebles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "id_cliente")
    private BigInteger idCliente;
    @Column(name = "id_agente")
    private BigInteger idAgente;
    @Column(name = "referencia_catastral")
    private String referenciaCatastral;
    @Column(name = "referencia")
    private String referencia;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "texto_reclamo")
    private String textoReclamo;
    @Column(name = "gastos_comunidad")
    private Integer gastosComunidad;
    @Column(name = "altura_edificio")
    private Short alturaEdificio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_compra")
    private Double precioCompra;
    @Column(name = "precio_alquiler")
    private Double precioAlquiler;
    @Column(name = "precio_traspaso")
    private Double precioTraspaso;
    @Column(name = "precio_alquiler_opcion_compra")
    private Double precioAlquilerOpcionCompra;
    @Embedded
    private Caracteristicas caracteristicas;
    @Embedded
    private Localizacion localizacion;

    public Inmuebles() {
    }

    public Inmuebles(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigInteger getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(BigInteger idCliente) {
        this.idCliente = idCliente;
    }

    public BigInteger getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(BigInteger idAgente) {
        this.idAgente = idAgente;
    }

    public String getReferenciaCatastral() {
        return referenciaCatastral;
    }

    public void setReferenciaCatastral(String referenciaCatastral) {
        this.referenciaCatastral = referenciaCatastral;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTextoReclamo() {
        return textoReclamo;
    }

    public void setTextoReclamo(String textoReclamo) {
        this.textoReclamo = textoReclamo;
    }

    public Integer getGastosComunidad() {
        return gastosComunidad;
    }

    public void setGastosComunidad(Integer gastosComunidad) {
        this.gastosComunidad = gastosComunidad;
    }

    public Short getAlturaEdificio() {
        return alturaEdificio;
    }

    public void setAlturaEdificio(Short alturaEdificio) {
        this.alturaEdificio = alturaEdificio;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(Double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public Double getPrecioTraspaso() {
        return precioTraspaso;
    }

    public void setPrecioTraspaso(Double precioTraspaso) {
        this.precioTraspaso = precioTraspaso;
    }

    public Double getPrecioAlquilerOpcionCompra() {
        return precioAlquilerOpcionCompra;
    }

    public void setPrecioAlquilerOpcionCompra(Double precioAlquilerOpcionCompra) {
        this.precioAlquilerOpcionCompra = precioAlquilerOpcionCompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public Caracteristicas getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(Caracteristicas caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inmuebles)) {
            return false;
        }
        Inmuebles other = (Inmuebles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Inmuebles[ id=" + id + " ]";
    }

}
