public class CuentaDeAhorro extends CuentaBancaria {
    protected double interesAplicado;

    public CuentaDeAhorro(double saldo, double interesAplicado){
        super(saldo);
        this.interesAplicado = interesAplicado;
    }

    public void intereses(){
        saldo = (saldo + saldo) * interesAplicado/100;
    }

    public void depositar(double monto){
        super.depositar(monto);
    }

    public void retirar(double monto){
        super.retirar(monto);
    }

    @Override 
    public void mostrarInfo(){
        System.out.println("El saldo es" + saldo);
    }

}
