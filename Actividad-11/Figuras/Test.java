import java.io.IOException;

public class Test {
    public static void main(String[] args) {
    limpiarPantalla();
    Figura figura1 = new Circulo(4.5);
    Figura figura2 = new Rectangulo(2, 4);
    
    //Mostramos las áreas
    figura1.calcularArea();
    figura2.calcularArea();
    System.out.println("");

    }

      public static void limpiarPantalla() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
