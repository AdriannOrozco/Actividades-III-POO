public class AutenticacionLocal implements ServicioAutenticacion {
    
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        return "usuario123".equals(usuario) && "password123".equals(contraseña);
    }
}