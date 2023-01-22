package homeworks.final_project.model.communications;

public class TelegramNikName implements Communication {

    private String telegramName;

    public TelegramNikName(String telegramName) {
        setCommunication(telegramName);
    }

    @Override
    public String getCommunication() {
        return telegramName;
    }

    @Override
    public void setCommunication(String telegramName) {
        if (checkCommunication(telegramName)) {
            this.telegramName = telegramName;
        } else {
            System.out.println("Некорректный никнэйм в Telegram");
        }
    }

    @Override
    public String toString() {
        return String.format("Никнэйм в Telegram: %s", telegramName);
    }

    private boolean checkCommunication(String telegramName) {
        return telegramName.matches(".*\\B@(?=\\w{5,64}\\b)[a-zA-Z0-9]+(?:_[a-zA-Z0-9]+)*.*");
    }


}
