//-------------💡 Solving problems - part6 💡 -----------------------

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Let's create a scanner to receive data from user
        Scanner scannerObject = new Scanner(System.in);
        // Let's create a Array list to store the tasks
        ArrayList<Todo> taskList = new ArrayList<Todo>();
        // Let's create our menu for this application
        // we use while loop to stay in app till user wants
        while (true) {
            System.out.println("Task tracker menu:");
            System.out.println("1.Add task");
            System.out.println("2.Mark task as completed");
            System.out.println("3.View tasks");
            System.out.println("4.Exit");
            // let's receive the input choice from the user
            System.out.println("Enter you choice: ");
            int choice = scannerObject.nextInt();
            scannerObject.nextLine();
            // Create a switch to switch between menu options
            switch (choice) {
                case 1 -> {
                    //Add task
                    System.out.println("Enter the task description: ");
                    String taskDescription = scannerObject.nextLine();
                    Todo newTask = new Todo(taskDescription);
                    taskList.add(newTask);
                    System.out.println("🔥The task added successfully!🔥");
                }
                case 2 -> {
                    //Mark the task as completed
                    System.out.println("Enter the task|Todo index: ");
                    int taskIndex = scannerObject.nextInt();
                    if (taskIndex >= 0 && taskIndex < taskList.size()){
                        taskList.get(taskIndex).markAsCompleted();
                        System.out.println("✅The task is marked as completed ✅");
                    }else {
                        System.out.println("🛑The index is not valid 🛑");
                    }
                }
                case 3 -> {
                    // View the tasks
                    System.out.println("Task List: ");
                    for (int i = 0; i< taskList.size(); i++){
                        Todo task = taskList.get(i);
                        System.out.println(i + ". " + task.getDescription() + "- completed: " + task.isCompleted());
                    }
                }
                case 4 -> {
                    // Exit
                    System.out.println("Exit from the application");
                    scannerObject.close();
                    System.exit(0);
                }
                default -> {
                    System.out.println("Your choice is not valid double check the menu options");
                }
            }
        }
    }
}




