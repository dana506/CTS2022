package dana.buzatu.as.tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dana.buzatu.as.classes.Product;
import dana.buzatu.as.exceptions.NameInvalidValueException;
import dana.buzatu.as.exceptions.NoSoldItemsException;
import dana.buzatu.as.exceptions.PriceInvalidValueException;

public class TestCaseReq1 {

	public final static String initialName = "cheese";
	public final static float initialPrice = 12;
	public final static ArrayList<Integer> initialWeeklySoldItems = (ArrayList<Integer>) (Arrays.asList(1, 2, 3, 4));

	public static Product prod1, prod2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		prod1 = new Product(initialName, initialPrice);
		prod2 = new Product(initialName, initialPrice, initialWeeklySoldItems);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Cleaning after all tests");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Preparing a test");

		prod1 = new Product("milk", 20);
		prod2 = new Product("cheese", 12, null);

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Cleaning after a test");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testConstructor2ParamConformance() {
		Product prod = new Product(initialName, initialPrice);
		assertEquals(initialName, prod.getName());
		assertEquals(initialPrice, prod.getPrice());
	}

	@Test
	public void testConstructor3ParamConformance() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		assertEquals(initialName, prod.getName());
		assertEquals(initialPrice, prod.getPrice());
		assertEquals(initialWeeklySoldItems, prod.getWeeklySoldItems());

	}

	@Test(expected = PriceInvalidValueException.class)
	public void testErrorConditionConstructor2ParamExistenceA() {
		Product prod = new Product(initialName, initialPrice);
		int negativePrice = -50;
		prod.setPrice(negativePrice);
	}

	@Test(expected = NameInvalidValueException.class)
	public void testErrorConditionConstructor2ParamExistenceB() {
		Product prod = new Product(initialName, initialPrice);
		String invalidName = "3xsm*";
		prod.setName(invalidName);
	}

	@Test(expected = PriceInvalidValueException.class)
	public void testErrorConditionConstructor3ParamExistenceA() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		int negativePrice = -50;
		prod.setPrice(negativePrice);
	}

	@Test(expected = NameInvalidValueException.class)
	public void testErrorConditionConstructor3ParamExistenceB() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		String invalidName = "3xsm*";
		prod.setName(invalidName);
	}

	@Test(expected = NoSoldItemsException.class)
	public void testConstructor3ParamNullReference() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		prod.setWeeklySoldItems(initialWeeklySoldItems);
	}

	@Test(expected = NoSoldItemsException.class)
	public void testConstructor3ParamExistence() {

		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		assertEquals(prod.getWeeklySoldItems(), initialWeeklySoldItems);
	}

	@Test(expected = NoSoldItemsException.class)
	public void testSetSalesNullReference() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		ArrayList<Integer> sales = null;
		prod.setSales(sales);

	}

	@Test(expected = NoSoldItemsException.class)
	public void testSetSalesExistence() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		prod.setSales(initialWeeklySoldItems);
	}

}
