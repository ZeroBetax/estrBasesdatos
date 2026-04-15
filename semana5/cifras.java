package semana5;

public class cifras {
    public static void main(String[] args) {
        cifras c = new cifras();
        System.out.println("El resultado es: " + c.ncif(84585));
    }

    public int ncif(int n){
        if (n < 10){
            return 1;
        }
        else{
            return 1 + ncif(n/10);
        }
    }
}
