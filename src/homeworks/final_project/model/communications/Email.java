package homeworks.final_project.model.communications;


public class Email implements Communication {

    private String email;

    public Email(String email) {
        setCommunication(email);
    }

    @Override
    public String getCommunication() {
        return email;
    }

    @Override
    public void setCommunication(String email) {
        if (checkCommunication(email)) {
            this.email = email;
        } else {
            System.out.println("Некорректный адрес электронной почты");
        }
    }

    private boolean checkCommunication(String email) {
         return email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }

    @Override
    public String toString() {
        return String.format("Адрес электронной почты: '%s'", email);
    }
}
