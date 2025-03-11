package Tienda;

public class CalcularDescuento {

   public double calcularDescuento(Descuento descuento, Double precioProducto){
    return descuento.aplicarDescuento(precioProducto);
   } 
}
