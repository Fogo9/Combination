import java.util.Scanner;

public class combination{
    public static void main(String[] args) {

        int i, j, n, r, k, f = 1, a = 1, b = 1, c = 1;

        double C;
        

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The First Number : ");

        n = scan.nextInt();

        System.out.print("Enter The Second Number : ");

        r = scan.nextInt();


        if(n >= r){

            f = n - r;

            for(i = 1; i <= n; i++) a *= i;

            for(j = 1; j <= r; j++) b *= j;

            for(k = 1; k <= f; k++) c *= k;

        }
        C = a / (b * c);

        System.out.print("C(n,r) Combination = " + C);

    }

}
