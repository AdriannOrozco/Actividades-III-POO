package SistemaMensajes;
public class Push extends Mensaje {

    @Override
    public void enviarMensaje(String mensaje, String destinatario) {
        System.out.println("Notificación de push enviada " + destinatario);
        System.out.println("El mensaje es -> " + mensaje);
    }

}