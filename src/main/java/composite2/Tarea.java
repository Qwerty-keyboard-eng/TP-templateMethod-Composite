package composite2;

public class Tarea implements ComponenteTarea {
    private final String nombre;

    public Tarea(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void mostrar(PrintConsola printer, String indent) {
        printer.println(indent + "- " + getNombre());
    }
}