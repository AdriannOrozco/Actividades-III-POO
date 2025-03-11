package Usuario;

//Manejo de la autenticación
public class Autenticar {
    
    public boolean autenticarCuenta(Usuarios usuario, Usuarios constraseña){
        return usuario.getUsuario().equals("Unique") && constraseña.getContraseña().equals("0987654321");
    }
}
