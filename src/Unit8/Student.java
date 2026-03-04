package Unit8;

public class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }


}

class SeatingChart {
    private Student[][] students;

    public SeatingChart(int row, int col) {
        students = new Student[row][col];
    }

    public Student bestGpa() {
        Student student = students[0][0];
        for(Student[] row : students) {
            for(Student s : row) {
                if(s.getGpa() > student.getGpa()) {
                    student = s;
                }
            }
        }
        return student;
    }
}
