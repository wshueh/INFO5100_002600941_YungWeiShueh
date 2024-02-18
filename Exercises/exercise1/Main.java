public class Main {
    
    public static void main(String[] args){

        //Create an instance of Session
        Session session = new Session();

        //populate it with 20 students and dummy scores
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                FullTime fullTime = new FullTime("Full Time Student " + i, 70+i, 80+i);  // For Dummy "exam scores"
                for (int score = 80; score < 100; score += 1) {  // For Dummy "quiz scores"
                    fullTime.addQuizzesScores(score);
                }
                session.addStudent(fullTime);
            } else {
                PartTime partTime = new PartTime("Part Time Student " + i);
                for (int score = 50; score < 70; score += 1) {  // Dummy "quiz scores"
                    partTime.addQuizzesScores(score);
                }
                session.addStudent(partTime);
            }
        }

        // Call public methods of Session
        System.out.println("\n--- Average Quiz Scores: " + session.calculateAverageQuizScores()+ "---");
        System.out.println("\n--- Quiz Scores in Ascending Order ---");
        session.printQuizScoresInAscendingOrder();
        System.out.println("\n--- Names Of Part Time Students ---");
        session.printNamesOfPartTimeStudents();
        System.out.println("\n--- Exam Scores of Full Time Students ---");
        session.printExamScoresOfFullTimeStudents();


    }
}
