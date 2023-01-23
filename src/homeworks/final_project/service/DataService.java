package homeworks.final_project.service;

import homeworks.final_project.data_handler.DataReader;
import homeworks.final_project.data_handler.DataWriter;
import homeworks.final_project.model.Contractor;

import java.util.List;

public class DataService {

    public void addContractor(Contractor contractor) {
        DataWriter.dataWrite(contractor);
    }

    public void addCommunicationToContractor(String name, String comm) {
        List<Contractor> list = DataReader.read();
        for (Contractor contractor: list) {
            if (contractor.getName().equals(name)) {
                contractor.setCommsMap(comm);
                DataWriter.reWriteData(list);
                return;
            }
        }
    }

    public List<Contractor> getAllContractorsName() {
        return DataReader.read();
    }

    public Contractor getContractorByName(String name) {
        List<Contractor> list = DataReader.read();
        for (Contractor contractor : list) {
            if (contractor.getName().equals(name)) {
                return contractor;
            }
        }
        return null;
    }

    public void removeContractor(String name) {
        DataWriter.removeData(name);
    }

    public void removeCommunicationToContractor(String name, String comm) {
        List<Contractor> list = DataReader.read();
        for (Contractor contractor: list) {
            if (contractor.getName().equals(name)) {
                contractor.setCommsMap(comm);
                DataWriter.reWriteData(list);
                return;
            }
        }
    }

}
