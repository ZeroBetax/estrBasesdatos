package semana3Victor.semana3;
import javax.swing.JOptionPane;

public class funciones {
    private static nodo raiz;
    public void agregar(nodo elemento) {
        if (raiz == null) {
            raiz = new nodo();
            raiz = elemento;
        } else {
            nodo actual = raiz;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = elemento;
        }
    }
public void imprimir() {
    nodo actual = raiz;
    while (actual != null) {
        JOptionPane.showMessageDialog(null, "Nombre: " + actual.nombre + "\nCédula: " + actual.cedula);
        actual = actual.siguiente;
    }
}

public void buscar(int cedula) {
    nodo actual = raiz;
    while (actual != null) {
        if (actual.cedula == cedula) {
            JOptionPane.showMessageDialog(null, "Registro encontrado:\nNombre: " + actual.nombre + "\nCédula: " + actual.cedula);
            return;
        }
        actual = actual.siguiente;
    }
    JOptionPane.showMessageDialog(null, "Registro no encontrado.");
}

public void modificar(int cedula) {
    nodo actual = raiz;
    while (actual != null) {
        if (actual.cedula == cedula) {
            String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
            int nuevaCedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cédula:"));
            actual.nombre = nuevoNombre;
            actual.cedula = nuevaCedula;
            JOptionPane.showMessageDialog(null, "Registro modificado exitosamente.");
            return;
        }
        actual = actual.siguiente;
    }
    JOptionPane.showMessageDialog(null, "Registro no encontrado.");
}

public void eliminar(int cedula){
    nodo actual = raiz;
    if(actual.cedula == cedula){
        raiz = raiz.siguiente;
        JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente.");
    }else{
        while (actual != null) {
        if (actual.cedula == cedula) {
            nodo actual1 = actual.siguiente;
            actual.siguiente = actual1.siguiente;
            JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente.");
            return;
        }
            actual = actual.siguiente;
    }
    }
    JOptionPane.showMessageDialog(null, "Registro no encontrado.");
}

}