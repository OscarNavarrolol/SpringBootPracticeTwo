package com.adso.springbootlibrary.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity        // Declarar la entidad
@Table(name = "libro")  // nombre de la entidad en SQL
@Data  // geters y seters ademas de otras funciones
@AllArgsConstructor // constructor
@NoArgsConstructor // contructor vacio de Lombok

public class Libro {
    @Id      // referenciar que la variable es la pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // se autogenera un valor para el campo
    private Integer id;
    private String titulo;
    private String autor;
    private String genero;
    @Column(name = "anio_publicacion")
    private Integer year;
    private boolean estado_lib;
}
