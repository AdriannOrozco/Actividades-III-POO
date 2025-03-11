package Productos;
import java.util.*;

//Generar etiqueta
public class Etiquetas {
    
    public void generarEtiqueta(Producto producto, Random etiqueta){
        System.out.println("La etiqueta del producto es " + producto.getNombre() + " es: " + etiqueta);
    }
}
