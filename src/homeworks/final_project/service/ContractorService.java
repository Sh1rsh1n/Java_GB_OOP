package homeworks.final_project.service;

import homeworks.final_project.data_handler.DataReader;
import homeworks.final_project.data_handler.DataWriter;
import homeworks.final_project.model.Contractor;
import homeworks.final_project.model.communications.Communication;

import java.util.List;

public class ContractorService implements DataService{

    public void addContractor(Contractor contractor) {
        DataWriter.dataWrite(contractor);
    }

    public List<Communication> addCommunication(Communication communication) {
        return List.of(communication);
    }

    public void addCommunicationToContractor(String name, Communication communication) {
        List<Contractor> list = DataReader.read();
        for (Contractor contractor: list) {
            if (contractor.getName().equalsIgnoreCase(name)) {
                contractor.getList().add(communication);
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
            if (contractor.getName().equalsIgnoreCase(name)) {
                return new Contractor(contractor.getName(), contractor.getList());
            }
        }
        return null;
    }

    public void removeContractor(String name) {
        DataWriter.removeData(name);
    }

    public void removeCommunicationToContractor(String name, Communication communication) {
        List<Contractor> list = DataReader.read();
        for (Contractor contractor: list) {
            if (contractor.getName().equalsIgnoreCase(name)) {
                contractor.getList().remove(communication);
                DataWriter.reWriteData(list);
                return;
            }
        }
    }

}
