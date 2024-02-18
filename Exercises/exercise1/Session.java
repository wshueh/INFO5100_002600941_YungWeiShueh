import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Session {

    private List<Student> students;

    public Session() {
        this.students = new ArrayList<>(20); // initialize capacity
    }


    //hold 20 students in a Session, some are part time, some are full time
    public boolean addStudent(Student student) {
        if (students.size() < 20) {
            students.add(student);
            return true;
        } else {
            return false; 
        }
    }


    //Create public methods to calculate average quiz scores per student for the whole class
    public double calculateAverageQuizScores() {
        
        double totalScores = 0;
        int count = 0;

        for (Student student : students) {
            List<Double> scores = student.getQuizzesScores();

            for (double score : scores) {
                totalScores += score;
                count++;
            }
        }

        if (count == 0) {
            return 0.0;
        } else {
            return totalScores / count;
        }
    }


    //Create public method to print the list of quiz scores in ascending order for one session
    public void printQuizScoresInAscendingOrder() {
        List<Double> allScores = new ArrayList<>();
        for (Student student : students) {
            allScores.addAll(student.getQuizzesScores());
        }
        Collections.sort(allScores);
        System.out.println("Quiz Scores in Ascending Order: " + allScores);
    }


    //Create public method to print names of part time students
    public void printNamesOfPartTimeStudents() {
        System.out.println("Part Time Students:");
        for (Student student : students) {
            if (student instanceof PartTime) {
                System.out.println(student.getName());
            }
        }
    }


    //Create public method to print "exam scores" of full-time students
    public void printExamScoresOfFullTimeStudents() {
        System.out.println("Exam Scores of Full Time Students:");

        for (Student student : students) {
            if (student instanceof FullTime) {
                FullTime fullTimeStudent = (FullTime) student;
                System.out.println("- Name: " + fullTimeStudent.getName() + ", Exam 1: " + fullTimeStudent.getExamScore1() + ", Exam 2: " + fullTimeStudent.getExamScore2());
            }
        }
    }



}
