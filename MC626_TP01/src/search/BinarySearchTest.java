package search;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {
	
	public void binarySearchTest() {
	}
	
	@Test
	public void testNoneElement(){
		int actualValue = 0, expectedValue = -1;
		int[] elements = {};
		
		System.out.println("testEmptyArray");
		
		BinarySearch target = new BinarySearch();
		actualValue = target.find(elements, 2);
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullArray(){
		int actualValue = 0;
		System.out.println("testNullArray");
		
		BinarySearch target = new BinarySearch();
		actualValue = target.find(null, 2);
	}
	
	@Test
	public void testOneElement(){
		int[] elements = {1};
		int actualValue = 0, expectedValue = 0;
		
		System.out.println("testOneElement");
		
		BinarySearch target = new BinarySearch();
		actualValue = target.find(elements, 1);
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testOnlyPositiveElements(){
		int[] elements = {1, 2, 10, Integer.MAX_VALUE};
		int actualValue = 0, expectedValue = 2;
		
		System.out.println("testOnlyPositiveElements");
		
		BinarySearch target = new BinarySearch();
		actualValue = target.find(elements, 10);
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testOnlyNegativeElements(){
		int[] elements = {Integer.MIN_VALUE, -189, -2, -1};
		int actualValue = 0, expectedValue = 0;
		
		System.out.println("testOnlyNegativeElements");
		
		BinarySearch target = new BinarySearch();
		actualValue = target.find(elements, Integer.MIN_VALUE);
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testAleatoryElements(){
		int[] elements = {Integer.MIN_VALUE,-1, 0,  2, 10, 1548, Integer.MAX_VALUE};
		int actualValue = 0, expectedValue = 2;
		
		System.out.println("testAleatoryElements");
		
		BinarySearch target = new BinarySearch();
		actualValue = target.find(elements, 0);
		
		assertEquals(expectedValue, actualValue);
	}
	
	/*@Test
	public void testOneElement(){
		int[] elements = {1};
		int actualValue = 0, expectedValue = 0;
		
		System.out.println("testOneElement");
		
		BinarySearch target = new BinarySearch();
		actualValue = target.find(elements, 1);
		
		assertEquals(expectedValue, actualValue);
	}*/
	
	/*@Test
	public void testElemetsNotBelongToVector(){
		int[] elements = {1, 2, 10, 998878};
		int actualValue = 0, expectedValue = -1;
		
		System.out.println("testElemetsNotBelongToVector");
		
		BinarySearch target = new BinarySearch();
		actualValue = target.find(elements, -998877);
		
		assertEquals(expectedValue, actualValue);
	}*/
}
