package semana5;
public class fibonacci {

    public static void main(String[] args) {
        fibonacci fib = new fibonacci();
        System.out.println(fib.fibonaccin(8));
    }

    public int fibonaccin(int n){
        if (n < 0){
            return 0;
        }else{
            if (n == 1 || n == 0){
                return n;
            }
            else{
                return fibonaccin(n-1) + fibonaccin(n-2);
            }
        }
    }
}