package todoList;

import java.util.ArrayList;

// Class that manages operations on the task list.
public class ToDoListManager {
    private ArrayList<Task> tasks;

    //constructor
    public ToDoListManager(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public ToDoListManager() {
        this.tasks = new ArrayList<>();
    }

    // The method to add a new task
    public void addTask(String description){
        tasks.add(new Task(description));
        System.out.println("  The task has been added: " + description);
    }

    //Method to delete a task based on the index
    public void deleteTask(int index){
        if (index >= 0 & index < tasks.size()){
            Task deleteTask = tasks.remove(index);
            System.out.println("  Tha task eliminated: " + deleteTask.getDescription());
        }
        else {
            System.out.println("  Index invalid.");
        }
    }

    //The method to mark a task as completed
    public void markTaskAsCompleted(int index){
        if(index >= 0 & index < tasks.size()){
            tasks.get(index).setCompleted(true);
            System.out.println("  The task was completed:" + tasks.get(index).getDescription());
        }
        else {
            System.out.println("  Index invalid.");
        }
    }

    //The method to show all tasks
    public void showTasks(){
        if (tasks.isEmpty()){
            System.out.println("  The to-do list is empty.");
        }
        else {
            System.out.println("  To Do List::");
            for (int i = 0; i < tasks.size(); i++){
                Task task = tasks.get(i);
                System.out.println(i + ". " + task.getDescription() + " [" +
                        (task.isCompleted() ? "  Completed" : "  Not completed") + "]");
            }
        }
    }
}
