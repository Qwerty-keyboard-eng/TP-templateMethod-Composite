package template1;

public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(float saldo) {
        super(saldo);
    }

    @Override
    protected boolean puedeExtraer(float monto) {
        return true;
    }

    @Override
    protected void despuesDeExtraer(float montoRetirado) {
        if (this.saldo < 0) {
            System.out.println("Cuenta Corriente: Se ha incurrido en un sobregiro de: " + Math.abs(this.saldo));
        }
    }
}