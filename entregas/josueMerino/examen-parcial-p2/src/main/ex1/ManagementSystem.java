package main.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem {
    private FileHandler fileHandler;
    private List<Client> clients;
    private List<Appointment> appointments;

    public ManagementSystem() {
        fileHandler = new FileHandler();
        clients = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public void loadData(String path) {

        List<String> lines = this.fileHandler.loadFileContent(path);

        for (String line: lines) {
            String[] data = line.split(";");

            // Extract data from line and remove quotes
            String name = data[0].replaceAll("\"", "");
            String surname = data[1].replaceAll("\"", "");
            String address = data[2].replaceAll("\"", "");
            String phoneNumber = data[3].replaceAll("\"", "");

            if(!name.equals("name")){
                this.clients.add(new Client(name, surname, address, phoneNumber));
            }

        }
    }
    public void addAppointment(Appointment appointment, Client client) {
       if(!isClient(client))
       {
           System.err.println("Client Not Found");
       }
        appointment.setOwner(client);
        appointments.add(appointment);
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    private boolean isClient(Client client) {
        for (Client c: clients) {
            if(c.equals(client))
            {
                return true;
            }
        }
        return false;
    }

}
