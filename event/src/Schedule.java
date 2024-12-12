import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Schedule {

    List<Event> events = new ArrayList<>();

    public void addEvent(Event event) {
        events.add(event);
    }

    void printAllEvents(){
        if(events.isEmpty()){
            System.out.println("Розклад пустий");
        }else {
            for (Event event : events);{
                System.out.println(events);
            }
        }
    }

    List<Event> getEventsByDate(LocalDate date) {
        List<Event> result = new ArrayList<>();
        for (Event event : events) {
            if (event.getDate().toLocalDate().equals(date)) {
                result.add(event);
            }
        }
        return  result;
    }

    void removePastEvents() {
        LocalDateTime now = LocalDateTime.now();
        events.removeIf(event -> event.getDate().isBefore(now));
    }


}
