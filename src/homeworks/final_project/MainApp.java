package homeworks.final_project;

import homeworks.final_project.controller.Controller;
import homeworks.final_project.exceptions.NotFoundCommunicationException;
import homeworks.final_project.service.DataService;

public class MainApp {
    public static void main(String[] args) throws NotFoundCommunicationException {

        new Controller(new DataService()).run();

    }
}
