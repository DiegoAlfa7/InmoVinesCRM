/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.inmuebles;

import entities.agentes.Agentes;
import entities.clientes.Clientes;
import entities.Comunidades;
import entities.Municipios;
import entities.Provincias;
import entities.Zonas;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
    private String pais;
    private String cp;
    private String latitud;
    private String longitud;
    @Column(name = "direccion_tipo_via")
    private String direccionTipoVia;
    @Column(name = "direccion_calle")
    private String direccionCalle;
    @Column(name = "direccion_numero")
    private String direccionNumero;
    @Column(name = "direccion_piso")
    private String direccionPiso;
    @Column(name = "direccion_letra")
    private String direccionLetra;
    @Column(name = "direccion_escalera")
    private String direccionEscalera;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_compra")
    private Double precioCompra;
    @Column(name = "precio_alquiler")
    private Double precioAlquiler;
    @Column(name = "precio_traspaso")
    private Double precioTraspaso;
    @Column(name = "precio_alquiler_opcion_compra")
    private Double precioAlquilerOpcionCompra;
    @Column(name = "n_habitaciones")
    private Short nHabitaciones;
    @Column(name = "n_banos")
    private Short nBanos;
    @Column(name = "n_aseos")
    private Short nAseos;
    @Column(name = "m2_utiles")
    private Double m2Utiles;
    @Column(name = "m2_construidos")
    private Float m2Construidos;
    @Column(name = "m2_terreno")
    private Double m2Terreno;
    @Basic(optional = false)
    @Column(name = "estado_conservacion")
    private String estadoConservacion;
    private Boolean visible;
    @Column(name = "zona_deportiva")
    private Boolean zonaDeportiva;
    private Boolean amueblado;
    private Boolean garaje;
    private Boolean calefaccion;
    @Column(name = "aire_acondicionado")
    private Boolean aireAcondicionado;
    private Boolean piscina;
    private Boolean jardin;
    private Boolean trastero;
    private Boolean ascensor;
    private Boolean terraza;
    @Column(name = "piso_banco")
    private Boolean pisoBanco;
    private Boolean vpo;
    private Boolean reservado;
    @Column(name = "eficiencia_energetica_tipo")
    private String eficienciaEnergeticaTipo;
    @Basic(optional = false)
    @Column(name = "eficiencia_energetica_entramite_01")
    private boolean eficienciaEnergeticaEntramite01;
    @Column(name = "eficiencia_energetica_fecvalid")
    @Temporal(TemporalType.DATE)
    private Date eficienciaEnergeticaFecvalid;
    @Column(name = "eficiencia_energetica_emisiones")
    private Float eficienciaEnergeticaEmisiones;
    @Column(name = "orientacion_solar")
    private String orientacionSolar;
    private String suelos;
    @Column(name = "carpinteria_exterior")
    private String carpinteriaExterior;
    @Column(name = "carpinteria_interior")
    private String carpinteriaInterior;
    @OneToMany(mappedBy = "idInmuebleInteres")
    private List<Clientes> clientesList;
    @JoinColumn(name = "id_agente", referencedColumnName = "id")
    @ManyToOne
    private Agentes idAgente;
    @JoinColumn(name = "id_comunidad", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Comunidades idComunidad;
    @JoinColumn(name = "id_municipios", referencedColumnName = "ID")
    @ManyToOne
    private Municipios idMunicipios;
    @JoinColumn(name = "id_cliente_propietario", referencedColumnName = "id")
    @ManyToOne
    private Clientes idClientePropietario;
    @JoinColumn(name = "id_provincia", referencedColumnName = "ID")
    @ManyToOne
    private Provincias idProvincia;
    @JoinColumn(name = "id_zona", referencedColumnName = "id")
    @ManyToOne
    private Zonas idZona;

    public Inmuebles() {
    }

    public Inmuebles(Long id) {
        this.id = id;
    }

    public Inmuebles(Long id, String estadoConservacion, boolean eficienciaEnergeticaEntramite01) {
        this.id = id;
        this.estadoConservacion = estadoConservacion;
        this.eficienciaEnergeticaEntramite01 = eficienciaEnergeticaEntramite01;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getDireccionTipoVia() {
        return direccionTipoVia;
    }

    public void setDireccionTipoVia(String direccionTipoVia) {
        this.direccionTipoVia = direccionTipoVia;
    }

    public String getDireccionCalle() {
        return direccionCalle;
    }

    public void setDireccionCalle(String direccionCalle) {
        this.direccionCalle = direccionCalle;
    }

    public String getDireccionNumero() {
        return direccionNumero;
    }

    public void setDireccionNumero(String direccionNumero) {
        this.direccionNumero = direccionNumero;
    }

    public String getDireccionPiso() {
        return direccionPiso;
    }

    public void setDireccionPiso(String direccionPiso) {
        this.direccionPiso = direccionPiso;
    }

    public String getDireccionLetra() {
        return direccionLetra;
    }

    public void setDireccionLetra(String direccionLetra) {
        this.direccionLetra = direccionLetra;
    }

    public String getDireccionEscalera() {
        return direccionEscalera;
    }

    public void setDireccionEscalera(String direccionEscalera) {
        this.direccionEscalera = direccionEscalera;
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

    public Short getNHabitaciones() {
        return nHabitaciones;
    }

    public void setNHabitaciones(Short nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }

    public Short getNBanos() {
        return nBanos;
    }

    public void setNBanos(Short nBanos) {
        this.nBanos = nBanos;
    }

    public Short getNAseos() {
        return nAseos;
    }

    public void setNAseos(Short nAseos) {
        this.nAseos = nAseos;
    }

    public Double getM2Utiles() {
        return m2Utiles;
    }

    public void setM2Utiles(Double m2Utiles) {
        this.m2Utiles = m2Utiles;
    }

    public Float getM2Construidos() {
        return m2Construidos;
    }

    public void setM2Construidos(Float m2Construidos) {
        this.m2Construidos = m2Construidos;
    }

    public Double getM2Terreno() {
        return m2Terreno;
    }

    public void setM2Terreno(Double m2Terreno) {
        this.m2Terreno = m2Terreno;
    }

    public String getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(String estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getZonaDeportiva() {
        return zonaDeportiva;
    }

    public void setZonaDeportiva(Boolean zonaDeportiva) {
        this.zonaDeportiva = zonaDeportiva;
    }

    public Boolean getAmueblado() {
        return amueblado;
    }

    public void setAmueblado(Boolean amueblado) {
        this.amueblado = amueblado;
    }

    public Boolean getGaraje() {
        return garaje;
    }

    public void setGaraje(Boolean garaje) {
        this.garaje = garaje;
    }

    public Boolean getCalefaccion() {
        return calefaccion;
    }

    public void setCalefaccion(Boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    public Boolean getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(Boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public Boolean getPiscina() {
        return piscina;
    }

    public void setPiscina(Boolean piscina) {
        this.piscina = piscina;
    }

    public Boolean getJardin() {
        return jardin;
    }

    public void setJardin(Boolean jardin) {
        this.jardin = jardin;
    }

    public Boolean getTrastero() {
        return trastero;
    }

    public void setTrastero(Boolean trastero) {
        this.trastero = trastero;
    }

    public Boolean getAscensor() {
        return ascensor;
    }

    public void setAscensor(Boolean ascensor) {
        this.ascensor = ascensor;
    }

    public Boolean getTerraza() {
        return terraza;
    }

    public void setTerraza(Boolean terraza) {
        this.terraza = terraza;
    }

    public Boolean getPisoBanco() {
        return pisoBanco;
    }

    public void setPisoBanco(Boolean pisoBanco) {
        this.pisoBanco = pisoBanco;
    }

    public Boolean getVpo() {
        return vpo;
    }

    public void setVpo(Boolean vpo) {
        this.vpo = vpo;
    }

    public Boolean getReservado() {
        return reservado;
    }

    public void setReservado(Boolean reservado) {
        this.reservado = reservado;
    }

    public String getEficienciaEnergeticaTipo() {
        return eficienciaEnergeticaTipo;
    }

    public void setEficienciaEnergeticaTipo(String eficienciaEnergeticaTipo) {
        this.eficienciaEnergeticaTipo = eficienciaEnergeticaTipo;
    }

    public boolean getEficienciaEnergeticaEntramite01() {
        return eficienciaEnergeticaEntramite01;
    }

    public void setEficienciaEnergeticaEntramite01(boolean eficienciaEnergeticaEntramite01) {
        this.eficienciaEnergeticaEntramite01 = eficienciaEnergeticaEntramite01;
    }

    public Date getEficienciaEnergeticaFecvalid() {
        return eficienciaEnergeticaFecvalid;
    }

    public void setEficienciaEnergeticaFecvalid(Date eficienciaEnergeticaFecvalid) {
        this.eficienciaEnergeticaFecvalid = eficienciaEnergeticaFecvalid;
    }

    public Float getEficienciaEnergeticaEmisiones() {
        return eficienciaEnergeticaEmisiones;
    }

    public void setEficienciaEnergeticaEmisiones(Float eficienciaEnergeticaEmisiones) {
        this.eficienciaEnergeticaEmisiones = eficienciaEnergeticaEmisiones;
    }

    public String getOrientacionSolar() {
        return orientacionSolar;
    }

    public void setOrientacionSolar(String orientacionSolar) {
        this.orientacionSolar = orientacionSolar;
    }

    public String getSuelos() {
        return suelos;
    }

    public void setSuelos(String suelos) {
        this.suelos = suelos;
    }

    public String getCarpinteriaExterior() {
        return carpinteriaExterior;
    }

    public void setCarpinteriaExterior(String carpinteriaExterior) {
        this.carpinteriaExterior = carpinteriaExterior;
    }

    public String getCarpinteriaInterior() {
        return carpinteriaInterior;
    }

    public void setCarpinteriaInterior(String carpinteriaInterior) {
        this.carpinteriaInterior = carpinteriaInterior;
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

    public Comunidades getIdComunidad() {
        return idComunidad;
    }

    public void setIdComunidad(Comunidades idComunidad) {
        this.idComunidad = idComunidad;
    }

    public Municipios getIdMunicipios() {
        return idMunicipios;
    }

    public void setIdMunicipios(Municipios idMunicipios) {
        this.idMunicipios = idMunicipios;
    }

    public Clientes getIdClientePropietario() {
        return idClientePropietario;
    }

    public void setIdClientePropietario(Clientes idClientePropietario) {
        this.idClientePropietario = idClientePropietario;
    }

    public Provincias getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Provincias idProvincia) {
        this.idProvincia = idProvincia;
    }

    public Zonas getIdZona() {
        return idZona;
    }

    public void setIdZona(Zonas idZona) {
        this.idZona = idZona;
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
