import java.time.LocalDateTime;

public class Event {
    String name;
    LocalDateTime dateTime;
    String location;

    public Event(String name, LocalDateTime dateTime, String location) {
        this.name = name;
        this.dateTime = dateTime;
        this.location = location;
    }

    @Override
    public String toString() {
        return
                "Назва: '" + name + '\'' +
                ", Час: " + dateTime +
                ", Місце: '" + location+"'"+'\n';


    }

    public LocalDateTime getDate (){
        return dateTime;
    }

}
