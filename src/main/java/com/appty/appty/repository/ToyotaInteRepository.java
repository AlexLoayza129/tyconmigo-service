package com.appty.appty.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.appty.appty.model.ToyotaIntegracion;

@Repository
public interface ToyotaInteRepository extends JpaRepository<ToyotaIntegracion, Integer>{


    // @Query(nativeQuery = true, value="SELECT * FROM toyotaintegracion WHERE chasis = :vin ORDER BY idtrama DESC LIMIT 1")
    // Optional<ToyotaIntegracion> getCustomerByVin(@Param("vin") String vin);
    @Query(nativeQuery = true, value="SELECT * FROM toyotaintegracion WHERE num_documento = :numDoc AND estado = 1 AND chasis = :vin ORDER BY idtrama DESC LIMIT 1")
    Optional<ToyotaIntegracion> findByChasisAndDocNumber(@Param("vin") String vin, @Param("numDoc") String docNumber);

    @Query(nativeQuery = true, value="SELECT * FROM toyotaintegracion WHERE num_documento = :numDoc AND estado = 1 ORDER BY idtrama DESC")
    List<ToyotaIntegracion> findByNumDocumento(@Param("numDoc") String numDoc);

}
