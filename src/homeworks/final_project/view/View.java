package homeworks.final_project.view;

import homeworks.final_project.model.Contractor;

public interface View {

    void addContractor(Contractor contractor);

    void addCommunication(String name, String communication);

    void showAllContractors();

    void showContractor(String name);

    void removeContractor(String name);

    void removeCommunicaton(String name, String communication);
}
