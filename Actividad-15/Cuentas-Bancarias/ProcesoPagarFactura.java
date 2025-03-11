public class ProcesoPagarFactura implements PagarFactura{ 

    @Override
    public void pagarFactura(String factura, double monto){
        System.out.println("Pago de " + monto + " de la factura " + factura);
    }
}