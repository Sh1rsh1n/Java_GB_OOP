package homeworks.final_project.data_handler;

import homeworks.final_project.model.Contractor;
import homeworks.final_project.model.communications.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader implements Data{

    public static List<Contractor> read() {
        List<Contractor> list = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String str;
            while ((str = bf.readLine()) != null) {

                String[] array = str.split(",");

                List<Communication> communications = new ArrayList<>();
                for (int i = 1; i < array.length; i++) {
                    communications.add(checkCommunication(array[i]));
                }

                list.add(new Contractor(array[0], communications));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }


    private static Communication checkCommunication(String comm) {
        if (comm.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
            return new Email(comm);
        if (comm.matches("(\\+*)\\d{11}"))
            return new Phone(comm);
        if (comm.matches(".*\\B@(?=\\w{5,64}\\b)[a-zA-Z0-9]+(?:_[a-zA-Z0-9]+)*.*"))
            return new TelegramNikName(comm);
        if (comm.matches("^https://vk.com/[a-z0-9]+"))
            return new VK_URL(comm);
        if (comm.matches("\\w+[-]\\d+")) {
            return new Address(comm);
        }
        return null;
    }
}
