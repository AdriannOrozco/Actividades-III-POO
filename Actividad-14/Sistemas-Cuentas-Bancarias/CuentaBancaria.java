public class CuentaBancaria {
    
    protected double saldo;

    public CuentaBancaria(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double monto){
        if (monto <= 0) {
        System.out.println("El monto no puede ser negativo o igual a 0."); 
        }
        saldo += monto;
    }

    public void retirar(double monto){
        if (monto <= 0) {
         System.out.println("El monto no puede ser negativo o igual a 0."); 
        }
        saldo -= monto;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarInfo(){
        System.out.println("La cuenta bancaria tiene " + saldo);
    }

    
}
