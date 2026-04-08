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
    public void agregarinicio(nodo elemento){
        nodo aux = new nodo();
        aux = elemento;

        if (inicio == null){
            inicio = aux;
            inicio.siguiente = null;
            inicio.anterior = null;
            fin = inicio;

            JOptionPane.showMessageDialog(null, "Elemento agregado a la lista: " + aux.nombre + " con cedula: " + aux.cedula);
        }
        else{
            aux.siguiente = inicio; //el siguiente del nuevo nodo es el inicio actual
            inicio.anterior = aux; //el anterior del inicio actual es el nuevo nodo
            aux.anterior = null; //el anterior del nuevo nodo es null
            //actualizar el inicio de la lista
            inicio = aux;

            JOptionPane.showMessageDialog(null, "Elemento agregado a la lista: " + aux.nombre + " con cedula: " + aux.cedula);
        }
    }
    public void modificarregistro(int cedulamodificar, int cedulanueva, String nombre){
        nodo aux = inicio;

        //recorrer la lista hasta encontrar el elemento o llegar al final
        while (aux != null){
            //comparar la cedula del nodo actual con la cedula buscada
            if (aux.cedula == cedulamodificar){
                aux.cedula = cedulanueva;
                aux.nombre = nombre;
                JOptionPane.showMessageDialog(null, "Registro modificado: " + aux.nombre + " con cedula: " + aux.cedula);
                return;
            }
            aux = aux.siguiente;
        }
        JOptionPane.showMessageDialog(null, "Elemento no encontrado");
    }   

    public void agregardespues(nodo elemento, int cedulareferencia){
        if(inicio == null){
            nodo auxag = new nodo();
            inicio = auxag;
            inicio.siguiente = null;
            inicio.anterior = null;
            fin = inicio;
            JOptionPane.showMessageDialog(null, "Elemento agregado a la lista: " + auxag.nombre + " con cedula: " + auxag.cedula);
        }
        else{
            nodo aux = inicio;
            //recorrer la lista hasta encontrar el elemento o llegar al final
            while (aux != null){
                //comparar la cedula del nodo actual con la cedula buscada
                if (aux.cedula == cedulareferencia){
                    if(aux.siguiente == null){
                        nodo auxag1 = new nodo();
                        auxag1 = elemento;
                        fin.siguiente = auxag1;
                        auxag1.anterior = fin;
                        auxag1.siguiente = null;
                        fin = auxag1;
                        JOptionPane.showMessageDialog(null, "Elemento agregado a la lista: " + auxag1.nombre + " con cedula: " + auxag1.cedula);
                    }else{
                        nodo aux2 = elemento;
                        nodo aux3 = aux;
                        nodo aux4 = aux.siguiente;
                        aux4.anterior = aux2;
                        aux2.anterior = aux3;
                        aux2.siguiente = aux4;
                        aux3.siguiente = aux2;
                        JOptionPane.showMessageDialog(null, "Elemento agregado a la lista: " + aux2.nombre + " con cedula: " + aux2.cedula);
                        }
                }
                aux = aux.siguiente;
            }
        }
    }
    public void eliminarregistro(int cedulaeliminar){
        nodo aux = inicio;

        //recorrer la lista hasta encontrar el elemento o llegar al final
        while (aux != null){
            //comparar la cedula del nodo actual con la cedula buscada
            if (aux.cedula == cedulaeliminar){
                //si el nodo a eliminar es el inicio
                if (aux == inicio){
                    inicio = aux.siguiente; //actualizar el inicio de la lista
                    if (inicio != null){
                        inicio.anterior = null; //el anterior del nuevo inicio es null
                    }
                }
                //si el nodo a eliminar es el fin
                else if (aux == fin){
                    fin = aux.anterior; //actualizar el fin de la lista
                    if (fin != null){
                        fin.siguiente = null; //el siguiente del nuevo fin es null
                    }
                }
                //si el nodo a eliminar está en medio
                else{
                    aux.anterior.siguiente = aux.siguiente; //el siguiente del anterior del nodo a eliminar es el siguiente del nodo a eliminar
                    aux.siguiente.anterior = aux.anterior; //el anterior del siguiente del nodo a eliminar es el anterior del nodo a eliminar
                }
                JOptionPane.showMessageDialog(null, "Registro eliminado: " + aux.nombre + " con cedula: " + aux.cedula);
                return;
            }
            aux = aux.siguiente;
        }
        JOptionPane.showMessageDialog(null, "Elemento no encontrado");
    }
}
