import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Schedule schedule =new Schedule();

        //Додавання
        schedule.addEvent(new Event("Лекція №1",
                LocalDateTime.of(2024,12,15,10,0),
                "Аудиторія 101"));
        schedule.addEvent(new Event("Лекція №2",
                LocalDateTime.of(2024,12,14,9,0),
                "Аудиторія 103"));
        schedule.addEvent(new Event("Лекція №3",
                LocalDateTime.of(2024,11,15,10,0),
                "Аудиторія 102"));
        schedule.addEvent(new Event("Лекція №4",
                LocalDateTime.of(2025,1,1,10,0),
                "Аудиторія 105"));
        //Виведення усіх
        System.out.println("Розклад заходів");
        schedule.printAllEvents();
        //Повернення за датою
        System.out.println("Заходи 12.12.2024");
        for(Event event : schedule.getEventsByDate(LocalDate.of(2024,12, 15))){
            System.out.println(event);
        }
        //Видалення та вивід оновленного
        schedule.removePastEvents();
        System.out.println("Оновлений розклад");
        schedule.printAllEvents();



    }
}