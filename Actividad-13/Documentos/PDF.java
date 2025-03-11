package Documentos;
public class PDF extends Documento {

@Override
public void exportar(String informe){
    System.out.println("Informe en PDF -> " + informe);
}
}
