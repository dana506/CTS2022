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
import dana.buzatu.as.exceptions.NoSoldItemsException;

public class TestCaseReq3 {

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
	public void testGetPercentOfBadWeeksRight(int minLimit) {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		float m = 0;

		for (Integer n : initialWeeklySoldItems)
			if (n > minLimit)
				m += n;
		int mockPercentage = (int) (100 * m / initialWeeklySoldItems.size());
		assertEquals(mockPercentage, prod.getPercentOfBadWeeks(minLimit));
	}

	@Test
	public void getWeeksIndexWithMaxSalesRight() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		ArrayList<Integer> mockMaxWeeks = new ArrayList<>();
		int max = initialWeeklySoldItems.get(0);

		for (int i = 0; i < initialWeeklySoldItems.size(); i++)
			if (initialWeeklySoldItems.get(i) > max)
				mockMaxWeeks.add(i);
		assertEquals(mockMaxWeeks, prod.getWeeksIndexWithMaxSales());
	}

	@Test
	public void testGetPercentOfBadWeeksCrossCheck(int minLimit) throws NoSoldItemsException {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		prod.setWeeklySoldItems(initialWeeklySoldItems);

		float m = 0;
		for (Integer n : initialWeeklySoldItems)
			if (n > minLimit)
				m += n;

		int expectedPercent = (int) (100 * m / initialWeeklySoldItems.size());
		int computedPercent = prod.getPercentOfBadWeeks(minLimit);

		assertEquals(expectedPercent, computedPercent);
	}

	@Test
	public void getWeeksIndexWithMaxSalesCrossCheck() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		ArrayList<Integer> mockMaxWeeks = new ArrayList<>();
		int max = initialWeeklySoldItems.get(0);

		for (int i = 0; i < initialWeeklySoldItems.size(); i++)
			if (initialWeeklySoldItems.get(i) > max)
				mockMaxWeeks.add(i);
		ArrayList<Integer> expectedMaxWeeks = mockMaxWeeks;
		ArrayList<Integer> computedMaxWeeks = prod.getWeeksIndexWithMaxSales();
		assertEquals(expectedMaxWeeks, computedMaxWeeks);
	}

	@Test
	public void testGetPercentOfBadWeeksInverse(int minLimit) throws NoSoldItemsException {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		prod.setWeeklySoldItems(initialWeeklySoldItems);

		float m = 0;
		for (Integer n : initialWeeklySoldItems)
			if (n > minLimit)
				m += n;

		int mockPercent = (int) (100 * m / initialWeeklySoldItems.size());

		if (mockPercent != prod.getPercentOfBadWeeks(minLimit))
			fail("The value is not the right percentage");

		assertTrue(true);
	}

	@Test
	public void getWeeksIndexWithMaxSalesInverse() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		ArrayList<Integer> mockMaxWeeks = new ArrayList<>();
		int max = initialWeeklySoldItems.get(0);

		for (int i = 0; i < initialWeeklySoldItems.size(); i++)
			if (initialWeeklySoldItems.get(i) > max)
				mockMaxWeeks.add(i);

		if (mockMaxWeeks != prod.getWeeksIndexWithMaxSales())
			fail("The value is not the right percentage");

		assertTrue(true);
	}
	
	@Test
	public void testPercentOfBadWeeksCardinalityOneMax() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		ArrayList<Integer> weeklySoldItems = new ArrayList<>();
		int uniqueWeeklySoldItems = 10;
		weeklySoldItems.add(uniqueWeeklySoldItems);
		int mock = prod.getPercentOfBadWeeks(uniqueWeeklySoldItems);
		int maxNoSoldItems = Product.getWeeklysolditemMax();
		assertEquals(mock, maxNoSoldItems);
	}

	@Test
	public void testPercentOfBadWeeksAscendingOrder() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		int limit = 50;
		ArrayList<Integer> weeklySoldItems = new ArrayList<>();
		for (int week = 1; week <= 100; week += 1) {
			weeklySoldItems.add(week);
		}
		int expectedMinItem = 30;
		prod.getNoWeeksAboveLimit(limit);
		int mockPercentWeeks = prod.getPercentOfBadWeeks(limit);
		assertEquals(expectedMinItem, mockPercentWeeks);
	}
}

	
	