package Unit7;

import java.util.ArrayList;

public class School {
    //Declaration
    private ArrayList<Student> students; //null for now
    public static final String SCHOOL_NAME = "QSI";

    //Initialize attributes to prevent null pointer exception
    public School() {
        students = new ArrayList<>();//0 students
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String toString() {
        return "School has " + students.size() + " students." + "\n" + students;
    }

    public int searchById(int id) {
        for(int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if(student.getID() == id) {
                System.out.println(student.getName());
                return i;
            }
        }
        return -1;
    }

    public int binarySearchByID(int id) {
        int left = 0;
        int right = students.size() - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            Student student = students.get(mid);
            if(student.getID() == id) {
                return mid;
            } else if(student.getID() < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        School school = new School();
        school.addStudent(new Student(1, "John")); //0
        school.addStudent(new Student(2, "Mary")); //1
        school.addStudent(new Student(3, "Jacky")); //2
        school.addStudent(new Student(4, "Sianturi")); //3
        school.addStudent(new Student(5, "Stuart Brown")); //4
        school.addStudent(new Student(6, "John Hamill")); //5

//        System.out.println(school);
//        System.out.println(school.searchById(2));
//        System.out.println(school.searchById(100));

        System.out.println(school.binarySearchByID(4));
    }
}
