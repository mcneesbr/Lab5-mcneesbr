import java.util.ArrayList;


public class Primes {

	public static ArrayList<Integer> Factorization(int n) {
		int num = n;
		ArrayList<Integer> factList = new ArrayList<Integer>();
		if (n == 1) {
			return factList;
		}
		if (IsPrime(n)) {
			factList.add(n);
			return factList;
		}
		for (int i = 1; i<(n/2); i++) {
			if (IsPrime(i)) {
				if (num % i == 0) {
					factList.add(i);
					num = num/i;
				}
			}
		}
		return factList;
	}
	
	public static boolean IsPrime(int n) {
		if (n < 2) {
			return false;
		}
		
		for (int i = 2; (i * i) <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}