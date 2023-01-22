package homeworks.final_project.model.communications;

public class Address implements Communication {
    private String address;

    public Address(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Адрес: %s", this.address);
    }

    @Override
    public String getCommunication() {
        return String.format("%s", this.address);
    }

    @Override
    public void setCommunication(String communication) {
        if (communication.matches("\\w+[-]\\d+")) {
            this.address = communication;
        }
    }
}
