package dana.buzatu.as.classes;

import java.util.ArrayList;

public class Product {
	private String name;
	private float price;
	private ArrayList<Integer> weeklySoldItems; // number of items sold each week
	public static final int weeklySoldItem_MAX = 125;
	public static final int weeklySoldItem_MIN = 1;

	public Product(String name, float price) {
		this.name = name;
		this.price = price;
		weeklySoldItems = new ArrayList<Integer>();
	}

	public Product(String name, float price, ArrayList<Integer> soldItems) {
		this.name = name;
		this.price = price;
		this.weeklySoldItems = new ArrayList<Integer>();
		for (Integer n : soldItems)
			this.weeklySoldItems.add(n);
	}

	public void setSales(ArrayList<Integer> soldItems) {
		this.weeklySoldItems = soldItems;
	}

	public ArrayList<Integer> getWeeklySoldItems() {
		return weeklySoldItems;
	}

	public void setWeeklySoldItems(ArrayList<Integer> weeklySoldItems) {
		this.weeklySoldItems = weeklySoldItems;
	}

	public String getName() {
		return this.name;
	}

	public float getPrice() {
		return this.price;
	}

	public void addWeek(int soldItems) {
		weeklySoldItems.add(soldItems);
	}

	public int getSoldItems(int i) {
		return weeklySoldItems.get(i);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	/*
	 * 
	 * determines the number of weeks with sales above the given limit determina
	 * numarul de saptamani in care au fost vandute un numar de produse peste limita
	 * data
	 * 
	 */
	public int getNoWeeksAboveLimit(int minLimit) {
		int noWeeks = 0;
		for (int n : weeklySoldItems)
			if (n >= minLimit)
				noWeeks++;
		noWeeks++;
		return noWeeks;
	}

	/*
	 * 
	 * determines the percentage (%) of weeks with sales under the given limit from
	 * total number of weeks determina procentul saptamanilor (din total saptamani)
	 * care au avut vanzari sub limita data
	 * 
	 */
	public int getPercentOfBadWeeks(int minLimit) {
		float m = 0;
		for (Integer n : weeklySoldItems)
			if (n > minLimit)
				m += n;

		return (int) (100 * m / this.weeklySoldItems.size());
	}

	/*
	 * 
	 * 
	 * determines the index of the weeks with maximum sales (multiple weeks can have
	 * maximum sales) determina indexul saptamanilor cu vanzari maxime (mai multe
	 * saptamani pot avea vanzari la nivel maxim)
	 * 
	 * 
	 */

	public ArrayList<Integer> getWeeksIndexWithMaxSales() {
		ArrayList<Integer> maxWeeks = new ArrayList<>();
		int max = this.weeklySoldItems.get(0);

		for (int i = 0; i < this.weeklySoldItems.size(); i++)
			if (this.weeklySoldItems.get(i) > max)
				maxWeeks.add(i);

		return maxWeeks;
	}

	@Override
	public String toString() {
		String output = this.name + " weekly sales: ";
		for (Integer n : weeklySoldItems)
			output += n + " ";
		return output;
	}

	public static int getWeeklysolditemMax() {
		return weeklySoldItem_MAX;
	}

	public static int getWeeklysolditemMin() {
		return weeklySoldItem_MAX;
	}

}
