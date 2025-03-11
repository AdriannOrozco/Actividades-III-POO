public class TestAutenticacion {
    public static void main(String[] args) {
        ServicioAutenticacion localAuth = new AutenticacionLocal();
        ServicioAutenticacion oauthAuth = new AutenticacionOAuth();
        
        GestorAutenticacion gestor1 = new GestorAutenticacion(localAuth);
        GestorAutenticacion gestor2 = new GestorAutenticacion(oauthAuth);
        
        System.out.println("Autenticación Local: " + gestor1.iniciarSesion("usUario123", "password123")); 
        System.out.println("Autenticación OAuth: " + gestor2.iniciarSesion("Adrin12", "oauthPass"));
    }
}
