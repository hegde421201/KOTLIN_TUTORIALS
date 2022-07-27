package java2.designpatterns.solid.ocp;

public class Student {

    String name;
    String regNumber;
    String department;
    double score;

    public Student(String name, String regNumber, String department, double score) {
        this.name = name;
        this.regNumber = regNumber;
        this.department = department;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", department='" + department + '\'' +
                ", score=" + score +
                '}';
    }
}
