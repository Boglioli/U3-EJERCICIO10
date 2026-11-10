public class BilleteraVirtual {
    private String alias;
    private double saldo;
    private double limiteDiarioTransferencia;

    public BilleteraVirtual(String alias, double saldo, double limiteDiarioTransferencia) {
        this.alias = alias;
        this.saldo = saldo;
        this.limiteDiarioTransferencia = limiteDiarioTransferencia;
    }

    public boolean transferir(double monto) {
        if (monto > 0 && monto <= saldo && monto <= limiteDiarioTransferencia) {
            saldo -= monto;
            System.out.println("transferencia exitosa");
            return true;
        } else {
            System.out.println("transferencia rechazada");
            return false;
        }
    }

    public boolean cambiarLimite(String aliasTitular, double nuevoLimite) {
        if (this.alias.equals(aliasTitular) && nuevoLimite > 0) {
            limiteDiarioTransferencia = nuevoLimite;
            System.out.println("limite actualizado correctamente");
            return true;
        } else {
            System.out.println("no se pudo cambiar el limite");
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getAlias() {
        return alias;
    }
}
