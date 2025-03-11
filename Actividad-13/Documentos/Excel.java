package Documentos;
public class Excel extends Documento {
    
    @Override
    public void exportar(String informe){
        System.out.println("Informe en excel: " + informe);
    }
}
