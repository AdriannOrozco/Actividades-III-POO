public class ReporteExcel implements GeneradorReporte {

    @Override
    public void generarReporte(String datos) {
        System.out.println("Generando reporte Excel con datos: " + datos);
    }
}
