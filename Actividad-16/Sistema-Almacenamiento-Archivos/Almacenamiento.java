public interface Almacenamiento {
    
    void guardarArchivo(String nombre, String contenido);
    String recuperarArchivo(String nombre);
}
