public class SistemaReportes {
    public static void main(String[] args) {
        GeneradorReporte reportePDF = new ReportePDF();
        GeneradorReporte reporteExcel = new ReporteExcel();
        
        GestorReportes gestorPDF = new GestorReportes(reportePDF);
        GestorReportes gestorExcel = new GestorReportes(reporteExcel);
        
        gestorPDF.generar("Datos para prueba");
        gestorExcel.generar("Datos de ventas");
    }
}