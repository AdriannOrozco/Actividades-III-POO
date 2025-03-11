public class Transaccion implements Transferir {
    
    @Override
    public void transferir(double monto, String cuentaDestino){
    System.out.println("Se ha transferido " + monto + " a la cuenta N°: " + cuentaDestino);
    }
}
