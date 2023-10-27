package com.appty.appty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.appty.appty.model.AlertToyota;

@Repository
public interface AlertToyotaRepository extends JpaRepository<AlertToyota, Integer>{


    @Query(nativeQuery = true, value = "SELECT * FROM alert_toyota WHERE body LIKE %:vin% ")
    List<AlertToyota> findAllByVin(@Param("vin") String vin);

}
