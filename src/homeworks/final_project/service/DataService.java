package homeworks.final_project.service;

import homeworks.final_project.data_handler.DataReader;
import homeworks.final_project.data_handler.DataWriter;
import homeworks.final_project.model.Contractor;

import java.util.List;
import java.util.Map;

public class DataService {

    /*
    добавляем контрагента в файл
     */
    public void addContractor(Contractor contractor) {
        DataWriter.dataWrite(contractor);
    }

    /*
    добавляем способ связи контрагенту
     */
    public void addCommunicationToContractor(String name, String comm) {
        List<Contractor> list = DataReader.read();
        for (Contractor contractor : list) {
            if (contractor.getName().equals(name)) {
                contractor.setCommsMap(comm);
                DataWriter.reWriteData(list);
                return;
            }
        }
    }

    /*
    получаем список всех контрагентов
     */
    public List<Contractor> getAllContractorsName() {
        return DataReader.read();
    }

    /*
    удаляем контрагента
     */
    public void removeContractor(String name) {
        DataWriter.removeData(name);
    }

    /*
    удаляем способ связи у контрагента
     */
    public void removeCommunicationToContractor(String name, String comm) {
        List<Contractor> list = DataReader.read();
        for (Contractor contractor : list) {
            if (contractor.getName().equals(name)) {
                for (Map.Entry<String, List<String>> entry : contractor.getCommsMap().entrySet()) {
                    if (entry.getKey().equals(comm)) {
                        entry.getValue().clear();
                        DataWriter.reWriteData(list);
                        return;
                    }
                }
            }
        }
    }
}

