import java.util.*;

public class AlmacenamientoLocal implements Almacenamiento {
    private final Map<String, String> almacenamiento = new HashMap<>();

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        almacenamiento.put(nombre, contenido);
        System.out.println("El archivo fue guardado localmente: " + nombre);
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return almacenamiento.getOrDefault(nombre, "El archivo no fue no encontrado");
    }
}
