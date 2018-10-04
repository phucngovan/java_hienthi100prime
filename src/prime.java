import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 2; i < 100; i++) {
          if(isPrimeNumber(i)) {
              System.out.println(i);

          }

        }
    }

    public static boolean isPrimeNumber(int n) {
        if(n<2){
            return false;
        }
        int squareRoot= (int) Math.sqrt(n);
        for (int i=2;i<=squareRoot;i++) {
            if(n%i==0) {
                return false;
            }
        }return true;

    }
}