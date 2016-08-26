
public class UsedCar extends Car {
	int miles;
	
	public UsedCar(String mak, String mod, int yer, double pryce, int mils) {
		super(mak, mod, yer, pryce);
		miles = mils;	
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

}
