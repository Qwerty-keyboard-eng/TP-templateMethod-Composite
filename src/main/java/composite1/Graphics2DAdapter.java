package composite1;

import java.awt.Graphics2D;

public class Graphics2DAdapter implements Panel {
    private Graphics2D graphics2D;

    public Graphics2DAdapter(Graphics2D graphics2D) {
        this.graphics2D = graphics2D;
    }

    @Override
    public void pintarCirculo(int x, int y, int radio) {
        graphics2D.drawOval(x - radio, y - radio, radio * 2, radio * 2);
    }

    @Override
    public void pintarLinea(int x1, int y1, int x2, int y2) {
        graphics2D.drawLine(x1, y1, x2, y2);
    }

    @Override
    public void pintarTexto(String texto, int x, int y) {
        graphics2D.drawString(texto, x, y);
    }
}