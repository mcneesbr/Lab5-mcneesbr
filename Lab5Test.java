import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;



public class Lab5Test {
	
	@Test
	public void testFact1() {
		assertTrue(Primes.Factorization(1).isEmpty());
	}
	
	@Test
	public void testFact2() {
		assertTrue(Primes.Factorization(2).get(0) == 2);
	}
	
	@Test
	public void testFact3() {
		assertTrue(Primes.Factorization(3).get(0) == 3);
	}
	
	@Test
	public void testFact4() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(2);
		testList.add(2);
		assertEquals(testList, Primes.Factorization(4));
	}
	
	@Test
	public void testFact6() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(2);
		testList.add(3);
		assertEquals(testList, Primes.Factorization(6));
	}
	
	@Test
	public void testFact8() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(2);
		testList.add(2);
		testList.add(2);
		assertEquals(testList, Primes.Factorization(8));
	}
	
	@Test
	public void testFact9() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(3);
		testList.add(3);
		assertEquals(testList, Primes.Factorization(9));
	}
	
	@Test
	public void testFact325115() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(5);
		testList.add(7);
		testList.add(7);
		testList.add(1327);
		assertEquals(testList, Primes.Factorization(325115));
	}
	
	@Test
	public void testGen2() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		assertEquals(testList, Primes.Generation(2));
	}
	
	@Test
	public void testGen3() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(2);
		assertEquals(testList, Primes.Generation(3));
	}
	
	@Test
	public void testGen4() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(2);
		testList.add(3);
		assertEquals(testList, Primes.Generation(4));
	}
	
	@Test
	public void testGen5() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(2);
		testList.add(3);
		assertEquals(testList, Primes.Generation(5));
	}
}