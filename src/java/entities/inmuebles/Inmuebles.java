/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.inmuebles;

import entities.agentes.Agentes;
import entities.clientes.Clientes;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario 2 DAM
 */
@Entity
@Table(catalog = "inmovinescrm", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inmuebles.findAll", query = "SELECT i FROM Inmuebles i")
    , @NamedQuery(name = "Inmuebles.findById", query = "SELECT i FROM Inmuebles i WHERE i.id = :id")
    , @NamedQuery(name = "Inmuebles.findByReferenciaCatastral", query = "SELECT i FROM Inmuebles i WHERE i.referenciaCatastral = :referenciaCatastral")
    , @NamedQuery(name = "Inmuebles.findByReferencia", query = "SELECT i FROM Inmuebles i WHERE i.referencia = :referencia")
    , @NamedQuery(name = "Inmuebles.findByTipo", query = "SELECT i FROM Inmuebles i WHERE i.tipo = :tipo")
    , @NamedQuery(name = "Inmuebles.findByDescripcion", query = "SELECT i FROM Inmuebles i WHERE i.descripcion = :descripcion")
    , @NamedQuery(name = "Inmuebles.findByTextoReclamo", query = "SELECT i FROM Inmuebles i WHERE i.textoReclamo = :textoReclamo")
    , @NamedQuery(name = "Inmuebles.findByGastosComunidad", query = "SELECT i FROM Inmuebles i WHERE i.gastosComunidad = :gastosComunidad")
    , @NamedQuery(name = "Inmuebles.findByAlturaEdificio", query = "SELECT i FROM Inmuebles i WHERE i.alturaEdificio = :alturaEdificio")
    , @NamedQuery(name = "Inmuebles.findByPais", query = "SELECT i FROM Inmuebles i WHERE i.pais = :pais")
    , @NamedQuery(name = "Inmuebles.findByCp", query = "SELECT i FROM Inmuebles i WHERE i.cp = :cp")
    , @NamedQuery(name = "Inmuebles.findByLatitud", query = "SELECT i FROM Inmuebles i WHERE i.latitud = :latitud")
    , @NamedQuery(name = "Inmuebles.findByLongitud", query = "SELECT i FROM Inmuebles i WHERE i.longitud = :longitud")
    , @NamedQuery(name = "Inmuebles.findByDireccionTipoVia", query = "SELECT i FROM Inmuebles i WHERE i.direccionTipoVia = :direccionTipoVia")
    , @NamedQuery(name = "Inmuebles.findByDireccionCalle", query = "SELECT i FROM Inmuebles i WHERE i.direccionCalle = :direccionCalle")
    , @NamedQuery(name = "Inmuebles.findByDireccionNumero", query = "SELECT i FROM Inmuebles i WHERE i.direccionNumero = :direccionNumero")
    , @NamedQuery(name = "Inmuebles.findByDireccionPiso", query = "SELECT i FROM Inmuebles i WHERE i.direccionPiso = :direccionPiso")
    , @NamedQuery(name = "Inmuebles.findByDireccionLetra", query = "SELECT i FROM Inmuebles i WHERE i.direccionLetra = :direccionLetra")
    , @NamedQuery(name = "Inmuebles.findByDireccionEscalera", query = "SELECT i FROM Inmuebles i WHERE i.direccionEscalera = :direccionEscalera")
    , @NamedQuery(name = "Inmuebles.findByPrecioCompra", query = "SELECT i FROM Inmuebles i WHERE i.precioCompra = :precioCompra")
    , @NamedQuery(name = "Inmuebles.findByPrecioAlquiler", query = "SELECT i FROM Inmuebles i WHERE i.precioAlquiler = :precioAlquiler")
    , @NamedQuery(name = "Inmuebles.findByPrecioTraspaso", query = "SELECT i FROM Inmuebles i WHERE i.precioTraspaso = :precioTraspaso")
    , @NamedQuery(name = "Inmuebles.findByPrecioAlquilerOpcionCompra", query = "SELECT i FROM Inmuebles i WHERE i.precioAlquilerOpcionCompra = :precioAlquilerOpcionCompra")
    , @NamedQuery(name = "Inmuebles.findByNHabitaciones", query = "SELECT i FROM Inmuebles i WHERE i.nHabitaciones = :nHabitaciones")
    , @NamedQuery(name = "Inmuebles.findByNBanos", query = "SELECT i FROM Inmuebles i WHERE i.nBanos = :nBanos")
    , @NamedQuery(name = "Inmuebles.findByNAseos", query = "SELECT i FROM Inmuebles i WHERE i.nAseos = :nAseos")
    , @NamedQuery(name = "Inmuebles.findByM2Utiles", query = "SELECT i FROM Inmuebles i WHERE i.m2Utiles = :m2Utiles")
    , @NamedQuery(name = "Inmuebles.findByM2Construidos", query = "SELECT i FROM Inmuebles i WHERE i.m2Construidos = :m2Construidos")
    , @NamedQuery(name = "Inmuebles.findByM2Terreno", query = "SELECT i FROM Inmuebles i WHERE i.m2Terreno = :m2Terreno")
    , @NamedQuery(name = "Inmuebles.findByEstadoConservacion", query = "SELECT i FROM Inmuebles i WHERE i.estadoConservacion = :estadoConservacion")
    , @NamedQuery(name = "Inmuebles.findByVisible", query = "SELECT i FROM Inmuebles i WHERE i.visible = :visible")
    , @NamedQuery(name = "Inmuebles.findByZonaDeportiva", query = "SELECT i FROM Inmuebles i WHERE i.zonaDeportiva = :zonaDeportiva")
    , @NamedQuery(name = "Inmuebles.findByAmueblado", query = "SELECT i FROM Inmuebles i WHERE i.amueblado = :amueblado")
    , @NamedQuery(name = "Inmuebles.findByGaraje", query = "SELECT i FROM Inmuebles i WHERE i.garaje = :garaje")
    , @NamedQuery(name = "Inmuebles.findByCalefaccion", query = "SELECT i FROM Inmuebles i WHERE i.calefaccion = :calefaccion")
    , @NamedQuery(name = "Inmuebles.findByAireAcondicionado", query = "SELECT i FROM Inmuebles i WHERE i.aireAcondicionado = :aireAcondicionado")
    , @NamedQuery(name = "Inmuebles.findByPiscina", query = "SELECT i FROM Inmuebles i WHERE i.piscina = :piscina")
    , @NamedQuery(name = "Inmuebles.findByJardin", query = "SELECT i FROM Inmuebles i WHERE i.jardin = :jardin")
    , @NamedQuery(name = "Inmuebles.findByTrastero", query = "SELECT i FROM Inmuebles i WHERE i.trastero = :trastero")
    , @NamedQuery(name = "Inmuebles.findByAscensor", query = "SELECT i FROM Inmuebles i WHERE i.ascensor = :ascensor")
    , @NamedQuery(name = "Inmuebles.findByTerraza", query = "SELECT i FROM Inmuebles i WHERE i.terraza = :terraza")
    , @NamedQuery(name = "Inmuebles.findByPisoBanco", query = "SELECT i FROM Inmuebles i WHERE i.pisoBanco = :pisoBanco")
    , @NamedQuery(name = "Inmuebles.findByVpo", query = "SELECT i FROM Inmuebles i WHERE i.vpo = :vpo")
    , @NamedQuery(name = "Inmuebles.findByReservado", query = "SELECT i FROM Inmuebles i WHERE i.reservado = :reservado")
    , @NamedQuery(name = "Inmuebles.findByEficienciaEnergeticaTipo", query = "SELECT i FROM Inmuebles i WHERE i.eficienciaEnergeticaTipo = :eficienciaEnergeticaTipo")
    , @NamedQuery(name = "Inmuebles.findByEficienciaEnergeticaEntramite01", query = "SELECT i FROM Inmuebles i WHERE i.eficienciaEnergeticaEntramite01 = :eficienciaEnergeticaEntramite01")
    , @NamedQuery(name = "Inmuebles.findByEficienciaEnergeticaFecvalid", query = "SELECT i FROM Inmuebles i WHERE i.eficienciaEnergeticaFecvalid = :eficienciaEnergeticaFecvalid")
    , @NamedQuery(name = "Inmuebles.findByEficienciaEnergeticaEmisiones", query = "SELECT i FROM Inmuebles i WHERE i.eficienciaEnergeticaEmisiones = :eficienciaEnergeticaEmisiones")
    , @NamedQuery(name = "Inmuebles.findByOrientacionSolar", query = "SELECT i FROM Inmuebles i WHERE i.orientacionSolar = :orientacionSolar")
    , @NamedQuery(name = "Inmuebles.findBySuelos", query = "SELECT i FROM Inmuebles i WHERE i.suelos = :suelos")
    , @NamedQuery(name = "Inmuebles.findByCarpinteriaExterior", query = "SELECT i FROM Inmuebles i WHERE i.carpinteriaExterior = :carpinteriaExterior")
    , @NamedQuery(name = "Inmuebles.findByCarpinteriaInterior", query = "SELECT i FROM Inmuebles i WHERE i.carpinteriaInterior = :carpinteriaInterior")})
