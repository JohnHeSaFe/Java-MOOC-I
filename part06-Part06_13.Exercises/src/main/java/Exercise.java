public class Exercise {
    private String description;
    boolean isCompleted;

    public Exercise(String description) {
        this.description = description;
        isCompleted = false;
    }

    public void markAsCompleted() {
        isCompleted = true;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }
}
