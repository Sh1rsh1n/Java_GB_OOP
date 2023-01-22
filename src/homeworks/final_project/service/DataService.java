package homeworks.final_project.service;

import homeworks.final_project.model.Contractor;
import homeworks.final_project.model.communications.Communication;

import java.util.List;

public interface DataService {

    void addContractor(Contractor contractor);

    List<Communication> addCommunication(Communication communication);

    void addCommunicationToContractor(String name, Communication communication);

    void removeContractor(String name);

    void removeCommunicationToContractor(String name, Communication communication);

    List<Contractor> getAllContractorsName();

    Contractor getContractorByName(String name);
}
