package homeworks.final_project.exception;

/*
исключение "Некорректный типа способа связи"
 */
public class IncorrectCommunicationTypeException extends Exception{
    public IncorrectCommunicationTypeException(String message) {
        super(message);
    }
}
