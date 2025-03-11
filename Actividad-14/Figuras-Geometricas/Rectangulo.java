
public class Rectangulo extends Figura {
      
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto){
        this.alto = alto;
        this.ancho = ancho;
    }

 @Override
 public double calcularArea(){
    return alto * ancho;
 }   

}
