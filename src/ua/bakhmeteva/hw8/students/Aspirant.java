package ua.bakhmeteva.hw8.students;

public class Aspirant extends Student{

    String scienceWork;
    public Aspirant(String firstName, String lastName, double averageMark) {
        super(firstName, lastName, averageMark);
    }

    public Aspirant(String firstName, String lastName, double averageMark, String scienceWork) {
        super(firstName, lastName, averageMark);
        this.scienceWork = scienceWork;
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
                ", scienceWork='" + scienceWork + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
