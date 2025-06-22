package template1;

public class Main {
    public static void main(String[] args) {
        var cc = new CuentaCorriente(1000f);
        System.out.println("Saldo inicial CC: " + cc.saldo());
        cc.extraer(100f);
        System.out.println("Saldo CC despues de extraer 100: " + cc.saldo());
        cc.extraer(1500f);
        System.out.println("Saldo CC despues de extraer 1500: " + cc.saldo());
        System.out.println("---");

        var cAhorro = new CajaDeAhorro(1000f);
        System.out.println("Saldo inicial CA: " + cAhorro.saldo());
        cAhorro.extraer(30f);
        System.out.println("Saldo CA despues de extraer 30: " + cAhorro.saldo());
        cAhorro.extraer(1200f);
        System.out.println("Saldo CA despues de extraer 1200: " + cAhorro.saldo());
    }
}