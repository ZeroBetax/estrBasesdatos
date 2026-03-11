package semana1;
public class pila {

    String arreglo[];
    int maxtamano;
    int tope;

    public pila(int n) {
        maxtamano = n;
        arreglo = new String[maxtamano];
        tope = 0;
    }
    public void agregar(String dato){
        if(tope < maxtamano){
            arreglo[tope] = dato;
            tope++;
            }
    }
    public boolean vaciar(){
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