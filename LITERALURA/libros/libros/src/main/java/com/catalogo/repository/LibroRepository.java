package com.catalogo.repository;

import com.catalogo.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> findByIdioma(String idioma);

    List<Libro> findByAutor(String autor);

    boolean existsByTitulo(String titulo);
}
