package com.catalogo.libros.client;

import com.catalogo.libros.model.Libro;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class GutendexClient {

    private final String API_URL = "https://gutendex.com/books?search=";

    public Libro buscarLibroPorTitulo(String titulo) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            var response = restTemplate.getForObject(API_URL + titulo, String.class);
            // Aquí deberías mapear el resultado al modelo Libro
            // Esto es una simulación básica
            if (response != null && !response.isEmpty()) {
                return new Libro(null, "Título simulado", "Autor simulado", "EN", 1000);
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }
}
