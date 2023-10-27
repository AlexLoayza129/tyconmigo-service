package com.appty.appty.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.sound.midi.Track;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.appty.appty.model.AlertToyota;
import com.appty.appty.model.Response;
import com.appty.appty.model.ToyotaIntegracion;
import com.appty.appty.model.TrackClient;
import com.appty.appty.model.TrackVehicle;
import com.appty.appty.model.TrackVehicleData;
import com.appty.appty.model.UpdateData;
import com.appty.appty.repository.AlertToyotaRepository;
import com.appty.appty.repository.ToyotaInteRepository;
import com.appty.appty.repository.TrackClientRepository;
import com.appty.appty.repository.TrackVehRepository;

@RestController
public class IntegracionController {
    
    @Autowired
    ToyotaInteRepository tyiRepo;

    @Autowired
    TrackClientRepository clientRepo;

    @Autowired
    TrackVehRepository vehicleRepo;

    @Autowired
    AlertToyotaRepository alertRepo;

    @GetMapping("/getAlerts")
    List<AlertToyota> getData(){
        return alertRepo.findAll();
    }

    @GetMapping("/getAlerts/{vin}")
    List<AlertToyota> getDataWithVin(@PathVariable("vin") String vin){
        System.out.println(vin);
        return alertRepo.findAllByVin(vin);
    }

    @PostMapping("/toyota/update")
    ResponseEntity<?> updateCustomerAndVehicle(@RequestBody() UpdateData data){

        //? Generate Response
        Response res = new Response();
        List comments = new ArrayList<>();
        res.setStatusCode(200);

        //* Encontrando al cliente y los vehiculos */
        List<TrackVehicleData> vehiculos = data.getVehiculos();
        List<ToyotaIntegracion> clientesTY = tyiRepo.findByNumDocumento(data.getNumDocumento());

        // //! Si no existe el cliente
        if(clientesTY.isEmpty()){
            res.setMessage("Customer not found - Check ID!");
            // comments.add("No se encontró el cliente en ToyotaIntegracion");
            res.setStatusCode(404);
            // return ResponseEntity.ok().body(res);
        }else{
            //* Proceso de actualizacion para el cliente */

            //? Clientes (ToyotaIntegracion)
            for(int i = 0; i < clientesTY.size(); i++){
                ToyotaIntegracion clienteTY = clientesTY.get(i);

                clienteTY.setNombreAsegurado(data.getNombre());           
                clienteTY.setApellidoAsegurado(data.getApellido());
                clienteTY.setTipoDocumento(data.getTipoDocumento());
                clienteTY.setCorreo(data.getCorreo());
                clienteTY.setCelular(data.getCelular());
                clienteTY.setCelular2(data.getCelular2());
                clienteTY.setDireccion(data.getDireccion());
                clienteTY.setCompania(data.getAseguradora());
                tyiRepo.save(clienteTY);
            }

            List<TrackClient> clientesTK = clientRepo.findByDocNumber(data.getNumDocumento());

            //! Si no existe el cliente en RESH
            if(clientesTY.isEmpty()){
                comments.add("No se encontró el cliente en RESH");
                // res.setStatusCode(404);
            }

            //? Clientes (clientes TRACKLINK)
            for(int k = 0; k < clientesTK.size(); k++){
                TrackClient clienteTK = clientesTK.get(k);

                clienteTK.setNombre(data.getNombre());           
                clienteTK.setApellidosC(data.getApellido());
                clienteTK.setTipoCliente((data.getTipoDocumento().equals("DNI")) ? "Natural": "Empresa");
                clienteTK.setCorreo(data.getCorreo());
                clienteTK.setTelefono(data.getCelular());
                clienteTK.setTelefono1(data.getCelular2());
                clienteTK.setDireccion(data.getDireccion());
                clientRepo.save(clienteTK);
            }

        }

        if(vehiculos.isEmpty()){
            comments.add("No se encontraron vehiculos para actualizar");
        }else{
             //? Vehiculos (ToyotaIntegracion)
            for(int j = 0; j < vehiculos.size(); j++){
                TrackVehicleData vehiculoTYJSON = vehiculos.get(j);
                Optional<ToyotaIntegracion> vehiculoOp = tyiRepo.findByChasisAndDocNumber(vehiculoTYJSON.getChasis(), data.getNumDocumento());
                if(vehiculoOp.isPresent()){
                    ToyotaIntegracion vehiculoTY = vehiculoOp.get();
                    vehiculoTY.setMarca(vehiculoTYJSON.getMarca());               
                    vehiculoTY.setModelo(vehiculoTYJSON.getModelo());
                    vehiculoTY.setVersion(vehiculoTYJSON.getVersion());
                    vehiculoTY.setChasis(vehiculoTYJSON.getChasis());
                    vehiculoTY.setPlaca(vehiculoTYJSON.getPlaca());
                    vehiculoTY.setAnioModelo(vehiculoTYJSON.getAnioModelo());
                    vehiculoTY.setAnio(vehiculoTYJSON.getAnio());
                    vehiculoTY.setPrecioLista(vehiculoTYJSON.getPrecio());
                    vehiculoTY.setEjecutivoVenta(vehiculoTYJSON.getEjecutivoVenta());
                    vehiculoTY.setDlrMadre(vehiculoTYJSON.getDlrMadre());
                    tyiRepo.save(vehiculoTY);
                }else{
                    comments.add("No se encontró el vehiculo con chasis: " + vehiculoTYJSON.getChasis());
                    res.setStatusCode(404);
                }
            }

            //? Vehiculos (vehiculos TRACKLINK)
            for(int l = 0; l < vehiculos.size(); l++){
                TrackVehicleData vehiculosTKJSON = vehiculos.get(l);
                Optional<TrackVehicle> vehiculoOp = vehicleRepo.findByChasis(vehiculosTKJSON.getChasis());
                if(vehiculoOp.isPresent()){
                    TrackVehicle vehiculoTK = vehiculoOp.get();
                    vehiculoTK.setMarca(vehiculosTKJSON.getMarca());               
                    vehiculoTK.setModelo(vehiculosTKJSON.getModelo() + " " + vehiculosTKJSON.getVersion());
                    vehiculoTK.setChasis(vehiculosTKJSON.getChasis());
                    vehiculoTK.setPlaca(vehiculosTKJSON.getPlaca());
                    vehiculoTK.setAnio(vehiculosTKJSON.getAnioModelo());
                    vehiculoTK.setPlan(vehiculosTKJSON.getPlan());
                    vehiculoTK.setConcesionario(vehiculosTKJSON.getDlrMadre());               
                    vehiculoTK.setPlanTiempo(vehiculosTKJSON.getAnioContrato());
                    vehicleRepo.save(vehiculoTK);
                }else{
                    comments.add("No se encontró el vehiculo con chasis: " + vehiculosTKJSON.getChasis() + " en RESH");
                    // res.setStatusCode(404);
                }
            }

        }
        
        //* Generando respuesta y guardando alerta
        res.setMessage("ok");
        res.setComments(comments);

        AlertToyota alertTY = new AlertToyota();
        alertTY.setBody(data.toString());
        alertTY.setMessage("ok");
        alertTY.setResponse(res.toString());
        alertTY.setType("update");
        alertTY.setCreatedAt(new Date(System.currentTimeMillis()));
        alertRepo.save(alertTY);
        
        return ResponseEntity.ok().body(res);
    }
}
