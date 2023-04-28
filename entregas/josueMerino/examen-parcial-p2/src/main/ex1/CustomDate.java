package main.ex1;

public class CustomDate {
    private int day;
    private int month;
    private int year;

    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d", day) + '/' + String.format("%02d", month) + '/' + year;
    }

    public String format(String format) {
        return String.format("%02d", day) + format + String.format("%02d", month) + format + year;
    }
}
