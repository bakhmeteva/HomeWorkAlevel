package ua.bakhmeteva.hw8.students;

public class StudentDemo {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Garry", "Potter", 4.5),
                new Student("Hermione", "Greindger", 5),
                new Aspirant("Cedrick", "Digory", 5),
                new Aspirant("Fred", "Wisley", 3)
        };

        for (Student s: students ) {
            System.out.println(s + " стипендия = " + s.getScholarship());
        }
    }
}
