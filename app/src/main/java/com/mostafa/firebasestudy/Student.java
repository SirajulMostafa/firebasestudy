package com.mostafa.firebasestudy;

public class Student {
    int roll;
    String course,duration, name;

    public Student(int roll, String course, String duration, String name) {
        this.roll = roll;
        this.course = course;
        this.duration = duration;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
