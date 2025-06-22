package template2;

public class Permanente extends Empleado {
    private int cantidadHijos;
    private int cantidadAñosTrabajados;

    public Permanente(float sueldoPorHora,
                      String nombre,
                      int cantidadHijos,
                      int cantidadAñosTrabajados) {
        super(sueldoPorHora, nombre);
        this.cantidadHijos = cantidadHijos;
        this.cantidadAñosTrabajados = cantidadAñosTrabajados;
    }

    @Override
    protected float calcularExtras() {
        return salarioFamiliar() + antiguedad();
    }

    @Override
    protected float calcularDescuentos() {
        return descuentos();
    }

    private float salarioFamiliar() {
        return cantidadHijos * 1000f;
    }

    private float antiguedad() {
        return cantidadAñosTrabajados * 200f;
    }

    private float descuentos() {
        return getSueldoPorHora() * 10 * 0.10f; // Ejemplo simple de descuento
    }
}