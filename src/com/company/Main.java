package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //set variables

        Course course;
        Student student;
        ArrayList<Student> students = new ArrayList<>();

        //set courses
        Course algebra = new Course("Algebra", "MT 203");
        Course calculus = new Course("Calculus", "MT 204");

        //set students

        Student Amanda = new Student("001", "Amanda", "Ames");
        students.add(Amanda);
        Student Robert = new Student("002", "Robert", "McFadden");
        students.add(Robert);

        Amanda.takes(algebra);
        Amanda.takes(calculus);
        Robert.takes(calculus);

        for (Student eachStudent : students) {
            System.out.println(eachStudent.getFirstName() + eachStudent.getLastName() + eachStudent.getStudenNumber());
            for (Course eachCourse : eachStudent.getCourses()) {
                System.out.println(eachCourse.getRoomNumber() + eachCourse.getCourseTitle());

            }
        }

    }}