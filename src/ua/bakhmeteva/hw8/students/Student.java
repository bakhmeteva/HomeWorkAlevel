package ua.bakhmeteva.hw8.students;

public class Student {

    String firstName;
    String lastName;
    double averageMark;

    public Student(String firstName, String lastName, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageMark = averageMark;
    }

    public int getScholarship(){
        if (this.averageMark == 5.0){
            return 100;
        }
        else return 80;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
