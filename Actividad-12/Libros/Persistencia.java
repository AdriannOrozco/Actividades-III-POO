package Libros;

//Manejo de la persistencia
public class Persistencia {
    
    public void persistenciaLibro(Libro libro, String persistencia){
        System.out.println("La persistencia del libro " + libro.getNombre() + " es " + persistencia);
    }
}
