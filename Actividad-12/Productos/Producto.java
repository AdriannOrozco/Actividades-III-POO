package Productos;

//Datos del producto
public class Producto {

    private String nombre;
    private double total;

    public Producto(String nombre, double total){
        this.nombre = nombre;
        this.total = total;
    }

    public void setNombe(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setTotal(double total){
        this.total = total;
    }

    public Double getTotal(){
        return total;
    }

}
