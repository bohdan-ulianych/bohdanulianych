package org.example;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Comparator;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args )
    {
    List<Student> students = new ArrayList<>();

    }

        public List<Course> getUniqCourses(List<Student> students){
        Set<Course> result = new HashSet<>();

        students.stream().forEach( (student)->{
            student.getCourses().stream()
                    .forEach((course)->{
                        result.add(course);
            });
        });

        return new ArrayList<Course>(result);
    }

        public List<Student> geThreeStudentsMaxCoursesCount(List<Student> students){
        return students.stream()
                .sorted(Comparator.comparingInt(Student::getCoursesCount)
                .reversed()).limit(3).collect(Collectors.toList());
    }

        public List<Student> getStudentsByCourse(List<Student> students, String courseTitle){
        return (List<Student>) students.stream()
                .filter((student)-> student.getCourses()
                .stream().anyMatch((course)-> courseTitle.equals(course.getTitle())));
    }
    }

