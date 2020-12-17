package run;
import objects.Car;
import storage.Cars;
import main.menu;
import storage.Clients;
public class carSystem {
	public static int selectedClientIndex = -1;
	public static int selectedCarIndex = -1;
	public static Clients Clients = new Clients();
	public static Cars Cars = new Cars();

	public static void main(String args[]) {
		menu menu = new menu();
		
		Cars.cars.add(new Car("Toyota", "Yaris", 3000));
		Cars.cars.add(new Car("BMW", "i83", 300));
		Cars.cars.add(new Car("Tesla", "Model S", 300));

		menu.showMenu();

	}

}
