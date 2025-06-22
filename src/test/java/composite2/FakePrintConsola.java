package composite2;

public class FakePrintConsola implements PrintConsola {
    private StringBuilder buffer = new StringBuilder();

    @Override
    public void println(String mensaje) {
        buffer.append(mensaje).append("\n");
    }

    public String salida() {
        return buffer.toString();
    }
}