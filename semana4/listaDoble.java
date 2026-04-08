package semana4;

import javax.swing.JOptionPane;

public class listaDoble {
    
    public static void main(String[] args) {
        
        funciones fun = new funciones();

        while (true) {
            int miMenu = Integer.parseInt(JOptionPane.showInputDialog("Menu. /n /n")
            +"1. Agregar un elemento /n"
            +"2. Imprimir los Elementos de la lista de Inicio Fin /n"
            +"3. Imprimir los Elementos de la lista de Fin a Inicio /n"
            +"4. Buscar un Elemento de Inicio a Fin /n"
            +"5. Buscar un Elemento de Fin a Inicio /n"
            +"6. Agregar Inicio /n"
            +"7. Agregar Despues de un Elemento /n"
            +"8. Modificar Registro /n"
            +"9. Eliminar Registro /n"
            +"Otra tecla para salir /n");
        
        switch (miMenu) {
            case 1:
                
                String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
                int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cedula:"));

                nodo aux = new nodo();
                aux.nombre = nombre;
                aux.cedula = cedula;
                fun.agregar(aux);
                //Estructura de datos del nodo
                break;

            case 2:
                fun.imprimiriniciofin();
                break;

            case 3:
                fun.imprimirfininicio();
                break;
            
            case 4:
                int cedulaBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula a buscar:"));
                fun.buscariniciofin(cedulaBuscar);
                break;
            
            case 5:
                int cedulaBuscar2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula a buscar:"));
                fun.buscarfinicio(cedulaBuscar2);
                break;

            case 6:
                String nombre2 = JOptionPane.showInputDialog("Ingrese su nombre:");
                int cedula2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cedula:"));

                nodo aux2 = new nodo();
                aux2.nombre = nombre2;
                aux2.cedula = cedula2;
                fun.agregarinicio(aux2);
                break;

            case 7:
                String nombre3 = JOptionPane.showInputDialog("Ingrese su nombre:");
                int cedula3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cedula:"));
                int cedulaReferencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del elemento después del cual desea agregar:"));

                nodo aux3 = new nodo();
                aux3.nombre = nombre3;
                aux3.cedula = cedula3;
                fun.agregardespues(aux3, cedulaReferencia);

                break;

            case 8:
                int cedulaModificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del registro a modificar:"));
                int cedulanueva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cedula:"));
                String nombrenuevo = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                fun.modificarregistro(cedulaModificar, cedulanueva, nombrenuevo);
                break;
            
            case 9:
                int cedulaEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del registro a eliminar:"));
                fun.eliminarregistro(cedulaEliminar);

        }
            
        }

    }
}
