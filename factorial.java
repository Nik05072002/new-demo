import java.util.*;
public class factorial{

    public static void main(String args[]){
        long n = 10;
        System.out.println(factorialofgivennumber(n));
    }



    public static long factorialofgivennumber(long n) {
	if (n == 1)
		return 1;
	else
		return (n * factorialofgivennumber(n - 1));
}

}

