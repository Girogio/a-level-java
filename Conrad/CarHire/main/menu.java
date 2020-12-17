package main;
import run.carSystem;
import java.util.Calendar;
import Handler.Input;
import objects.Client;
public class menu {
    int choice = 0;

    private Input Input = new Input();

    public void showMenu() {
        do {
            
            System.out.print("\n\n1. Add Client\n");
            System.out.print("2. View Clients (Select)\n");
            System.out.print("3. View Cars (Select)\n");
            System.out.print("4. Rent Car\n");
            System.out.print("5. Edit Order\n");
            System.out.print("6. Instructions\n");
            System.out.print("7. Exit\n\n");

            try {
                System.out.print("Selected Client: "
                    + carSystem.Clients.clients.get(carSystem.selectedClientIndex).getName() + " "
                    + carSystem.Clients.clients.get(carSystem.selectedClientIndex).getSurname() + "\n");
            } catch (IndexOutOfBoundsException e) {
                System.out.print("Selected Client: N/A\n");

            }
            try {
                System.out.print("Selected Car: "
                    + carSystem.Clients.clients.get(carSystem.selectedClientIndex).selectedCar.getManu() + " "
                    + carSystem.Clients.clients.get(carSystem.selectedClientIndex).selectedCar.getModel() + "\n");
            } catch (Exception e) {
                System.out.print("Selected Car: N/A\n");

            }
            choice = Integer
            .parseInt(Input.ask("Please enter a menu selection", "That is not a valid choice!", "[1-7]"));
            switch (choice) {

                case 1:
                // name
                String name = Input.ask("Enter name: ", "Invalid name!", "[a-zA-Z]+");

                // surname
                String surname = Input.ask("Enter surname: ", "Invalid surname!", "[a-zA-Z]+");

                // id
                int ID = Integer
                    .parseInt(Input.ask("Please enter your ID number: ", "That is not a valid ID!", "[0-9]{8}"));
                for (int i = 0; i < carSystem.Clients.clients.size(); i++) {
                    do {
                        System.out.println("Cannot have the same ID as someone else! Reenter");
                        ID = Integer.parseInt(
                            Input.ask("Please enter your ID number: ", "That is not a valid ID!", "[0-9]{8}"));

                    } while (ID == carSystem.Clients.clients.get(i).getID());

                }

                // year
                int year;
                do {
                    year = Integer
                    .parseInt(Input.ask("Please enter your year of birth", "Invalid input type!", "[0-9]{4}"));
                    if ((year < 1950)) {
                        System.out.println("Invalid year - Too  old");
                    } else if (Calendar.getInstance().get(Calendar.YEAR) - year < 18) {
                        System.out.println("Invalid year - Too young!");

                    }
                } while (year < 1950 || Calendar.getInstance().get(Calendar.YEAR) - year < 18);

                long ccNum = Long.parseLong(Input.ask("Please enter your Credit Card number: ",
                            "That is not a valid Credit Card number!", "[0-9]{16}"));

                carSystem.Clients.addClient(new Client(name, surname, ID, year, ccNum));
                break;
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 2:
                if(carSystem.Clients.clients.size() == 0){
                    System.out.println("No clients found.");
                }else{
                try {
                    carSystem.selectedClientIndex = carSystem.Clients.printClients();
                } catch (ArrayIndexOutOfBoundsException e) {
                    if (carSystem.selectedClientIndex == -1) {

                    }
                }
            }
                break;
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 3:
                if (carSystem.selectedClientIndex == -1) {
                    System.out.println("No client selected, select that one first");
                } else if (carSystem.Cars.availableCars() == 0) {
                    System.out.println("No cars in database try adding some");
                } else if (carSystem.Clients.clients.get(carSystem.selectedClientIndex).selectedCar != null) {
                    System.out.println("Car already selected");
                } else {
                    carSystem.selectedCarIndex = carSystem.Cars.printCars();
                    carSystem.Clients.clients.get(carSystem.selectedClientIndex).selectedCar = carSystem.Cars.cars
                    .get(carSystem.selectedCarIndex);
                    carSystem.Cars.cars.get(carSystem.selectedCarIndex).available = false;
                }
                break;
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 4:
                if (carSystem.selectedClientIndex == -1) {
                    System.out.println("No client selected!");
                } else if (carSystem.Clients.clients.get(carSystem.selectedClientIndex).selectedCar == null) {
                    System.out.println("No car selected!");

                } else {
                    Client c = carSystem.Clients.clients.get(carSystem.selectedClientIndex);
                    c.car = c.selectedCar;
                    carSystem.Cars.cars.get(carSystem.selectedCarIndex).available = false;
                    carSystem.Clients.clients.set(carSystem.selectedClientIndex, c);
                    System.out.println("Car succesfully transferred to " + c.getName() + " " + c.getSurname() + "\n");
                    break;
                }
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 5:
                if (carSystem.selectedClientIndex == -1) {
                    System.out.println("No client selected!");
                } else if (carSystem.Clients.clients.get(carSystem.selectedClientIndex).selectedCar == null) {
                    System.out.println("Current user selected has selected car, try selecting one first");
                } else if (carSystem.Cars.availableCars() == 0) {
                    System.out.println("No cars left :( ");
                } else if (carSystem.Clients.clients.get(carSystem.selectedClientIndex).car != null) {
                    System.out.println("Change selected user's car: ");
                    int a = carSystem.selectedCarIndex;
                    int b = carSystem.Cars.printCars();
                    Client c = carSystem.Clients.clients.get(carSystem.selectedClientIndex);
                    c.selectedCar = carSystem.Cars.cars.get(b);
                    c.car = carSystem.Cars.cars.get(b);
                    carSystem.Cars.cars.get(a).available = true;
                    carSystem.Clients.clients.set(carSystem.selectedClientIndex, c);
                    carSystem.Cars.cars.get(b).available = false;
                    carSystem.selectedCarIndex = b;
                } else {
                    System.out.println("Make an order first!");
                }
                break;
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                case 6:
                System.out.print("1) Add a client, make sure his ID is not taken.\n");
                System.out.print("2) When client selected, select a car. While car selected, it's not possible to reselect.");
                System.out.print("3) Renting the car is now possible.\n");
                System.out.print("4) Once rented you can change it.\n");
                System.out.print("5) Viewing and selecting a client will always return his name and his car.\n");
                System.out.print("6) Selecting a client at any time is possible as program will load his selected car (temporarily)\n");
                System.out.print("7) Any further modification to that client's order is possible.");
                System.out.print("8) You can deselect a client by typing 0 as its index.");
                break;
            }
        } while (choice != 7);
        System.out.println("\fBye bye!");
    }

}
