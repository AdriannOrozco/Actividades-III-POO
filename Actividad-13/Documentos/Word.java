package Documentos;
public class Word extends Documento {

    @Override
    public void exportar(String informe) {
        System.out.println("Informe en WORD: " + informe);
    }
}
