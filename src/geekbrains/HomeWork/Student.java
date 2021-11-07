package geekbrains.HomeWork;

import java.util.List;

public class Student {

    String name;
    List<String> courses;

    public Student(String name, List<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public List<String> getCourses() {
        return courses;
    }

    @Override
    public String toString(){
        return name + " записан(а) на курсы:" + getCourses() + "     ";
    }


}
