package search;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HeapSortTest {
	public void heapSortTest() {
	}
	
	@Test
	public void testNoneElement(){
		int[] actualValue = null, expectedValue = {} ;
		int[] elements = {};
		
		System.out.println("testEmptyArray");
		
		HeapSort target = new HeapSort();
		actualValue = target.sort(elements);
		
		System.out.println("Return ");
		assertEquals(expectedValue.length, actualValue.length);
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullArray(){
		int[] actualValue = {};
		System.out.println("testNullArray");
		
		HeapSort target = new HeapSort();
		actualValue = target.sort(null);
	}
	
	@Test
	public void testOneElement(){
		int[] elements = {1};
		int[] actualValue = null;
		int expectedValue = 1;
		
		System.out.println("testOneElement");
		
		HeapSort target = new HeapSort();
		actualValue = target.sort(elements);
		
		assertEquals(expectedValue, actualValue[0]);
	}
	
	@Test
	public void testOnlyPositiveElements(){
		int[] elements = {1, 10, 2, Integer.MAX_VALUE, 45685};
		int[] actualValue = null;
		int[] expectedValue = {1, 2, 10, 45685, Integer.MAX_VALUE};
		
		System.out.println("testOnlyPositiveElements");
		
		HeapSort target = new HeapSort();
		actualValue = target.sort(elements);
		
		assertEquals(true, checkSolution(actualValue, expectedValue));
	}
	
	@Test
	public void testOnlyNegativeElements(){
		int[] elements = {-1, -10, -2, Integer.MIN_VALUE, -45685};
		int[] actualValue = null;
		int[] expectedValue = {Integer.MIN_VALUE, -45685, -10, -2, -1};
		
		System.out.println("testOnlyNegativeElements");
		
		HeapSort target = new HeapSort();
		actualValue = target.sort(elements);
		
		assertEquals(true, checkSolution(actualValue, expectedValue));
	}
	
	@Test
	public void testAleatoryElements(){
		int[] elements = {1, 0, -2, -998878, 45685};
		int[] actualValue = null;
		int[] expectedValue = {-998878, -2, 0, 1, 45685};
		
		System.out.println("testAleatoryElements");
		
		HeapSort target = new HeapSort();
		actualValue = target.sort(elements);
		
		assertEquals(true, checkSolution(actualValue, expectedValue));
	}
	
	@Test
	public void testAllElementsEquals(){
		int[] elements = {1,1,1,1,1,1,1,1,1,1,1};
		int[] actualValue = null;
		int[] expectedValue = {1,1,1,1,1,1,1,1,1,1,1};
		
		System.out.println("testAllElementsEquals");
		
		HeapSort target = new HeapSort();
		actualValue = target.sort(elements);
		
		assertEquals(true, checkSolution(actualValue, expectedValue));
	}
	
	@Test
	public void testVectorAlreadyOrdered(){
		int[] elements = {-15, 0, 15, 20, 18458, 4555785};
		int[] actualValue = null;
		int[] expectedValue = {-15, 0, 15, 20, 18458, 4555785};
		
		System.out.println("testAllElementsEquals");
		
		HeapSort target = new HeapSort();
		actualValue = target.sort(elements);
		
		assertEquals(true, checkSolution(actualValue, expectedValue));
	}
	
	private boolean checkSolution(int[] actualValue, int[] expectedValue){
		for(int i = 0; i < expectedValue.length; i ++){
			if(actualValue[i] != expectedValue[i]) return false;
		}
		
		return true;
	}
}
