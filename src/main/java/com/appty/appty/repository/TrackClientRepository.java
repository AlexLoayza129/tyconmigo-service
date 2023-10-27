package com.appty.appty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.appty.appty.model.TrackClient;

@Repository
public interface TrackClientRepository extends JpaRepository<TrackClient, Integer>{
    

    @Query(nativeQuery = true, value = "SELECT * FROM clientes WHERE dni IN (:docNumber) OR ruc IN (:docNumber) ORDER BY idcliente DESC LIMIT 1")
    List<TrackClient> findByDocNumber(@Param("docNumber") String docNumber);

}
