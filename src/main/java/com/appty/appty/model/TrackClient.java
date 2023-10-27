package com.appty.appty.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class TrackClient {
    
    @Id
    Integer idcliente;
    String tipocliente;
    String dni;
    String ruc;
    String nombre;
    String razonsocial;
    String apellidosC;
    String observaciones;
    String departamento;
    String provincia;
    String distrito;
    String direccion;
    String referencia;
    String departamentoL;        
    String provinciaL;    
    String distritoL;    
    String telefono;  
    String telefono1;    
    String telefono2;    
    String telefono3;    
    String correo;
    String correo1;
    String correo2;
    String correo3;
    String fechanacimiento;
    String sectordesempenia;
    String idcreador;
    String fechacreada;
    String estado;
    String fechaactualizacion;
    String idcustomer;
    String idlocation;
    String idactualizador;
    // String created_at;
    // String updated_at;

    public Integer getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }
    public String getTipoCliente() {
        return tipocliente;
    }
    public void setTipoCliente(String tCliente) {
        this.tipocliente = tCliente;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getRuc() {
        return ruc;
    }
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidosC() {
        return apellidosC;
    }
    public void setApellidosC(String apellidosC) {
        this.apellidosC = apellidosC;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getDistrito() {
        return distrito;
    }
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public String getDepartamentoL() {
        return departamentoL;
    }
    public void setDepartamentoL(String departamentoL) {
        this.departamentoL = departamentoL;
    }
    public String getProvinciaL() {
        return provinciaL;
    }
    public void setProvinciaL(String provinciaL) {
        this.provinciaL = provinciaL;
    }
    public String getDistritoL() {
        return distritoL;
    }
    public void setDistritoL(String distritoL) {
        this.distritoL = distritoL;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono1() {
        return telefono1;
    }
    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }
    public String getTelefono2() {
        return telefono2;
    }
    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }
    public String getTelefono3() {
        return telefono3;
    }
    public void setTelefono3(String telefono3) {
        this.telefono3 = telefono3;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCorreo1() {
        return correo1;
    }
    public void setCorreo1(String correo1) {
        this.correo1 = correo1;
    }
    public String getCorreo2() {
        return correo2;
    }
    public void setCorreo2(String correo2) {
        this.correo2 = correo2;
    }
    public String getCorreo3() {
        return correo3;
    }
    public void setCorreo3(String correo3) {
        this.correo3 = correo3;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getIdactualizador() {
        return idactualizador;
    }
    public void setIdactualizador(String idactualizador) {
        this.idactualizador = idactualizador;
    }
    public String getIdcustomer() {
        return idcustomer;
    }
    public void setIdcustomer(String idcustomer) {
        this.idcustomer = idcustomer;
    }
    public String getIdlocation() {
        return idlocation;
    }
    public void setIdlocation(String idlocation) {
        this.idlocation = idlocation;
    }
    
        
}
