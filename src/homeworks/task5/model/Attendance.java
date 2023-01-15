package homeworks.task5.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Attendance {

    private Map<LocalDate, Boolean> attendance;

    public Attendance() {
        attendance = new HashMap<>();
    }

    /*
    метод, добавляет дату и результат посещения студенту
    */
    public void addDateVisit(LocalDate date, Boolean visit) {
        attendance.putIfAbsent(date, visit);
    }

    /*
    метод вычисляет количество дней когда студент был на занятиях
     */
    public int attendanceCount() {
        int count = 0;
        for (Map.Entry<LocalDate, Boolean> map : attendance.entrySet()) {
            if (map.getValue()) {
                count++;
            }
        }
        return count;
    }

    /*
    метод вычисляет процент посещений занятий студентом
     */
    public int percentAttendance() {
        return attendanceCount() * 100 / attendance.size();
    }

    /*
    для красовы вывода информации, метод toString() написал свой
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<LocalDate, Boolean> map : attendance.entrySet()) {
            sb.append(map.getKey());
            sb.append(", ");
            sb.append(map.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }
}
