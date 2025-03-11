package SistemaMensajes;

public class SMS extends Mensaje {
   
@Override
public void enviarMensaje(String mensaje, String destinatario){
    System.out.println("SMS enviado a " + destinatario);
    System.out.println(" ‘ " + mensaje + " ‘ ");
}
}
