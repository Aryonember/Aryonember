import java.util.Scanner;

public class Homework4 {
    static int gcd(int m, int n) {
        if (m == n)
            return m;
        else if (m > n)
            return gcd(m - n, n);
        else
            return gcd(m, n - m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 수 입력 : ");
        int m;
        int n;
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.printf("두 수의 최대공약수 : %d", gcd(m, n));
    }
}