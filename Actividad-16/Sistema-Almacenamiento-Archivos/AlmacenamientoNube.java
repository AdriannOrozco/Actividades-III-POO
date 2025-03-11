import java.util.*;

public class AlmacenamientoNube implements Almacenamiento {
    private final Map<String, String> almacenamiento = new HashMap<>();

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        almacenamiento.put(nombre, contenido);
        System.out.println("El archivo fue chivo guardado en la nube: " + nombre);
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return almacenamiento.getOrDefault(nombre, "EL archivo no fue encontrado en la nube");
    }
}