package semana1;
import javax.swing.JOptionPane;

public class calculadora {

        public static void main(String[] args) {
            while (true) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("Escoja una operación:\n"+
            "1- Suma\n"+
            "2- Resta\n"+
            "3- Multiplicación\n"+
            "4- División\n"+
            "5- Salir"));
            switch (menu) {
            case 1:
                double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer número:"));
                double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo número:"));
                double soma = num1 + num2;
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + soma);
                break;
            case 2:
                double num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer número:"));
                double num4 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo número:"));
                double subtracao = num3 - num4;
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + subtracao);
                break;
            case 3:
                double num5 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer número:"));
                double num6 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo número:"));
                double multiplicacao = num5 * num6;
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + multiplicacao);
                break;
            case 4:
                double num7 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer número:"));
                double num8 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo número:"));
                if (num8 != 0) {
                    double divisao = num7 / num8;
                    JOptionPane.showMessageDialog(null, "El resultado de la división es: " + divisao);
                } else {
                    JOptionPane.showMessageDialog(null, "La división por cero no está permitida.");
                }
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                System.exit(0);
                
                }
            }
        }
}