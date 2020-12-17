package objects;

public class Car {

	private String manu = "";
	private String model = "";
	private int price = 0;
	public boolean available = true;

	public String getManu() {
		return manu;
	}

	public String getModel() {
		return model;
	}

	public Car(String manu, String model, int price) {

		this.manu = manu;
		this.model = model;
		this.price = price;

	}

	public void printDetails() {

		System.out.println("Manufacturer: " + manu);
		System.out.println("Model: " + model);
		System.out.println("Price: €" + price);

	}

}
