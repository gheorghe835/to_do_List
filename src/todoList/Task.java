package todoList;

// Individual class from the task list.
public class Task {
    private String description;
    private boolean completed;

    //constructor
    public Task(String description, boolean completed) {
        this.description = description;
        this.completed = completed;
    }

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    //Geter

    public String getDescription() {
        return description;
    }

    //Method to set your pregnancy status
    public void setCompleted(boolean completed){
        this.completed = completed;
    }

    //Method to check if the task is completed
    public boolean isCompleted() {
        return completed;
    }


}
