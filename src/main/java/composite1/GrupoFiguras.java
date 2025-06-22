package composite1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class GrupoFiguras implements Figura {
    private List<Figura> figuras;

    public GrupoFiguras() {
        this.figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void removerFigura(Figura figura) {
        figuras.remove(figura);
    }

    @Override
    public void dibujar(Graphics2D g2d) {
        for (Figura figura : figuras) {
            figura.dibujar(g2d);
        }
    }
}