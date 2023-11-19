package ua.bakhmeteva.hw8.students;

public class Aspirant extends Student{
    public Aspirant(String firstName, String lastName, double averageMark) {
        super(firstName, lastName, averageMark);
    }

    @Override
    public int getScholarship(){
        if (this.averageMark == 5.0){
            return 200;
        }
        else return 180;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
