package semana3Victor.semana3;
import javax.swing.JOptionPane;
public class simple {
    public static void main(String[] args) {
        funciones fun = new funciones();
        while (true) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("Menú. \n\n"
                + "1. Agregar elemento.\n"
                + "2. Imprimir elemento de la lista.\n"
                + "3. Buscar registro\n"
                + "4. Modificar registro\n"
                + "5. Eliminar registro\n"
                + "6. Otro para salir\n\n"
            ));
            switch (menu) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del elemento:");
                    int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del elemento:"));
                    nodo nuevoNodo = new nodo();
                    nuevoNodo.nombre = nombre;
                    nuevoNodo.cedula = cedula;
                    fun.agregar(nuevoNodo);
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