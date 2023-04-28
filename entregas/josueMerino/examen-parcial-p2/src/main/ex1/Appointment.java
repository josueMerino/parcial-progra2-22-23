package main.ex1;

public class Appointment {
    Client owner;
    Pet pet;
    CustomDate date;
    String description;

    public Appointment(Pet pet, CustomDate date, String description) {
        this.pet = pet;
        this.date = date;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("[%1$s] - %2$s - %3$s - %4$s", date.toString(), owner.getFullName(), pet.getName(), description);
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }
}
