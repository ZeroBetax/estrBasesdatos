package semana5;
public class suma {
    
    public static void main(String[] args) {
        suma s = new suma();
        
        System.out.println("El resultado es: " + s.sum(5));
    }
    public int sum(int n){
        if (n == 1){
            return 1;
        }
        else{
            return n + sum(n-1);
        }
    }
}
