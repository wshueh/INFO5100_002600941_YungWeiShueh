import java.util.ArrayList;
import java.util.List;

public abstract class Student {

    private String name;
    private List<Double> quizzesScores; // suitable data structure for holding up 15 quiz scores


    public Student(String name){
        this.name = name;
        this.quizzesScores = new ArrayList<>(15); // initial capacity 
    }


    public String getName() {
        return name;
    }

    public void addQuizzesScores(double score) {
        if (quizzesScores.size() < 15) {
            quizzesScores.add(score);
        }
    }

    public List<Double> getQuizzesScores() {
        return new ArrayList<>(quizzesScores);
    }

    public abstract String getType();

}
