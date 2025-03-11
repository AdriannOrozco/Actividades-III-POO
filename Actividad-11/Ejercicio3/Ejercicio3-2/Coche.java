public class Coche extends Vehiculo{
    
@Override
public void acelerar(){
    super.acelerar();
}

/* Justificación:
La clase derivada "Coche" sobrescribe el método "arrancar", pero en realidad solo llama a la implementación de la clase base usando "super.arrancar()" 
Pero esto es inncesario porque no se hace ninguna sobreescritura

Esto es una mala práctica porque: añade código redundante que no aporta valor.
si no se necesita cambiar el comportamiento del método base, lo mejor es no sobrescribirlo o, si se planea modificarlo en el futuro, dejar un comentario claro para evitar confusiones.
*/

}
