package semana1;
public class pila_din {
    String arreglo[];
    int tope;

    public pila_din() {
        arreglo = new String[2];
        tope = 0;
    }

    public void agregar(String dato){
        if(tope < arreglo.length){
            arreglo[tope] = dato;
            tope++;
            }
            else {
                String arreglotemp[] = new String[arreglo.length + 2];
                for (int i = 0; i < arreglo.length; i++) {
                    arreglotemp[i] = arreglo[i];
                }
                arreglo = arreglotemp;
                arreglo[tope] = dato;
                tope++;
            }
    }
    public boolean vacia(){
        if(tope == 0){
            return true;
        } else {
            return false;
    }
    }
    public String imprimir(){
        if (tope > 0){
            return arreglo[tope - 1];
        } else {
            return null;
        }
    }

    public String eliminar(){
        String temp=null;
        if (tope > 0){
            temp = arreglo[tope - 1];
            arreglo[tope - 1] = null;
            tope--;
        }
        return temp;
    }


}
