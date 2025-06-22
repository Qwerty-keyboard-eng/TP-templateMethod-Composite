package composite2;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private List<ComponenteTarea> tareas = new ArrayList<>();
    private PrintConsola printer;

    public Proyecto(PrintConsola printer) {
        this.printer = printer;
    }

    public void agregar(ComponenteTarea tarea) {
        tareas.add(tarea);
    }

    public void mostrar() {
        for (ComponenteTarea tarea : tareas) {
            tarea.mostrar(printer, "");
        }
    }
}