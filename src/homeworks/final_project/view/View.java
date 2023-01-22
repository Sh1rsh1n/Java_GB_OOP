package homeworks.final_project.view;

import homeworks.final_project.model.Contractor;
import homeworks.final_project.model.communications.Communication;

public interface View {

    void addContractor(Contractor contractor);

    void addCommunication(String name, Communication communication);

    void showAllContractors();

    void showContractor(String name);

    void removeContractor(String name);

    void removeCommunicaton(String name, Communication communication);
}
