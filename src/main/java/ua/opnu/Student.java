package ua.opnu;

import java.util.ArrayList;
public class Student {
    private String name;
    private int year;
    private ArrayList<String> courses;
    private static final double TUITION_PER_YEAR = 20000.0;
    public Student(String name, int year) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Ім'я не може бути порожнім");
        }
        if (year < 1 || year > 4) {
            throw new IllegalArgumentException("Рік навчання має бути від 1 до 4");
        }
        this.name = name;
        this.year = year;
        this.courses = new ArrayList<>();
    }
    public void addCourse(String courseName) {
        if (courseName == null || courseName.trim().isEmpty()) {
            throw new IllegalArgumentException("Назва дисципліни не може бути порожньою");
        }
        courses.add(courseName);
    }
    public void dropAll() {
        courses.clear();
    }
    public int getCourseCount() {
        return courses.size();
    }
    public String getName() {
        return name;
    }
    public double getTuition() {
        return year * TUITION_PER_YEAR;
    }
    public int getYear() {
        return year;
    }
    public ArrayList<String> getCourses() {
        return new ArrayList<>(courses);
    }
    @Override
    public String toString() {
        return name + ", " + year + "-й курс, дисциплін: " + courses.size();
    }
}