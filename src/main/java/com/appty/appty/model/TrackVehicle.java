package com.appty.appty.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculos")
public class TrackVehicle {
    
    @Id
    Integer idvehiculo;
    String marca;
    String modelo;
    String color;  
    String anio;
    String placa;
    String motor;
    String chasis;
    String concesionario;
    String companiaseguro; 
    String plan;
    String plantiempo;
    
    public Integer getIdvehiculo() {
        return idvehiculo;
    }
    public void setIdvehiculo(Integer idvehiculo) {
        this.idvehiculo = idvehiculo;
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
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
    public String getConcesionario() {
        return concesionario;
    }
    public void setConcesionario(String concesionario) {
        this.concesionario = concesionario;
    }
    public String getCompaniaSeguro() {
        return companiaseguro;
    }
    public void setCompaniaSeguro(String companiaSeguro) {
        this.companiaseguro = companiaSeguro;
    }
    public String getPlan() {
        return plan;
    }
    public void setPlan(String plan) {
        this.plan = plan;
    }
    public String getPlanTiempo() {
        return plantiempo;
    }
    public void setPlanTiempo(String planTiempo) {
        this.plantiempo = planTiempo;
    }

    
    
}
