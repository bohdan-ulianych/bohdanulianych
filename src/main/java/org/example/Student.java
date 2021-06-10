package org.example;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

import java.util.Comparator;
public class Student {
    private List<Course> courses;

    public Student(List<Course> _courses){
        courses = _courses;
    }

    public List<Course> getCourses(){
        return this.courses;
    }

    public int getCoursesCount(){
       return courses.size();
    }
}
