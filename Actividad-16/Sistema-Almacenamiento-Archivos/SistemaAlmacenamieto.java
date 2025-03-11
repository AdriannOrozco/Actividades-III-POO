public class SistemaAlmacenamieto {
    public static void main(String[] args) {
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        
        GestorArchivos gestorLocal = new GestorArchivos(almacenamientoLocal);
        GestorArchivos gestorNube = new GestorArchivos(almacenamientoNube);
        
        gestorLocal.guardar("informe.pdf", "Contenido local");
        gestorNube.guardar("documento.doc", "Contenido en la nube");
        
        System.out.println("Recuperado localmente: " + gestorLocal.recuperar("informe.pdf"));
        System.out.println("Recuperado en la nube: " + gestorNube.recuperar("documento.doc"));
    }
}
