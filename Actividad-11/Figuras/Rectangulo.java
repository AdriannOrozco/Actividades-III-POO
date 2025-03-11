public class Rectangulo extends Figura {
    private int alto;
    private int ancho;

    public Rectangulo(int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
    }
@Override
public void calcularArea(){
    int area = alto * ancho;
    System.out.println("El area del rectángulo es: " + area);
}
}
