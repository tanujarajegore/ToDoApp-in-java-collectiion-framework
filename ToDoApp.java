import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String description;
    boolean completed;

    Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String toString() {
        return description + " - " +
                (completed ? "Completed" : "Pending");
    }
}

class TodoApp {

    ArrayList<Task> tasks = new ArrayList<>();

    
    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
        System.out.println("Task Added Successfully");
    }

    
    public void viewTasks() {
        if(tasks.isEmpty()) {
            System.out.println("No tasks available");
        }
        else {
            System.out.println("Task List:");
            for(int i = 0; i < tasks.size(); i++) {
                System.out.println((i+1) + ". " + tasks.get(i));
            }
        }
    }

    
    public void completeTask(int index) {
        if(index >= 0 && index < tasks.size()) {
            tasks.get(index).completed = true;
            System.out.println("Task Completed");
        }
        else {
            System.out.println("Invalid Task Number");
        }
    }

    
    public void deleteTask(int index) {
        if(index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task Deleted");
        }
        else {
            System.out.println("Invalid Task Number");
        }
    }


    public static void main(String[] args) {

        TodoApp app = new TodoApp();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("===== ToDoApp =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Enter Task:");
                    String task = sc.nextLine();
                    app.addTask(task);
                    break;

                case 2:
                    app.viewTasks();
                    break;

                case 3:
                    System.out.print("Enter task number: ");
                    int c = sc.nextInt();
                    app.completeTask(c-1);
                    break;

                case 4:
                    System.out.print("Enter task number: ");
                    int d = sc.nextInt();
                    app.deleteTask(d-1);
                    break;

                case 5:
                    System.out.println("Exit:");
                    break;

                default:
                    System.out.println("Wrong choice:");
            }

        } while(choice != 5);

        sc.close();
    }
}
