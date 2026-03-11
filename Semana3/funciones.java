package Semana3;
import javax.swing.JOptionPane;

public class funciones {
    public static nodo raiz;
    public void agregar(nodo elemento){
        if (raiz == null){
            raiz = new nodo();
            raiz = elemento;
        }
        else {
            nodo aux = raiz;
            while (aux.sig != null){
                aux = aux.sig;
            }
            aux.sig = elemento;

        }
    }
    public void imprimir(){
        //crear un nodo auxiliar para recorrer la lista
        nodo aux = raiz;
        //recorrer la lista hasta el final
        while (aux != null){
            JOptionPane.showMessageDialog(null, "Nombre: " + aux.nombre + "\n Cedula: " + aux.cedula);
            aux = aux.sig;
        }
    }
    public void buscar(int cedula){
        nodo aux = raiz;

        //recorrer la lista hasta encontrar el elemento o llegar al final
        while (aux != null){
            //comparar la cedula del nodo actual con la cedula buscada
            if (aux.cedula == cedula){
                JOptionPane.showMessageDialog(null, "Nombre: " + aux.nombre + "\n Cedula: " + aux.cedula);
                return;
            }
            aux = aux.sig;
        }
        JOptionPane.showMessageDialog(null, "Elemento no encontrado");
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
        actual = actual.sig;
    }
    JOptionPane.showMessageDialog(null, "Registro no encontrado.");
}

public void eliminar(int cedula){
    nodo actual = raiz;
    if(actual.cedula == cedula){
        raiz = raiz.sig;
        JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente.");
    }else{
        while (actual != null) {
        if (actual.cedula == cedula) {
            nodo actual1 = actual.sig;
            actual.sig = actual1.sig;
            JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente.");
            return;
        }
            actual = actual.sig;
    }
    }
    JOptionPane.showMessageDialog(null, "Registro no encontrado.");
}
}

