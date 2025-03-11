public class GestorReportes {
    private final GeneradorReporte generadorReporte;

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void generar(String datos) {
        generadorReporte.generarReporte(datos);
    }
}
