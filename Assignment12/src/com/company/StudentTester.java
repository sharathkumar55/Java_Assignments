package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.Comparator.*;
public class StudentTester {
    ArrayList<Student> studentList=new ArrayList<Student>();
    StudentTester()
    {
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

    }
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
    public void getDepartments()
    {
        System.out.println("Names of the departments");
        studentList.stream().filter(distinctByKey(Student::getEngDepartment)).forEach(s->System.out.println(s.getEngDepartment()));
    }
    public void studentsEnrolledAfter2018()
    {
        System.out.println("Students enrolled after 2018");
        studentList.stream().filter(s-> 2018 < s.getYear_of_enrollment()).forEach(s->System.out.println(s.getName()));
    }
    public void getMaleCSEStudents()
    {
        System.out.println("All Details Of Male and ComputerScience students ");
        studentList.stream().filter(s-> s.getGender().equals("Male") && s.getEngDepartment().equals("Computer Science")).forEach(s->System.out.println(s.toString()));
    }
    public void numOfMalesAndFemales()
    {
        System.out.println("Number of Males and Number of Females");
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting())));
    }
    public void avgOfMalesAndFemales()
    {
        System.out.println("Average age of males and Females");
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingDouble(Student::getAge))));
    }
    public void detailsOfHighestPercentageStudent()
    {
        System.out.println("Details of Student with highest percentage");
        //System.out.println(studentList.stream().max((s1,s2)->(s1.getPerTillDate() > s2.getPerTillDate())?1:(s1.getPerTillDate()<s2.getPerTillDate())?-1:0).get());
        System.out.println(studentList.stream().max(Comparator.comparingDouble(Student::getPerTillDate)).get());
    }
    public void numOfStudentsInEachDept()
    {
        System.out.println("Counting number of students for each department");
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.counting())));
    }
    public void avgPercentageInEachDept()
    {
        System.out.println("Average percentage in each department");
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate))));

    }
    public void detailsOfYoungestMaleInElectronics()
    {
        System.out.println("Details of Youngest male student in electronics department");
        System.out.println(studentList.stream().filter(s->s.getEngDepartment().equals("Electronic")).collect(Collectors.minBy(Comparator.comparingInt(Student::getAge))));

    }
    public void numOfFemalesAndMalesinCSEDept()
    {
        System.out.println("Number of males and females in computer science department");
        System.out.println(studentList.stream().filter(s->s.getEngDepartment().equals("Computer Science")).collect(Collectors.groupingBy(Student::getGender,Collectors.counting())));

    }
    public static void main(String args[]) {
        StudentTester student = new StudentTester();
        student.getDepartments();
        student.studentsEnrolledAfter2018();
        student.getMaleCSEStudents();
        student.numOfMalesAndFemales();
        student.avgOfMalesAndFemales();
        student.detailsOfHighestPercentageStudent();
        student.numOfMalesAndFemales();
        student.avgPercentageInEachDept();
        student.numOfFemalesAndMalesinCSEDept();
    }
}
