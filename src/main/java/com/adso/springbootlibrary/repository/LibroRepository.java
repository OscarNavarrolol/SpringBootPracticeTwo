package com.adso.springbootlibrary.repository;

import com.adso.springbootlibrary.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository  // esteriotipo SQL para dar a enteder que la clase es utilizada de repositorio
public interface LibroRepository extends JpaRepository<Libro,Integer> {
// extiende de JPA ya que debe decir cual es la entidad y el tipo de su primarykey
}
