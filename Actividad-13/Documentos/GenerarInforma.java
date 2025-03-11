package Documentos;

public class GenerarInforma {
    
    public void generarInforme(Documento documento, String informe){
        documento.exportar(informe);
    }
}
