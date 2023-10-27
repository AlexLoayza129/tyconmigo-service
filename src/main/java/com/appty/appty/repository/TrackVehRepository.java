package com.appty.appty.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.appty.appty.model.TrackVehicle;

@Repository
public interface TrackVehRepository extends JpaRepository<TrackVehicle, Integer>{
    
    // @Query(nativeQuery = true, value = "SELECT * FROM vehiculos WHERE chasis =: vin AND idcliente = :idcliente ORDER BY idcliente DESC LIMIT 1")
    // TrackVehicle findByIdVehicle(@Param("vin") String vin, @Param("idcliente") String idcliente);
    
    Optional<TrackVehicle> findByChasis(String chasis);

}   
