/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 *
 * @author Usuario 2 DAM
 */
@Embeddable
public class Localizacion {

    @Column(name = "pais")
    private String pais;
    @Column(name = "provincia")
    private String provincia;
    @Column(name = "poblacion")
    private String poblacion;
    @Column(name = "zona")
    private String zona;
    @Column(name = "cp")
    private String cp;
    @Column(name = "latitud")
    private String latitud;
    @Column(name = "longitud")
    private String longitud;
    @Embedded
    private Direccion direccion;

    public Localizacion() {
    }

    public Localizacion(String pais, String provincia, String poblacion, String zona, String cp, String latitud, String longitud, Direccion direccion) {
        this.pais = pais;
        this.provincia = provincia;
        this.poblacion = poblacion;
        this.zona = zona;
        this.cp = cp;
        this.latitud = latitud;
        this.longitud = longitud;
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}
