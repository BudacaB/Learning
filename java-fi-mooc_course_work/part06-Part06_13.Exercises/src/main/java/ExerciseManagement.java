
import java.util.ArrayList;


public class ExerciseManagement {
    
    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        this.exercises.forEach((ex) -> {
            list.add(ex.getName());
        });
        
        return list;
    }
    
    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String exercise) {
        this.exercises.stream().filter((ex) -> (ex.getName().equals(exercise))).forEachOrdered((ex) -> {
            ex.setCompleted(true);
        });
    }

    public boolean isCompleted(String exercise) {
        for (Exercise ex : this.exercises) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompleted();
            }
        }
        
        return false;
    }

}
