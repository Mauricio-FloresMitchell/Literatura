package com.catalogo.controller;

import com.catalogo.model.Libro;
import com.catalogo.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/idioma/{idioma}")
    public List<Libro> listarPorIdioma(@PathVariable String idioma) {
        return libroService.listarPorIdioma(idioma);
    }

    @GetMapping("/autores-vivos/{year}")
    public List<String> listarAutoresVivos(@PathVariable int year) {
        return libroService.listarAutoresVivos(year);
    }
}

