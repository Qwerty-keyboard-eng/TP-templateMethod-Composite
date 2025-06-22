package composite2;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja implements ComponenteTarea {
    private String nombre;
    private List<ComponenteTarea> subtareas = new ArrayList<>();

    public TareaCompleja(String nombre) {
        this.nombre = nombre;
    }

    public void agregarSubtarea(ComponenteTarea tarea) {
        subtareas.add(tarea);
    }

    public void removerSubtarea(ComponenteTarea tarea) {
        subtareas.remove(tarea);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void mostrar(PrintConsola printer, String indent) {
        printer.println(indent + "+ " + getNombre());
        for (ComponenteTarea sub : subtareas) {
            sub.mostrar(printer, indent + "  ");
        }
    }
}