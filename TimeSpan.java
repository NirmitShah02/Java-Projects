//package Assignments;
/*
Nirmit Shah
19MIM10049
 */
public class TimeSpan {
    private int hours;
    private int minutes;
    public TimeSpan(int initialHours, int initialMinutes) {
        hours = 0;
        minutes = 0;
        add(initialHours, initialMinutes);
    }
    public void add(int initialHours, int initialMinutes) {
        hours += initialHours;
        minutes += initialMinutes;
        if (minutes >= 60) {
            minutes -= 60;
            hours++;
        }
    }
    public void add(TimeSpan span) {
        add(span.hours, span.minutes);
    }
    public double getTotalHours() {
        return hours + minutes / 60.0;
    }
    public String toString() {
        return hours + "h" + minutes + "m";
    }
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(3, 45);
        System.out.println(t1 + " is " + t1.getTotalHours() + " hours");
        t1.add(2, 30);
        System.out.println(t1 + " is " + t1.getTotalHours() + " hours");
        TimeSpan t2 = new TimeSpan(0, 51);
        t1.add(t2);
        System.out.println(t1 + " is " + t1.getTotalHours() + " hours");
    }
}
