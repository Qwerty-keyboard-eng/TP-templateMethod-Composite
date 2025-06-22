package template2;

public class Aprendiz extends Empleado {
    public Aprendiz(float sueldoPorHora, String nombre) {
        super(sueldoPorHora, nombre);
    }

    @Override
    protected float calcularExtras() {
        return 0;
    }

    @Override
    protected float calcularDescuentos() {
        return 0;
    }
}