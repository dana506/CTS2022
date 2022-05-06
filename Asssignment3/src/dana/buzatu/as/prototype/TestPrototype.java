package dana.buzatu.as.prototype;

import dana.buzatu.as.prototype.*;

public class TestPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {

		Data data1 = new Data("forecasting.csv", 20);
		Data data2 = (Data) data1.clone(); // deep copy
		data1.toString();
		data2.toString();
	}
}