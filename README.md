Literatura es una aplicación de consola y web diseñada para la gestión de un catálogo de libros. Este proyecto combina un backend robusto desarrollado en Spring Boot con un frontend minimalista en HTML, CSS y JavaScript para interactuar con la API Gutendex , que ofrece acceso a más de 70.000 libros del Proyecto Gutenberg.

El sistema permite registrar, consultar y gestionar información sobre libros y autores, almacenando los datos en una base de datos PostgreSQL . Además, puede ser desplegado en plataformas como Heroku o Railway , haciendo el proyecto accesible en la web.

Funciones principales
Buscar libros por título

La aplicación se conecta a la API de Gutendex para buscar libros por su título.
Registre la información del libro (título, autor, idioma y número de descargas) en la base de datos PostgreSQL.
Maneja errores si no se encuentra el libro o si ya está registrado.
Listar libros registrados

Permite visualizar los libros guardados en la base de datos con su título, autor, idioma y descargas.
Listado de autores registrados

Genera una lista única de autores cuyos libros están almacenados en el sistema.
Listar autores vivos en un año determinado

Busca autores que estuvieron vivos en un año específico.
Listar libros por idioma

Filtra los libros almacenados por su idioma (por ejemplo, EN, ES, FR, PT).
Tecnologías utilizadas
Parte posterior:

Bota de primavera
Java 17+
PostgreSQL (Base de datos)
API RESTful
Interfaz:

HTML5
CSS3 (Diseño minimalista en colores ónix y naranja)
JavaScript (Conexión al backend)
Otros:

GitHub (Control de versiones y repositorio remoto)
PGAdmin (Gestión de la base de datos PostgreSQL)
Heroku o Railway (Despliegue en la nube)
Estructura del proyecto
Parte posterior:

Controladores
LibroController.java : Define los endpoints para agregar, listar y buscar libros o autores.

Servicios
LibroService.java : Contiene la lógica de negocio para interactuar con la base de datos y la API de Gutendex.

Repositorios:
LibroRepository.java : Definir las consultas personalizadas a la base de datos.

Modelo:
Libro.java : Representa la entidad Librocon sus atributos (título, autor, idioma, descargas, etc.).

Interfaz:

index.html: Página principal con el diseño minimalista.
styles.css: Archivo de estilos para la interfaz.
app.js: Contiene las funcionalidades y conexiones al backend.
Características adicionales
Prevención de duplicados: No permite registrar dos veces el mismo libro en la base de datos.
Manejo de errores: Muestra mensajes claros si un libro no se encuentra en la API o si ocurre un problema con la conexión al backend.
Soporte multilingüe: Filtra libros según idioma.
Código modular y extensible: Diseñado para agregar más funcionalidades en el futuro.
