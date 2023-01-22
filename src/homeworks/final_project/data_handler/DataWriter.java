package homeworks.final_project.data_handler;

import homeworks.final_project.model.Contractor;
import homeworks.final_project.model.communications.Communication;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataWriter implements Data{

    public static void dataWrite(Contractor contractor) {
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write(contractor.getName());
            writer.write(",");
            for (Communication getCommunication : contractor.getList()) {
                writer.write(getCommunication.getCommunication());
                writer.write(",");
            }
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void removeData(String name) {
        List<Contractor> list = DataReader.read();
        for (Contractor contr: list) {
            if (contr.getName().equals(name)) {
                list.remove(contr);
                DataWriter.reWriteData(list);
                return;
            }
        }
    }

    public static void reWriteData(List<Contractor> list) {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (Contractor contractor: list) {
                writer.write(contractor.getName());
                writer.write(",");
                for (Communication getCommunication : contractor.getList()) {
                    writer.write(getCommunication.getCommunication());
                    writer.write(",");
                }
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
