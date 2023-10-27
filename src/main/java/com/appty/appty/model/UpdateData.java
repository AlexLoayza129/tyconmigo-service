package com.appty.appty.model;

import java.util.List;
import jakarta.persistence.*;

public class UpdateData {
    String nombre;
    String apellido;
    String tipoDocumento;
    String numDocumento;
    String correo;
    String celular;
    String celular2;
    String direccion;
    String aseguradora;
    List<TrackVehicleData> vehiculos;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    public String getAseguradora() {
        return aseguradora;
    }
    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }
    public List<TrackVehicleData> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(List<TrackVehicleData> vehiculos) {
        this.vehiculos = vehiculos;
    }
    @Override
    public String toString() {
        return "{nombre:" + nombre + ", apellido:" + apellido + ", tipoDocumento:" + tipoDocumento
                + ", numDocumento:" + numDocumento + ", correo:" + correo + ", celular:" + celular + ", celular2:"
                + celular2 + ", direccion:" + direccion + ", aseguradora:" + aseguradora + ", vehiculos:" + vehiculos
                + "}";
    }


}
