package com.adso.springbootlibrary.service.impl;

import com.adso.springbootlibrary.entities.Libro;
import com.adso.springbootlibrary.repository.LibroRepository;
import com.adso.springbootlibrary.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// se crea la clase donde se implementa la interfaz y aquí se desarrolla los metodos
@Service  // esteriotipo para indicar que este es el servicio
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository; // para mandar la consulta directo a la bd
    @Override
    public List<Libro> listaLibros() {
        return libroRepository.findAll();
    }

    @Override
    public Libro obtenerPorId(Integer id) {
        return libroRepository.findById(id).orElse(null);
    }

    @Override
    public Libro crearLibros(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public Libro actualizarLibros(Integer id, Libro libro) {
        Libro libroBBDD = libroRepository.findById(id).orElse(null);

        if (libroBBDD != null){
            libroBBDD.setTitulo(libro.getTitulo());
            libroBBDD.setAutor(libro.getAutor());
            libroBBDD.setGenero(libro.getGenero());
            libroBBDD.setYear(libro.getYear());
            libroBBDD.setEstado_lib(libro.isEstado_lib());
            return libroRepository.save(libroBBDD);
        }
        return null;
    }

    @Override
    public void eliminarLibros(Integer id) {
        libroRepository.deleteById(id);
    }

    @Override
    public Long contarLibros() {
        return libroRepository.count();
    }
}
