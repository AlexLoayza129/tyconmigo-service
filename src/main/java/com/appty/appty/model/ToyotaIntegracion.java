package com.appty.appty.model;

import jakarta.persistence.*;

@Entity
@Table(name = "toyotaintegracion")
public class ToyotaIntegracion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtrama;
    private String nombreAsegurado;
    private String apellidoAsegurado;
    private String tipoDocumento;
    private String numDocumento;
    private String correo; 
    private String celular;
    private String celular2;   
    private String direccion; 
    private String compania;
    private String marca;
    private String modelo; 
    private String version;        
    private String motor;    
    private String chasis;
    private String placa;
    private String anio;
    private String anioModelo;
    private String color;    
    private String cbu;    
    private String plan;
    private String precioLista;
    private String ejecutivoVenta;    
    private String dlrMadre;
    private String tiempo;


    public Integer getIdtrama() {
        return idtrama;
    }
    public void setIdtrama(Integer idtrama) {
        this.idtrama = idtrama;
    }
    public String getNombreAsegurado() {
        return nombreAsegurado;
    }
    public void setNombreAsegurado(String nombreAsegurado) {
        this.nombreAsegurado = nombreAsegurado;
    }
    public String getApellidoAsegurado() {
        return apellidoAsegurado;
    }
    public void setApellidoAsegurado(String apellidoAsegurado) {
        this.apellidoAsegurado = apellidoAsegurado;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getNumDocumento() {
        return numDocumento;
    }
    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getCelular2() {
        return celular2;
    }
    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public String getChasis() {
        return chasis;
    }
    public void setChasis(String chasis) {
        this.chasis = chasis;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }
    public String getAnioModelo() {
        return anioModelo;
    }
    public void setAnioModelo(String anioModelo) {
        this.anioModelo = anioModelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getCbu() {
        return cbu;
    }
    public void setCbu(String cbu) {
        this.cbu = cbu;
    }
    public String getPlan() {
        return plan;
    }
    public void setPlan(String plan) {
        this.plan = plan;
    }
    public String getEjecutivoVenta() {
        return ejecutivoVenta;
    }
    public void setEjecutivoVenta(String ejecutivoVenta) {
        this.ejecutivoVenta = ejecutivoVenta;
    }
    public String getDlrMadre() {
        return dlrMadre;
    }
    public void setDlrMadre(String dlrMadre) {
        this.dlrMadre = dlrMadre;
    }
    public String getPrecioLista() {
        return precioLista;
    }
    public void setPrecioLista(String precioLista) {
        this.precioLista = precioLista;
    }
    public String getCompania() {
        return compania;
    }
    public void setCompania(String compania) {
        this.compania = compania;
    }
    public String getTiempo() {
        return tiempo;
    }
    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    
    
    

}
