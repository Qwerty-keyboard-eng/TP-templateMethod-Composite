package composite1;


import java.util.ArrayList;
import java.util.List;

class GrupoFiguras implements Figura {
    private List<Figura> figuras = new ArrayList<>();

    public GrupoFiguras() {
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void removerFigura(Figura figura) {
        figuras.remove(figura);
    }

    @Override
    public void dibujar(Panel panel) {
        for (Figura figura : figuras) {
            figura.dibujar(panel);
        }
    }
}