public class Circulo extends Figura {
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del circulo es: " + area);
    }
}