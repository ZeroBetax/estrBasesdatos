package semana4;

import javax.swing.JOptionPane;

public class funciones {
    
    private static nodo inicio=null, fin = null;

    public void agregar(nodo elemento){
        nodo aux = new nodo();
        aux = elemento;
        if(inicio == null){
            inicio = aux;
            inicio.siguiente = null;
            inicio.anterior = null;
            //fin es igual a inicio porque solo hay un elemento en la lista
            fin = inicio;

            JOptionPane.showMessageDialog(null, "Elemento agregado a la lista: " + aux.nombre + " con cedula: " + aux.cedula);
        }
        else{
            fin.siguiente = aux; //el siguiente del fin actual es el nuevo nodo
            aux.anterior = fin;
            aux.siguiente = null; 
            //actualizar el fin de la lista
            fin = aux;

            JOptionPane.showMessageDialog(null, "Elemento agregado a la lista: " + aux.nombre + " con cedula: " + aux.cedula);
        }
    }

    public void imprimiriniciofin(){
        
        nodo aux = inicio;
        //mostrar mensaje de inicio
        javax.swing.JOptionPane.showMessageDialog(null, "------INICIO-----");

        while (aux != null){
            JOptionPane.showMessageDialog(null, "Nombre: " + aux.nombre + "\n Cedula: " + aux.cedula);
            //avanzar al siguiente nodo
            aux = aux.siguiente;
        }
        JOptionPane.showMessageDialog(null, "------FIN-----");
    }

    public void imprimirfininicio(){
        nodo aux = fin;

        javax.swing.JOptionPane.showMessageDialog(null, "------INICIO-----");

        while (aux != null){
            JOptionPane.showMessageDialog(null, "Nombre: " + aux.nombre + "\n Cedula: " + aux.cedula);
            //avanzar al siguiente nodo
            aux = aux.anterior;
        }
        JOptionPane.showMessageDialog(null, "------FIN-----");
    }

    public void buscariniciofin(int cedula){
        nodo aux = inicio;

        //recorrer la lista hasta encontrar el elemento o llegar al final
        while (aux != null){
            //comparar la cedula del nodo actual con la cedula buscada
            if (aux.cedula == cedula){
                JOptionPane.showMessageDialog(null, "Nombre: " + aux.nombre + "\n Cedula: " + aux.cedula);
                return;
            }
            aux = aux.siguiente;
        }
        JOptionPane.showMessageDialog(null, "Elemento no encontrado");
    }
    public void buscarfinicio(int cedula){
        nodo aux = fin;

        //recorrer la lista hasta encontrar el elemento o llegar al final
        while (aux != null){
            //comparar la cedula del nodo actual con la cedula buscada
            if (aux.cedula == cedula){
                JOptionPane.showMessageDialog(null, "Nombre: " + aux.nombre + "\n Cedula: " + aux.cedula);
                return;
            }
            aux = aux.anterior;
        }
        JOptionPane.showMessageDialog(null, "Elemento no encontrado");
    }

}
