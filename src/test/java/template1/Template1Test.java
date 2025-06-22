package template1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Template1Test {

    @Test
    public void testCajaDeAhorroExtraeCorrectamente() {
        CajaDeAhorro cAhorro = new CajaDeAhorro(1000f);
        cAhorro.extraer(30f);
        assertEquals(970f, cAhorro.saldo(), 0.001);
    }

    @Test
    public void testCajaDeAhorroNoExtraeConSaldoInsuficiente() {
        CajaDeAhorro cAhorro = new CajaDeAhorro(100f);
        cAhorro.extraer(150f);
        assertEquals(100f, cAhorro.saldo(), 0.001);
    }

    @Test
    public void testCuentaCorrienteExtraeNormalmente() {
        CuentaCorriente cc = new CuentaCorriente(1000f);
        cc.extraer(100f);
        assertEquals(900f, cc.saldo(), 0.001);
    }

    @Test
    public void testCuentaCorrientePermiteSobregiro() {
        CuentaCorriente cc = new CuentaCorriente(100f);
        cc.extraer(200f);
        assertEquals(-100f, cc.saldo(), 0.001);
    }
}