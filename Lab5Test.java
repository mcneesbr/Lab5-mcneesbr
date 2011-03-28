import java.util.ArrayList;

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
	
	@Test
	public void test4() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(2);
		testList.add(2);
		assertEquals(testList, Primes.Factorization(4));
	}
	
	@Test
	public void test6() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(2);
		testList.add(3);
		assertEquals(testList, Primes.Factorization(6));
	}
	
	@Test
	public void test8() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(2);
		testList.add(2);
		testList.add(2);
		assertEquals(testList, Primes.Factorization(8));
	}
	
	@Test
	public void test9() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(3);
		testList.add(3);
		assertEquals(testList, Primes.Factorization(9));
	}
	
	@Test
	public void test325115() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(5);
		testList.add(7);
		testList.add(7);
		testList.add(1327);
		assertEquals(testList, Primes.Factorization(325115));
	}
}