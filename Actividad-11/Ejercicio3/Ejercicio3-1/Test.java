import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        limpiarPantalla();
        Vehiculos cicla = new Bicicleta();

        //Aquí no generar error de compilación
        cicla.acelerar();

        //Esto genera error de compilación
        cicla.pedalear();
        //Esto se debe a que se "cicla" se está referenciando a Vehiculos
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
