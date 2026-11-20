public class CuentaConComision extends Cuenta {
    private static final double COMISION = 5.0;
    public CuentaConComision(double saldo) {
        super(saldo);
    }

    
    @Override
    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto <= 0) { throw new IllegalArgumentException(
                "El monto debe ser positivo"
            );
        }

        double total = monto + COMISION;


        // se valida y descuenta el monto y comision juntos
        super.retirar(total);
    }
}