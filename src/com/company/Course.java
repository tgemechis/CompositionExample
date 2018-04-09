package com.company;

public class Course {
    //set up attributes for class Course

    private String courseTitle;
    private String roomNumber;

    //default constructor

    public Course(String roomNumber, String courseTitle)
    {
        this.roomNumber = roomNumber;
        this.courseTitle = courseTitle;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
