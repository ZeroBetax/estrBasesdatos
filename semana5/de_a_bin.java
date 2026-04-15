package semana5;
public class de_a_bin {
    
    public static void main(String[] args) {
        de_a_bin dab = new de_a_bin();
        dab.bin(10);
    }

    public void bin(int n){
        if (n < 2){
            System.out.print(n);
        }
        else{
            bin(n/2);
            System.out.println((Integer.toString(n%2)));
        }
    }
}
