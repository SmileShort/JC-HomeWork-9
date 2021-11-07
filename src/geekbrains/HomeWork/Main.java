package geekbrains.HomeWork;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Ivan", Arrays.asList("test", "autotest", "java", "web", "sql"));
        Student student2 = new Student("Leonid", Arrays.asList("test", "autotest", "java", "web"));
        Student student3 = new Student("Egor", Arrays.asList("test", "autotest", "sql"));
        Student student4 = new Student("Kate", Arrays.asList("test", "autotest"));
        Student student5 = new Student("Irina", Arrays.asList("sql"));
        Student student6 = new Student("Vyacheslav", Arrays.asList("test", "autotest", "java", "web", "sql"));

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        List <Student> bestStudents = students.stream()
                .sorted(((o1, o2) -> o2.getCourses().size() - o1.getCourses().size()))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(bestStudents);

        List<String> unicCourses = students.stream()
                .filter(student -> student.getCourses().size() >= 0)
                .map(student -> student.getCourses().iterator().next())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unicCourses);


    }
}
