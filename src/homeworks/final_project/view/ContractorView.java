package homeworks.final_project.view;

import homeworks.final_project.model.Contractor;
import homeworks.final_project.service.DataService;

import java.util.List;
import java.util.Map;

public class ContractorView implements View {

    private DataService service;

    public ContractorView(DataService service) {
        this.service = service;
    }

    public void addContractor(Contractor contractor) {
        service.addContractor(contractor);
        System.out.println("Контрагент успешно добавлен.");
    }

    public void addCommunication(String name, String communication) {
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
        for (Map.Entry<String, List<String>> entry : contractor.getCommsMap().entrySet()) {
            for (String comm: entry.getValue()) {
                System.out.printf("\t\t%s\t%s\n", entry.getKey(), comm);
            }
        }
    }

    public void removeContractor(String name) {
        service.removeContractor(name);
        System.out.printf("Контрагент %s успешно удален", name);
    }

    public void removeCommunicaton(String name, String communication) {
        service.removeCommunicationToContractor(name, communication);
        System.out.printf("Способ связи %s успешно удален у контрагента %s",communication, name);
    }
}
