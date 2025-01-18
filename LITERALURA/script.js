document.addEventListener("DOMContentLoaded", () => {
    const searchInput = document.getElementById("search-input");
    const searchButton = document.getElementById("search-button");
    const resultsList = document.getElementById("results-list");
    const searchError = document.getElementById("search-error");

    const catalogList = document.getElementById("catalog-list");
    const loadCatalogButton = document.getElementById("load-catalog-button");

    // API URL
    const API_BASE_URL = "https://gutendex.com/books";

    // Search for books by title
    searchButton.addEventListener("click", async () => {
        const query = searchInput.value.trim();

        if (!query) {
            searchError.textContent = "Por favor, ingresa un título para buscar.";
            return;
        }

        searchError.textContent = ""; // Clear previous errors
        resultsList.innerHTML = ""; // Clear previous results

        try {
            const response = await fetch(`${API_BASE_URL}?search=${query}`);
            const data = await response.json();

            if (data.results.length === 0) {
                searchError.textContent = "No se encontraron libros con ese título.";
                return;
            }

            data.results.forEach(book => {
                const listItem = document.createElement("li");
                listItem.textContent = `${book.title} - ${book.authors.map(a => `${a.last_name}, ${a.first_name}`).join("; ")} (Idioma: ${book.languages.join(", ")})`;
                resultsList.appendChild(listItem);
            });
        } catch (error) {
            searchError.textContent = "Hubo un error al buscar el libro. Por favor, intenta nuevamente.";
            console.error(error);
        }
    });

    // Load catalog (placeholder functionality)
    loadCatalogButton.addEventListener("click", () => {
        catalogList.innerHTML = ""; // Clear existing catalog

        const mockCatalog = [
            { title: "Don Quijote", author: "Cervantes", language: "ES" },
            { title: "Pride and Prejudice", author: "Jane Austen", language: "EN" },
            { title: "Romeo and Juliet", author: "William Shakespeare", language: "EN" }
        ];

        mockCatalog.forEach(book => {
            const listItem = document.createElement("li");
            listItem.textContent = `${book.title} - ${book.author} (Idioma: ${book.language})`;
            catalogList.appendChild(listItem);
        });
    });
});
