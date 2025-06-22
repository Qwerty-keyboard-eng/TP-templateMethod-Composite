package composite1;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demostración de Composite con Adapter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.LIGHT_GRAY);

        Circulo circulo1 = new Circulo(new Coordenada(100, 100), 50);
        Linea linea1 = new Linea(new Coordenada(50, 200), 150);

        GrupoFiguras casita = new GrupoFiguras();
        casita.agregarFigura(new Linea(new Coordenada(300, 300), 100));
        casita.agregarFigura(new Linea(new Coordenada(300, 300), 0) {
            @Override
            public void dibujar(Panel panel) {
                panel.pintarLinea(coordenada.x(), coordenada.y(), coordenada.x(), coordenada.y() - 50);
            }
        });
        casita.agregarFigura(new Linea(new Coordenada(400, 300), 0) {
            @Override
            public void dibujar(Panel panel) {
                panel.pintarLinea(coordenada.x(), coordenada.y(), coordenada.x(), coordenada.y() - 50);
            }
        });
        casita.agregarFigura(new Linea(new Coordenada(300, 250), 100));
        casita.agregarFigura(new Texto(new Coordenada(330, 280), "Mi Casa"));

        canvas.agregarFigura(circulo1);
        canvas.agregarFigura(linea1);
        canvas.agregarFigura(casita);

        frame.add(canvas);
        frame.setVisible(true);
    }
}