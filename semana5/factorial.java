package semana5;
public class factorial {

    public static void main(String[] args) {
        factorial fac = new factorial();
        System.out.println("El resultado es: " + fac.fact(5));
    }

    public int fact(int n){
        if (n < 0){
            return 0;
        }else{
            if (n == 1){
                return 1;
            }
            else{
                return n * fact(n-1);
            }
        }
    }
}
