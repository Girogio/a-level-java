package objects;

public class Client {

	private String name = "";

	private String surname = " ";
	private int ID = 0;
	private int year = 0;
	private long ccNum = 0;

	public Car car;
	public Car selectedCar;

	public Client(String name, String surname, int ID, int year, long ccNum) {

		this.name = name;
		this.surname = surname;
		this.ID = ID;
		this.year = year;
		this.ccNum = ccNum;

	}

	public void printDetails() {

		System.out.println("Name: " + this.name);
		System.out.println("Surname: " + this.surname);
		System.out.println("ID: " + this.ID);
		System.out.println("Year of birth: " + this.year);
		System.out.println("Credit Card: " + this.ccNum);
		try {
			System.out.println("Car: " + this.car.getManu() + " " + this.car.getModel() + "\n\n");
		} catch (NullPointerException e) {
			System.out.println("Car: N/A\n\n");

		}
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getID() {
		return ID;
	}

	
}
