package com.appty.appty.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//*JSON que recibimos de TY Conmigo (Vehiculo)
public class TrackVehicleData {
    
    Integer idvehiculo;
    String marca;
    String modelo;
    String version;   
    String motor;
    String chasis;
    String placa;
    String anio;
    String anioModelo;    
    String color;
    String cbu;
    String plan;
    String anioContrato;
    String precio;
    String ejecutivoVenta;
    String dlrMadre;

    public Integer getIdvehiculo() {
        return idvehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getVersion() {
        return version;
    }

    public String getMotor() {
        return motor;
    }

    public String getChasis() {
        return chasis;
    }

    public String getPlaca() {
        return placa;
    }

    public String getAnio() {
        return anio;
    }

    public String getAnioModelo() {
        return anioModelo;
    }

    public String getColor() {
        return color;
    }

    public String getCbu() {
        return cbu;
    }

    public String getPlan() {
        return plan;
    }

    public String getAnioContrato() {
        return anioContrato;
    }

    public String getPrecio() {
        return precio;
    }

    public String getEjecutivoVenta() {
        return ejecutivoVenta;
    }

    public String getDlrMadre() {
        return dlrMadre;
    }

    @Override
    public String toString() {
        return "{idvehiculo:" + idvehiculo + ", marca:" + marca + ", modelo:" + modelo + ", version:"
                + version + ", motor:" + motor + ", chasis:" + chasis + ", placa:" + placa + ", anio:" + anio
                + ", anioModelo:" + anioModelo + ", color:" + color + ", cbu:" + cbu + ", plan:" + plan
                + ", anioContrato:" + anioContrato + ", precio:" + precio + ", ejecutivoVenta:" + ejecutivoVenta
                + ", dlrMadre:" + dlrMadre + "}";
    }

    
}
