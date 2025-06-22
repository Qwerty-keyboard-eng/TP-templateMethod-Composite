package composite1;

public class Texto implements Figura {
    public final Coordenada coordenada;
    private String texto;

    public Texto(Coordenada coordenada, String texto) {
        this.texto = texto;
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar(Panel panel) {
        panel.pintarTexto(texto, coordenada.x(), coordenada.y());
    }
}