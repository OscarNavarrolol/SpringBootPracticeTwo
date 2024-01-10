package com.adso.springbootlibrary;

import com.adso.springbootlibrary.entities.Libro;
import com.adso.springbootlibrary.service.LibroService;
import com.adso.springbootlibrary.service.impl.LibroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondSpringbootLibraryApplication {



    public static void main(String[] args) {

        LibroService libroService;

        SpringApplication.run(SecondSpringbootLibraryApplication.class, args);
         }

}
