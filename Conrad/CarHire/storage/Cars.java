package storage;

import java.util.ArrayList;

import Handler.Input;
import objects.Car;

public class Cars {

	public ArrayList<Car> cars = new ArrayList<Car>();

	public int printCars() {
		Input Input = new Input();
		int c = 1;
		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i).available) {
				System.out.print((i + c) + ") ");
				cars.get(i).printDetails();
			} else
				c--;
		}

		int e = (-c)
				+ Integer.parseInt(Input.ask("Select car index: ", "Invalid Selection!", "[0-" + cars.size() + "]"));

		return e;
	}

	public int availableCars() {

		int a = 0;
		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i).available) {
				a++;
			}
		}
		return a;

	}

}
