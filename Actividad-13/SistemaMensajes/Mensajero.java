package SistemaMensajes;

public class Mensajero extends Mensaje {
    
    @Override
    public void enviarMensaje(String mensaje, String destinatario){
    System.out.println("El mensajero está el mensaje a " + destinatario
    + "  y el mensaje es: " + mensaje);
    }
}
