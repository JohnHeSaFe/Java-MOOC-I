public class User {
    private String identifier;
    private String name;

    public User(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }

    public boolean equals(Object compared) {
        if (!(compared instanceof User)) {
            return false;
        }

        User userCompared = (User) compared;
        if (this.identifier.equals(userCompared.identifier)) {
            return true;
        }

        return false;
    }
}
