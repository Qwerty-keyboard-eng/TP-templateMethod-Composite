package template2;

public abstract class Empleado {
    private float sueldoPorHora;
    private String nombre;

    public Empleado(float sueldoPorHora, String nombre) {
        this.sueldoPorHora = sueldoPorHora;
        this.nombre = nombre;
    }

    public float getSueldoPorHora() {
        return sueldoPorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public final float calcularSueldo(int horasTrabajadas) {
        float sueldoBase = calcularSueldoBase(horasTrabajadas);
        float extras = calcularExtras();
        float descuentos = calcularDescuentos();
        return sueldoBase + extras - descuentos;
    }

    protected float calcularSueldoBase(int horasTrabajadas) {
        return this.sueldoPorHora * horasTrabajadas;
    }

    protected abstract float calcularExtras();

    protected abstract float calcularDescuentos();
}