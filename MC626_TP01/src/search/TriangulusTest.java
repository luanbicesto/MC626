package search;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import search.Triangulus;

public class TriangulusTest {

	@Test
	public void test() {
	}
	
	@BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("\nSETUP CLASS RUNNING -- Nothing to do though");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("\nTEARDOWN CLASS RUNNING -- Nothing to do though");
    }

    @Before
    public void setUp() {
        System.out.println("\nSETUP IS RUNNING -- Nothing to do though");
    }

    @After
    public void tearDown() {
        System.out.println("TEARDOWN IS RUNNING -- Nothing to do though");
    }

    @Test
    public void testScalene() {
        System.out.println("testScalene");

        Triangulus instance = new Triangulus("30", "40", "50");
        String expResult = "Scalene";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquilateral() {
        System.out.println("testEquilateral");
        Triangulus instance = new Triangulus("1", "1", "1");
        String expResult = "Equilateral";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsoceles() {
        System.out.println("testIsoceles");
        Triangulus instance = new Triangulus("30", "40", "30");
        String expResult = "Isosceles";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void testGiantTriangle() {
        System.out.println("testGiantTriangle");
        Triangulus instance = new Triangulus("3000000", "4000000", "3000000");
        String expResult = "I feel your triangle is too big\n";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

}
