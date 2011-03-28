import org.junit.*;
import static org.junit.Assert.*;



public class Lab5Test {
	
	@Test
	public void test1() {
		assertTrue(Primes.Factorization(1).isEmpty());
	}
	
	@Test
	public void test2() {
		assertTrue(Primes.Factorization(2).get(0) == 2);
	}
	
	@Test
	public void test3() {
		assertTrue(Primes.Factorization(3).get(0) == 3);
	}
}