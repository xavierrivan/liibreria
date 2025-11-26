import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {

    @Test
    void testPrestarLibro() {
        Libro libro = new Libro("1984", "Orwell");
        libro.prestar();
        assertFalse(libro.estaDisponible());
    }

    @Test
    void testPrestarLibroNoDisponible() {
        Libro libro = new Libro("1984", "Orwell");
        libro.prestar();
        assertThrows(IllegalStateException.class, libro::prestar);
    }

    import static org.junit.Assert.*;
import org.junit.Test;

public class LibroTest {

    @Test
    public void testDevolver() {
        // Crea el libro
        Libro libro = new Libro("Titulo de prueba", "Autor");

        // Aseguramos que al inicio está disponible
        assertTrue("Debe estar disponible al crear", libro.estaDisponible());

        // Prestamos
        libro.prestar();
        assertFalse("Después de prestar no debe estar disponible", libro.estaDisponible());

        // Devolvemos -> aquí debe ejecutarse devolver()
        libro.devolver();
        assertTrue("Después de devolver debe volver a estar disponible", libro.estaDisponible());
    }

    // (Opcional) test extra para el caso de devolver cuando ya está disponible
    @Test
    public void testDevolverCuandoYaDisponible() {
        Libro libro = new Libro("Titulo", "Autor");
        // Si ya está disponible y llamamos devolver, sigue disponible
        libro.devolver();
        assertTrue(libro.estaDisponible());
    }
}

}