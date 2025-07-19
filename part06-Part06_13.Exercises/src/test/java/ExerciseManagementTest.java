import org.junit.Test;
import static org.junit.Assert.*;
 
public class ExerciseManagementTest {
    ExerciseManagement management = new ExerciseManagement();

    @Test
    public void addingExerciseWithString() {   
        management.add(new Exercise("Write tests"));

        boolean found = false;
        for (Exercise exercise : management.getExercises()) {
            if (exercise.getDescription().equals("Write tests")) {
                found = true;
                break;
            }
        }

        assertTrue(found);
    }

    @Test
    public void addingExerciseWithExercise() {
        Exercise exerciseExample = new Exercise("Write tests");
        management.add(exerciseExample);

        boolean found = false;
        for (Exercise exercise : management.getExercises()) {
            if (exercise.getDescription().equals("Write tests")) {
                found = true;
                break;
            }
        }

        assertTrue(found);
    }

    @Test
    public void exerciseNotCompletedByDefault() {
        management.add("Write tests");
        assertFalse(management.isCompleted("Write tests"));
    }

    @Test
    public void markingExerciseAsCompleted() {
        management.add("Write tests");
        management.markAsCompleted("Write tests");
        assertTrue(management.isCompleted("Write tests"));
    }
}
