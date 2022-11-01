package com.ejemplo.backendapp.models.services;

import com.ejemplo.backendapp.models.entity.Usuario;

public interface IUsuarioService {

    public Usuario findByUsername(String username);
}