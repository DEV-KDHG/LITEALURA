package com.Karol_dev.LiterAlura.repository;

import com.Karol_dev.LiterAlura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    List<Autor> findAll();

    @Query("select a from Autor a WHERE :ano BETWEEN a.nacimento AND a.fallecimento")
    List<Autor> verificaAutoVivoData(int ano);

    Optional<Autor> findByNombre(String nombre);
}
