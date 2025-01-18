package com.catalogo.libros.service;

import com.catalogo.libros.model.Libro;
import com.catalogo.libros.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> listarPorIdioma(String idioma) {
        return libroRepository.findAll().stream()
                .filter(libro -> libro.getIdioma().equalsIgnoreCase(idioma))
                .collect(Collectors.toList());
    }

    public List<String> listarAutoresVivos(int year) {
        // Esto supone que los datos de nacimiento/muerte están disponibles. Simulación básica.
        // Debes adaptar según tus datos reales.
        return libroRepository.findAll().stream()
                .filter(libro -> libro.getAutor().equalsIgnoreCase("Shakespeare") && year >= 1564 && year <= 1616)
                .map(Libro::getAutor)
                .distinct()
                .collect(Collectors.toList());
    }
}
