package Tienda;

public class DescuentoPorcentaje extends Descuento  {
    
    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje){
        if (porcentaje < 0) {
            System.out.println("El porcentaje no puede ser negativo.");
        }
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(Double precioProducto){
    return precioProducto + (porcentaje/100);
}
   
}