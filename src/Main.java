import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        float  saldo = 2000;
        int opcion = 0;
        float ingreso, retiro;
        while (opcion!= 3) {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                bienbenidos a su cajero automatico bancolombia
                1 porfavor ingresar su dinero desiado a la cuenta
                2 porfacor retire el dinero de su cuentan
                 3 salida"""));
            switch (opcion) {
                case 1:
                    ingreso = Float.parseFloat(JOptionPane.showInputDialog("digite la cantidad que desea ingresar \n"));
                    saldo = (saldo + ingreso);
                    JOptionPane.showMessageDialog(null, "dinero en cuenta: " + saldo);
                    break;
                case 2:
                    retiro = Float.parseFloat(JOptionPane.showInputDialog("digite la cantidad que desea retirar"));

                    if (retiro > saldo) {
                        JOptionPane.showMessageDialog(null, "no cuenta con dinero suficiente para retirar");
                    } else {
                        retiro= (saldo - retiro);
                        JOptionPane.showMessageDialog(null, "dinero en cuenta:" + saldo);

                    }
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "se equivoco de opcion de menu");
                    break;
            }
        }
    }
}

