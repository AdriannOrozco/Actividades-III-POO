public class ReportePDF implements GeneradorReporte {
    
    @Override
    public void generarReporte(String datos) {
        System.out.println("Generando reporte PDF con datos: " + datos);
    }
}
