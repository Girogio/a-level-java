package storage;

import java.util.ArrayList;

import Handler.Input;
import objects.Client;

public class Clients {

	public ArrayList<Client> clients = new ArrayList<Client>();

	public int printClients() {
		Input Input = new Input();

		int c = 1;
		for (int i = 0; i < clients.size(); i++) {

			System.out.print((i + c) + ") ");
			clients.get(i).printDetails();

		}

		int e = (-c) + Integer
				.parseInt(Input.ask("Select client index: ", "Invalid Selection!", "[0-" + clients.size() + "]"));

		return e;
	}

	public void addClient(Client client) {

		clients.add(client);
		System.out.println("Client " + client.getName() + " " + client.getSurname() + " was successfully added");

	}

}
