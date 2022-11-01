package com.ejemplo.backendapp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "no debe estar vacío")
    @Size(min = 4, max = 15, message = "el tamaño debe estar entre 4 y 15 letras")
    @Column(nullable = false)
    private String nombre;

    @NotEmpty(message = "no debe estar vacío")
    private String apellido;

    @NotEmpty(message = "no debe estar vacío")
    @Email(message="no es una dirección de correo bien formada")
    @Column(nullable = false, unique = true)
    private String email;

    @NotNull(message = "no debe estar vacío")
    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    private String foto;

    @NotNull(message = "no debe estar vacío")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Region region;

    @JsonIgnoreProperties(value={"cliente", "hibernateLazyInitializer", "handler"}, allowSetters = true)
    @OneToMany(fetch=FetchType.LAZY,mappedBy = "cliente", cascade=CascadeType.ALL)
    private List<Factura> facturas;

    public Cliente(){
        this.facturas = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date creatAt) {
        this.createAt = creatAt;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    private static final long serialVersionUID = 1L;
}