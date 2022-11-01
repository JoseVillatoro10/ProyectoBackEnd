package com.ejemplo.backendapp.models.dao;

import com.ejemplo.backendapp.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao extends CrudRepository <Factura, Long>{



}