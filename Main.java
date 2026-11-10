public class Main {
    public static void main(String[] args) {
        BilleteraVirtual billetera = new BilleteraVirtual("martinB.mp", 150000, 30000);
        billetera.transferir(10000);
        billetera.transferir(30000);
        billetera.transferir(210000);
        billetera.transferir(-30000);
        billetera.cambiarLimite("otro alias", 50000);
        billetera.cambiarLimite("martinB.mp", 50000);
        billetera.transferir(40000);
        System.out.println("alias: " + billetera.getAlias());
        System.out.println("saldo final: $ " + billetera.getSaldo());

    }
}