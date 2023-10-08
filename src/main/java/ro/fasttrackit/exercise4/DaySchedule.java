package ro.fasttrackit.exercise4;

public class DaySchedule {
    public void schedule(Days day) {
        switch (day) {
            case MONDAY -> System.out.println("Monday activities");
            case TUESDAY -> System.out.println("Tuesday activities");
            case WEDNESDAY -> System.out.println("Wednesday activities");
            case THURSDAY -> System.out.println("Thursday activities");
            case FRIDAY -> System.out.println("Friday activities");
            case SATURDAY -> System.out.println("Saturday activities");
            case SUNDAY -> System.out.println("Sunday activities");
            default -> System.out.println("Not a day");
        }
    }
}
