import java.util.ArrayList;


public class Primes {

	public static ArrayList<Integer> Factorization(int n) {
		ArrayList<Integer> factList = new ArrayList<Integer>();
		if (IsPrime(n)) {
			factList.add(n);
			return factList;
		}
		for (int i = 2; i<=(n/2); i++) {
			if (IsPrime(i)) {
				if (n % i == 0) {
					factList.add(i);
					n = n/i;
					i = 1;
					if (IsPrime(n)) {
						factList.add(n);
						break;
					}
				}
			}
		}
		return factList;
	}
	
	public static ArrayList<Integer> Generation(int n) {
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		for (int i = 2; i < n; i++) {
			if (IsPrime(i)) {
				primeList.add(i);
			}
		}
		return primeList;
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
