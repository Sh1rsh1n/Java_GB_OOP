package homeworks.final_project.ui;

import homeworks.final_project.exceptions.NotFoundCommunicationException;
import homeworks.final_project.service.DataService;

public interface BaseMenu {

    void showMenu(DataService service) throws NotFoundCommunicationException;
}
