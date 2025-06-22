package template2;

public class Temporal extends Empleado {
    private int cantidadHijos;

    public Temporal(float sueldoPorHora, String nombre, int cantidadHijos) {
        super(sueldoPorHora, nombre);
        this.cantidadHijos = cantidadHijos;
    }

    @Override
    protected float calcularExtras() {
        return salarioFamiliar();
    }

    @Override
    protected float calcularDescuentos() {
        return 0;
    }

    private float salarioFamiliar() {
        return cantidadHijos * 500f;
    }
}