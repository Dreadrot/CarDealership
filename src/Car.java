
public class Car{
	String make;
	String model;
	int year;
	double price;

	public Car(String mak, String mod, int yer, double pryce) {
		make = mak;
		model = mod;
		year = yer;
		price = pryce;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
