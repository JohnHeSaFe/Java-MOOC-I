import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public void add(String description) {
        if (findExercise(description) != null) {
            System.out.println("Exercise already exists");
            return;
        }
        this.exercises.add(new Exercise(description));
    }

    public void add(Exercise exercise) {
        this.exercises.add(exercise);
    }

    public ArrayList<Exercise> getExercises() {
        return new ArrayList<>(this.exercises);
    }

    public boolean isCompleted(String description) {
        Exercise exercise = findExercise(description);
        if (exercise == null) {
            System.out.println("Exercise not found!");
            return false;
        }
        return exercise.isCompleted();
    }

    public void markAsCompleted(String description) {
        Exercise exercise = findExercise(description);
        if (exercise == null) {
            System.out.println("Exercise not found!");
            return;
        }
        exercise.markAsCompleted();
    }

    private Exercise findExercise(String description) {
        for (Exercise exercise: exercises) {
            if (exercise.getDescription().equals(description)) {
                return exercise;
            }
        }
        return null;
    }
}

