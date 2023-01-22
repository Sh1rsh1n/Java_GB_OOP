package homeworks.final_project.view;

import homeworks.final_project.model.Contractor;
import homeworks.final_project.model.communications.Communication;
import homeworks.final_project.service.DataService;

import java.util.List;

public class ContractorView implements View {

    private DataService service;

    public ContractorView(DataService service) {
        this.service = service;
    }

    public void addContractor(Contractor contractor) {
        service.addContractor(contractor);
        System.out.println("Контрагент успешно добавлен.");
    }

    public void addCommunication(String name, Communication communication) {
        service.addCommunicationToContractor(name, communication);
        System.out.printf("Контрагенту %s, успешно добавлен способ связи\n", name);
    }

    public void showAllContractors(){
        List<Contractor> list = service.getAllContractorsName();
        System.out.println("Список всех контрагентов: ");
        for (Contractor contractor : list) {
            System.out.printf("%s\n", contractor.getName());
        }
    }

    public void showContractor(String name){
        Contractor contractor = service.getContractorByName(name);
        System.out.printf("Контрагент: %s\n\t\tСпособы связи:\n", contractor.getName());
        for (Communication communication: contractor.getList()) {
            System.out.printf("\t\t%s\n", communication);
        }
    }

    public void removeContractor(String name) {
        service.removeContractor(name);
        System.out.printf("Контрагент %s успешно удален", name);
    }

    public void removeCommunicaton(String name, Communication communication) {
        service.removeCommunicationToContractor(name, communication);
        System.out.printf("Способ связи %s успешно удален у контрагента %s", communication.getCommunication(), name);
    }
}
