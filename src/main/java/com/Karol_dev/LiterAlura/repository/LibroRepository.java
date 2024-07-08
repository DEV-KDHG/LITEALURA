package com.Karol_dev.LiterAlura.repository;

import com.Karol_dev.LiterAlura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro, Long> {

    List<Libro> findAll();

    List<Libro> findAllByIdiomasNombreContainingIgnoreCase(String nombre);

    List<Libro> findTop10ByOrderByDescargasDesc();

    Optional<Libro> findByNombre(String nombre);
}
