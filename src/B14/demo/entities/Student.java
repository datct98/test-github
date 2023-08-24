package B14.demo.entities;

public class Student implements Comparable<Student>{
    //private static int autoId;
    private int id;
    private String name;
    private int age;

    public Student(String name, int age) {
        //this.id = ++autoId;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
