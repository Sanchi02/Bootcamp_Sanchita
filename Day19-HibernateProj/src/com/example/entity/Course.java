package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "course_detail")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="course_id")
    int courseId;

    @Column(length = 20, nullable = false)
    String courseName;

    @Column
    int duration;

    @Column
    double fees;

    public Course() {
    }

    public Course(String courseName, int duration, double fees) {
        this.courseName = courseName;
        this.duration = duration;
        this.fees = fees;
    }

    public Course(int courseId, String courseName, int duration, double fees) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.fees = fees;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", duration=" + duration +
                ", fees=" + fees +
                '}';
    }
}
