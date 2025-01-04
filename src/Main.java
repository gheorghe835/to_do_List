import todoList.ToDoListManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ToDoListManager manager = new ToDoListManager();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("      To Do List ");
            System.out.println("  1.  Add task.");
            System.out.println("  2.  Delete task.");
            System.out.println("  3.  Show task.");
            System.out.println("  4.  Mark a task as completed(0 - yes, 1 - no");
            System.out.println("  5.  EXIT.");
            //scanner.nextLine();
            System.out.println("  Choose an option:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("  Enter the task description::");
                    String description = scanner.nextLine();
                    manager.addTask(description);
                    break;

                case 2:
                    System.out.println("  Enter the task index to delete::");
                    int deleteIndex = scanner.nextInt();
                    scanner.nextLine();
                    manager.deleteTask(deleteIndex);
                    break;

                case 3:
                    manager.showTasks();
                    break;

                case 4:
                    System.out.println("  Enter the index of the task to mark as completed:");
                    int completeIndex = scanner.nextInt();
                    //scanner.nextLine();
                    manager.markTaskAsCompleted(completeIndex);
                    break;

                case 5:
                    System.out.println("  EXIT.");
                    return;

                default:
                    System.out.println("  Invalid option. Try again.");
            }
        }
    }
}