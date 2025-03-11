package Tienda;

public class DescuentoFijo extends Descuento {
    
    private double descuentoFijo;

    public DescuentoFijo(double descuentoFijo){
        if (descuentoFijo < 0) {
        System.out.println("El descuento debe ser mayor que 0.");
        } 
        this.descuentoFijo = descuentoFijo;  
    }

    public void setDescuentoFijo(double descuentoFijo){
        if (descuentoFijo < 0) {
            System.out.println("El descuento debe ser mayor que 0.");
            } else {
            this.descuentoFijo = descuentoFijo;
            }
    }

    public double getDescuentoFijo(){
        return descuentoFijo;
    }

    @Override
    public double aplicarDescuento(Double precioProducto){
         return precioProducto - descuentoFijo;
    
    }
}
