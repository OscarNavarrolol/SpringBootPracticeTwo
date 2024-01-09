package com.adso.springbootlibrary.service;

import com.adso.springbootlibrary.entities.Libro;

import java.util.List;

public interface LibroService {

    List<Libro> listaLibros();
    Libro obtenerPorId(Integer id);
    Libro crearLibros(Libro libro);
    Libro actualizarLibros(Integer id, Libro libro);
    void eliminarLibros(Integer id);
    Long contarLibros();

}
