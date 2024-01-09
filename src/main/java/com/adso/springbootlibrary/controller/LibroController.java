package com.adso.springbootlibrary.controller;

import com.adso.springbootlibrary.entities.Libro;
import com.adso.springbootlibrary.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/libreriaODNV")
@Controller
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping
    public String listaLibros(Model model){
        List<Libro> libros = libroService.listaLibros();
        model.addAttribute("listLibros",libros);
        return "formListado";
    }

}
