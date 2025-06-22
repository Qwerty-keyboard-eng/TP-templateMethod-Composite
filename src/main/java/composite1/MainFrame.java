package composite1;


import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dibujo Simple con Composite");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.WHITE);

        GrupoFiguras casita = new GrupoFiguras();
        casita.agregarFigura(new Linea(new Coordenada(100, 200), 100));
        casita.agregarFigura(new Linea(new Coordenada(100, 200), 0) {
            @Override
            public void dibujar(Graphics2D g2d) {
                g2d.drawLine(coordenada.x(), coordenada.y(), coordenada.x(), coordenada.y() - 50);
            }
        });
        casita.agregarFigura(new Linea(new Coordenada(200, 200), 0) {
            @Override
            public void dibujar(Graphics2D g2d) {
                g2d.drawLine(coordenada.x(), coordenada.y(), coordenada.x(), coordenada.y() - 50);
            }
        });
        casita.agregarFigura(new Linea(new Coordenada(100, 150), 100));
        casita.agregarFigura(new Texto(new Coordenada(130, 180), "Hogar"));

        canvas.agregarFigura(casita);

        frame.add(canvas);
        frame.setVisible(true);
    }
}