package Productos;

//Manejo del precio
public class Precio {

    public void calcularPrecio(Producto producto){
        System.out.println("El precio total es :" + (producto.getTotal() * 0.19) + producto.getTotal());
    }
}
