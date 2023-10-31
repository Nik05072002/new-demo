import java.util.Scanner;

public class rsa {

    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = x;
            x = y;
            y = temp % y;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("RSA algorithm\n");

        System.out.print("1st prime no -> ");
        int a = scanner.nextInt();

        System.out.print("2nd prime no -> ");
        int b = scanner.nextInt();

        int n = a * b;
        System.out.println("Product of numbers (n) -> " + n);

        int k = (a - 1) * (b - 1);
        System.out.print("Value of e (co-prime to " + k + ") -> ");
        int e = scanner.nextInt();

        if (gcd(e, k) != 1) {
            System.out.println("Invalid value for e");
            return;
        }

        int d = 1;
        while ((d * e) % k != 1) {
            d++;
        }

        System.out.println("Public key -> {" + e + ", " + n + "}");
        System.out.println("Private key -> {" + d + ", " + n + "}");

        System.out.print("Enter a number to be encrypted -> ");
        int i = scanner.nextInt();

        int c = (int) (Math.pow(i, e) % n);
        System.out.println("Encrypted text -> " + c);

        int m = (int) (Math.pow(c, d) % n);
        System.out.println("Decrypted text -> " + m);
    }
}
