public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        return "oauthUser".equals(usuario) && "oauthPass".equals(contraseña);
    }
}