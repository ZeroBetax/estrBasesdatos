package semana1;
import javax.swing.JOptionPane;

public class pila_estatica {

    public static void main(String[] args) {

        int tamano = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la pila:"));
        pila pila = new pila(tamano);
        while (true) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("Escoja una opción:\n" +
                    "1- Agregar dato a la pila\n" +
                    "2- Verificar si la pila está vacía\n" +
                    "3- Imprimir pila\n" +
                    "4- Eliminar dato de la pila\n" +
                    "5- Salir"));

            switch (menu) {
                case 1:
                    String dato = JOptionPane.showInputDialog("Digite el dato a agregar:");
                    pila.agregar(dato);
                    JOptionPane.showMessageDialog(null, "Dato agregado a la pila: " + dato);
                    break;
                case 2:
                    boolean vacia = pila.vaciar();
                    JOptionPane.showMessageDialog(null, "La pila está  vacía: " + vacia);
                    break;
                case 3:
                    String datoImprimir = pila.imprimir();
                    if (datoImprimir != null) {
                        JOptionPane.showMessageDialog(null, "Dato en la cima de la pila: " + datoImprimir);
                    } else {
                        JOptionPane.showMessageDialog(null, "La pila está vacía.");
                    }
                    break;
                case 4:
                    String datoEliminado = pila.eliminar();
                    if (datoEliminado != null) {
                        JOptionPane.showMessageDialog(null, "Dato eliminado de la pila: " + datoEliminado);
                    } else {
                        JOptionPane.showMessageDialog(null, "La pila está vacía. No hay datos para eliminar.");
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    System.exit(0);
                    break;
            }
        }            
        }
    }



