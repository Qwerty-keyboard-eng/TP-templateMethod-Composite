package template2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SueldosTest {

    @Test
    public void test01SueldoAprendizEsSoloSueldoBase() {
        Aprendiz eAprendiz = new Aprendiz(50f, "aprendiz");
        assertEquals(500f, eAprendiz.calcularSueldo(10), 0.001);
    }

    @Test
    public void test02SueldoTemporalIncluyeSalarioFamiliar() {
        Temporal eTemporal = new Temporal(80f, "temporal", 2);
        assertEquals(1800f, eTemporal.calcularSueldo(10), 0.001);
    }

    @Test
    public void test03SueldoPermanenteIncluyeSalarioFamiliarYAntiguedadYDescuentos() {
        Permanente ePermanente = new Permanente(100f, "permanente", 3, 2);
        assertEquals(4300f, ePermanente.calcularSueldo(10), 0.001);
    }

    @Test
    public void test04SueldoPermanenteSinHijosNiAntiguedadSoloBaseMenosDescuentos() {
        Permanente ePermanente = new Permanente(100f, "Ana", 0, 0);
        assertEquals(900f, ePermanente.calcularSueldo(10), 0.001);
    }
}