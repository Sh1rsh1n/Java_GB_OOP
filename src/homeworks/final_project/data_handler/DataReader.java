package homeworks.final_project.data_handler;

import homeworks.final_project.model.Contractor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DataReader implements Data{

    public static List<Contractor> read() {
        List<Contractor> list = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String str;
            while ((str = bf.readLine()) != null) {

                String[] array = str.split(",");
                
                Contractor contractor = new Contractor();
                contractor.setName(array[0]);
                if (array.length > 1){ 
                    for (int i = 1; i < array.length; i++) {
                        contractor.getCommsMap().get(checkCommunicationType(array[i])).add(array[i]);
                    }
                }
                list.add(contractor);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }


    private static String checkCommunicationType(String comm) {
        if (comm.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
            return "Email";
        if (comm.matches("(\\+*)\\d{11}"))
            return "Phone";
        if (comm.matches(".*\\B@(?=\\w{5,64}\\b)[a-zA-Z0-9]+(?:_[a-zA-Z0-9]+)*.*"))
            return "Telegram";
        if (comm.matches("^https://vk.com/[a-z0-9]+"))
            return "VKontakte";
        if (comm.matches("\\w+[-]\\d+")) {
            return "Address";
        }
        return null;
    }
}
