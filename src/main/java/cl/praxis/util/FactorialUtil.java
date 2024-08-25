package cl.praxis.util;

public class FactorialUtil {
	public static int calculaFactorial(int n) {
	    int factorial = 1;
	    int i = 1;
	    while (i <= n) {
	        factorial *= i;
	        i++;
	    }
	    return factorial;
	}
}
