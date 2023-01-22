package homeworks.final_project.model.communications;


public class VK_URL implements Communication {

    private String vk_url;

    public VK_URL(String vk_url) {
        setCommunication(vk_url);
    }

    @Override
    public String getCommunication() {
        return vk_url;
    }

    @Override
    public void setCommunication(String vk_url) {
        if (checkCommunication(vk_url)) {
            this.vk_url = vk_url;
        } else {
            System.out.println("Некорректный адрес VK страницы");
        }
    }

    @Override
    public String toString() {
        return String.format("Адрес VK страницы: %s", vk_url);
    }

    private boolean checkCommunication(String comm) {
        return comm.matches("^https://vk.com/[a-z0-9]+");
    }
}
