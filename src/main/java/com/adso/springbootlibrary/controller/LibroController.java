package com.adso.springbootlibrary.controller;

import com.adso.springbootlibrary.entities.Libro;
import com.adso.springbootlibrary.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/libreria")
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

    @GetMapping("/nuevolibro")
    public String ingresoNuevoLibro(Model model){
        model.addAttribute("newlibro",new Libro());
        model.addAttribute("accion","");
        return "formNuevoLibro";
    }

    @PostMapping("/nuevolibro")
    public String guardarLibro(@ModelAttribute Libro libro){
        libroService.crearLibros(libro);
        return "redirect:/libreria";
    }

    @GetMapping("/editarinfo/{id}")
    public String actualizarLibro(@PathVariable Integer id,@ModelAttribute Libro libro, Model model){
        model.addAttribute("newlibro",libro);
        model.addAttribute("accion","/libreria/editarinfo/" + id);
        return "formNuevoLibro";
    }

    @PostMapping("/editarinfo/{id}")
    public String actualizacion(@PathVariable Integer id,@ModelAttribute Libro libro){
        libroService.actualizarLibros(id, libro);
        return "redirect:/libreria";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id){
        libroService.eliminarLibros(id);
        return "redirect:/libreria";
    }
}
