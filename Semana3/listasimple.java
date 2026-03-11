package Semana3;
import javax.swing.JOptionPane;
public class listasimple {
    public static void main(String[] args) {
        funciones fun = new funciones();
        while (true) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("Escoja una opción:\n" +
                    "1- Agregar elemento a la lista\n" +
                    "2- Imprimir elementos de la lista\n" +
                    "3- Buscar elemento \n" +
                    "4- modificar elemento \n" +
                    "5- Eliminar elemento \n" +
                    "6- Salir"));

            switch (menu) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
                    int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cedula:"));

                    //estructura de datos del nodo
                    nodo aux = new nodo();
                    aux.nombre = nombre;
                    aux.cedula = cedula;
                    fun.agregar(aux);
                    JOptionPane.showMessageDialog(null, "Elemento agregado a la lista: " + nombre + " con cedula: " + cedula);
                    break;

                case 2:
                    fun.imprimir();
                    break;
                case 3:
                    int cedulaBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula a buscar:"));
                    fun.buscar(cedulaBuscar);
                    break;
                case 4:
                    int cedulaModificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula a modificar:"));
                    fun.modificar(cedulaModificar);
                    break;
                case 5:
                    int cedulaEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula a eliminar:"));
                    fun.eliminar(cedulaEliminar);
                    break;
                default:
                    break;

            }
        }
    }
}
