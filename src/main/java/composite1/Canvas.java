package composite1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class Canvas extends JPanel {
    private List<Figura> figuras = new ArrayList<>();

    public Canvas() {
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        Panel panelAdapter = new Graphics2DAdapter(g2d);

        for (Figura figura : figuras) {
            figura.dibujar(panelAdapter);
        }
    }
}