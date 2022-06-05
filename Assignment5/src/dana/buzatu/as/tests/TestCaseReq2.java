package dana.buzatu.as.tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import dana.buzatu.as.classes.Product;
import dana.buzatu.as.exceptions.NoSoldItemsException;
import dana.buzatu.as.tests.categories.ImportantTest;
import dana.buzatu.as.tests.categories.PerformanceTest;

public class TestCaseReq2 {

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
	public void testAddWeekRight() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		prod.addWeek(7);
		assertEquals((Arrays.asList(1, 2, 3, 4, 7)), prod.getWeeklySoldItems());
	}

	@Test
	public void testGetSoldItemsRight() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		assertEquals(initialWeeklySoldItems, prod.getWeeklySoldItems());
	}

	@Test
	public void testGetNoWeeksAboveLimitRight() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		int minLimit = 3;
		int mockNoWeeks = 0;
		for (int n : initialWeeklySoldItems)
			if (n >= minLimit)
				mockNoWeeks++;
		assertEquals(mockNoWeeks, prod.getNoWeeksAboveLimit(3));
	}

	@Test(expected = NoSoldItemsException.class)
	public void testAddWeekRange() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		int bigPositiveValue = 120;
		prod.addWeek(bigPositiveValue);
	}

	@Test(expected = NoSoldItemsException.class)
	public void testGetSoldItemsRange() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		int bigPositiveValue = 120;
		prod.getSoldItems(bigPositiveValue);
	}

	@Test(expected = NoSoldItemsException.class)
	public void testGetNoWeeksAboveLimitRange() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		int bigMinLimit = 150;
		prod.getNoWeeksAboveLimit(bigMinLimit);
	}

	@Test
	public void testAddWeekBoundaryMax() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		int maxValue = Product.getWeeklysolditemMax();
		prod.addWeek(maxValue);
	}

	@Test
	public void testAddWeekBoundaryMin() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		int minValue = Product.getWeeklysolditemMin();
		prod.addWeek(minValue);
	}

	@Test
	public void testGetSoldItemsBoundaryMax() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		int maxValue = Product.getWeeklysolditemMax();
		prod.getSoldItems(maxValue);
	}

	@Test
	public void testGetSoldItemsBoundaryMin() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		int minValue = Product.getWeeklysolditemMin();
		prod.getSoldItems(minValue);
	}

	@Test
	public void testGetNoWeeksAboveLimitBoundaryMax() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		int maxValue = Product.getWeeklysolditemMax();
		prod.getNoWeeksAboveLimit(maxValue);
	}

	@Test
	public void testGetNoWeeksAboveLimitBoundaryMIN() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		int minValue = Product.getWeeklysolditemMin();
		prod.getNoWeeksAboveLimit(minValue);
	}

	@Test
	public void testGetNoWeeksAboveLimitCardinalityOneMin() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		ArrayList<Integer> weeklySoldItems = new ArrayList<>();
		int uniqueWeeklySoldItems = 10;
		weeklySoldItems.add(uniqueWeeklySoldItems);
		prod.getNoWeeksAboveLimit(uniqueWeeklySoldItems);
		int minNoSoldItems = Product.getWeeklysolditemMin();
		assertEquals(uniqueWeeklySoldItems, minNoSoldItems);
	}

	@Category({ImportantTest.class, PerformanceTest.class})
	@Test
	public void testGetNoWeeksAboveLimitCardinalityOneMax() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		ArrayList<Integer> weeklySoldItems = new ArrayList<>();
		int uniqueWeeklySoldItems = 10;
		weeklySoldItems.add(uniqueWeeklySoldItems);
		prod.getNoWeeksAboveLimit(uniqueWeeklySoldItems);
		int maxNoSoldItems = Product.getWeeklysolditemMax();
		assertEquals(uniqueWeeklySoldItems, maxNoSoldItems);
	}

	@Test
	public void testGetNoWeeksAboveLimitAscendingOrder() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		int limit = 50;
		ArrayList<Integer> weeklySoldItems = new ArrayList<>();
		for (int week = 1; week <= 100; week += 1) {
			weeklySoldItems.add(week);
		}
		int expectedMinItem = 30;
		prod.getNoWeeksAboveLimit(limit);
		int noWeeksAboveLimit = prod.getNoWeeksAboveLimit(limit);
		assertEquals(expectedMinItem, noWeeksAboveLimit);
	}

	@Test
	public void testGetNoWeeksAboveLimitDescendingOrder() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		int limit = 50;
		ArrayList<Integer> weeklySoldItems = new ArrayList<>();
		for (int week = 1; week >= 1; week -= 1) {
			weeklySoldItems.add(week);
		}
		int expectedMinItem = 30;
		prod.getNoWeeksAboveLimit(limit);
		int noWeeksAboveLimit = prod.getNoWeeksAboveLimit(limit);
		assertEquals(expectedMinItem, noWeeksAboveLimit);
	}

	@Category(PerformanceTest.class)
	@Test
	public void testGetNoWeeksAboveLimitPerformance() throws NoSoldItemsException {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		ArrayList<Integer> weeklySoldItems = new ArrayList<>();
		int noWeeks = (int) 1000;
		Random random = new Random();
		for (int i = 0; i < noWeeks; i++) {
			weeklySoldItems.add(random.nextInt(Product.getWeeklysolditemMax()) + 1);
		}

		prod.getNoWeeksAboveLimit(noWeeks);

		long tStart = System.currentTimeMillis();
		prod.getNoWeeksAboveLimit(noWeeks);
		long tFinal = System.currentTimeMillis();

		long delta = tFinal - tStart;
		long performanceLimit = 3;
		if (delta <= performanceLimit) {
			assertTrue(true);
		} else {
			fail("Takes too long");
		}
	}

	@Test(expected = NoSoldItemsException.class)
	public void testGetSoldItemsExistence() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		int invalidNoSoldItems = -56;
		prod.getSoldItems(invalidNoSoldItems);
	}

	@Test(expected = NoSoldItemsException.class)
	public void testGetNoWeeksAboveLimitExistence() {
		Product prod = new Product(initialName, initialPrice, initialWeeklySoldItems);
		int invalidLimit = -56;
		prod.getNoWeeksAboveLimit(invalidLimit);
	}
}
