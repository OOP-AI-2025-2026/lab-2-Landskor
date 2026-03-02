package ua.opnu;

public class TimeSpan {
    public int hours;
    public int minutes;

    public TimeSpan() {
        this.hours = 0;
        this.minutes = 0;
    }

    public TimeSpan(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void add(int hours, int minutes) {
        this.hours = this.hours + hours;
        this.minutes = this.minutes + minutes;
    }

    public void addTimeSpan(TimeSpan timespan) {
        this.hours = this.hours + timespan.hours;
        this.minutes = this.minutes + timespan.minutes;
    }

    public double getTotalHours() {
        return this.hours + this.minutes / 60.0;
    }

    public int getTotalMinutes() {
        return this.hours * 60 + this.minutes;
    }

    public void subtract(TimeSpan span) {
        this.hours = this.hours - span.hours;
        this.minutes = this.minutes - span.minutes;
    }

    public void scale(int factor) {
        this.hours = this.hours * factor;
        this.minutes = this.minutes * factor;
    }
}