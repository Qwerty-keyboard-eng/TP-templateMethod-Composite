package template1;

public abstract class CuentaBancaria {

    protected float saldo;

    public CuentaBancaria(float saldo) {
        this.saldo = saldo;
    }

    public float saldo() {
        return this.saldo;
    }

    public final void extraer(float montoARetirar) {
        if (puedeExtraer(montoARetirar)) {
            saldo -= montoARetirar;
            despuesDeExtraer(montoARetirar);
        } else {
            imprimirMensajeNoPermitido();
        }
    }

    protected abstract boolean puedeExtraer(float monto);

    protected void despuesDeExtraer(float montoRetirado) {
    }

    protected void imprimirMensajeNoPermitido() {
    }
}