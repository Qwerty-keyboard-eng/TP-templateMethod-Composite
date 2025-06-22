package template1;

public class CajaDeAhorro extends CuentaBancaria {
    public CajaDeAhorro(float saldo) {
        super(saldo);
    }

    @Override
    protected boolean puedeExtraer(float monto) {
        return this.saldo >= monto;
    }

    @Override
    protected void imprimirMensajeNoPermitido() {
        System.out.println("Caja de Ahorro: Saldo insuficiente para la extracción.");
    }
}