package homeworks.final_project.service;

import homeworks.final_project.model.Contractor;
import homeworks.final_project.model.communications.Communication;

import java.util.List;

public interface DataService {

    void addContractor(Contractor contractor);

    void addCommunicationToContractor(String name, String com);

    void removeContractor(String name);

    void removeCommunicationToContractor(String name, Communication communication);

    List<Contractor> getAllContractorsName();

    Contractor getContractorByName(String name);
}
