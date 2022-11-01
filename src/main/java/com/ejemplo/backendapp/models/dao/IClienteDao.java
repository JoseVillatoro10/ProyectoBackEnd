package com.ejemplo.backendapp.models.dao;

import com.ejemplo.backendapp.models.entity.Cliente;
import com.ejemplo.backendapp.models.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

    @Query("from Region")
    public List<Region> findAllRegiones();
}