public class Inmuebles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    /**
     * ********************************CARÁCTERISTICAS PROPIAS DE
     * INMUEBLE***************************************
     */
    @Basic(optional = false)
    private Long id;
    @Column(name = "referencia_catastral")
    private String referenciaCatastral;
    private String referencia;
    private String tipo;
    private String descripcion;
    @Column(name = "texto_reclamo")
    private String textoReclamo;
    @Column(name = "gastos_comunidad")
    private Integer gastosComunidad;
    @Column(name = "altura_edificio")
    private Short alturaEdificio;
    @Column(name = "precio_compra")
    private Double precioCompra;
    @Column(name = "precio_alquiler")
    private Double precioAlquiler;
    @Column(name = "precio_traspaso")
    private Double precioTraspaso;
    @Column(name = "precio_alquiler_opcion_compra")
    private Double precioAlquilerOpcionCompra;
    @OneToMany(mappedBy = "idInmuebleInteres")
    private List<Clientes> clientesList;
    @JoinColumn(name = "id_agente", referencedColumnName = "id")
    @ManyToOne
    private Agentes idAgente;
    @JoinColumn(name = "id_cliente_propietario", referencedColumnName = "id")
    @ManyToOne
    private Clientes idClientePropietario;

    @Embedded
    private Caracteristicas caracteristicas;

    @Embedded
    private Localizacion localizacion;
    
  

    public Inmuebles() {
    }

    public Inmuebles(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @XmlTransient
    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
    }

    public Agentes getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(Agentes idAgente) {
        this.idAgente = idAgente;
    }

    public Clientes getIdClientePropietario() {
        return idClientePropietario;
    }

    public void setIdClientePropietario(Clientes idClientePropietario) {
        this.idClientePropietario = idClientePropietario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
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
        return "entities.cliente.Inmuebles[ id=" + id + " ]";
    }

}
