package Usuario;

//Manejo de validación para la cuenta
public class Validar {
    public boolean validacionDatos(Usuarios usuario, Usuarios contraseña){
        return usuario.getUsuario().length() > 5 && contraseña.getContraseña().length() > 8 &&
        usuario.getUsuario().contains("@");
    }
}
