package homeworks.final_project.model.communications;


public class Phone implements Communication {

    private String phone;

    public Phone(String phone) {
        setCommunication(phone);
    }

    @Override
    public String getCommunication() {
        return phone;
    }

    @Override
    public void setCommunication(String phone) {
        if (checkCommunication(phone)) {
            this.phone = phone;
        } else {
            System.out.println("Некорректный номер телефона");
        }
    }

    @Override
    public String toString() {
        return String.format("Телефон: '%s'", phone);
    }

    private boolean checkCommunication(String phone) {
        return phone.matches("(\\+*)\\d{11}");
    }
}
