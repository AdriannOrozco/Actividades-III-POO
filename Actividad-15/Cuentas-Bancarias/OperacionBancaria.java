public interface OperacionBancaria {
    void transferir(double monto, String cuentaDestino);
    void retirar(double monto);
    void pagarFactura(String factura, double monto);
}