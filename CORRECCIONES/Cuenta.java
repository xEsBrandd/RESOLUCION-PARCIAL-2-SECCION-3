public class Cuenta {
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double monto)
            throws SaldoInsuficienteException {

        
        if (monto <= 0) { // hace validar el minto antes que se valide el saldo del principio
            throw new IllegalArgumentException(
                "El monto debe ser positivo"
            );
        }

        
        if (monto > saldo) { // aqui hice la verificacion de que hayan fondos  necesarios para seguir
            throw new SaldoInsuficienteException();
        } //si no hay nada que intervenga, se hace el menos mas igual, que descuenta automaticamente el monto
        saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}