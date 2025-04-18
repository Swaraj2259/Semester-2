import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String taskName;
    boolean isCompleted;

    Task(String taskName) {
        this.taskName = taskName;
        this.isCompleted = false;
    }

    void markCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[✔] " : "[ ] ") + taskName;
    }
}

public class ToDoListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n📌 To-Do List 📌");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    tasks.add(new Task(taskName));
                    System.out.println("✅ Task added!");
                    break;
                
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("📭 No tasks available!");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                
                case 3:
                    System.out.print("Enter task number to mark as completed: ");
                    int completeIndex = scanner.nextInt();
                    if (completeIndex > 0 && completeIndex <= tasks.size()) {
                        tasks.get(completeIndex - 1).markCompleted();
                        System.out.println("✔ Task marked as completed!");
                    } else {
                        System.out.println("❌ Invalid task number!");
                    }
                    break;

                case 4:
                    System.out.print("Enter task number to remove: ");
                    int removeIndex = scanner.nextInt();
                    if (removeIndex > 0 && removeIndex <= tasks.size()) {
                        tasks.remove(removeIndex - 1);
                        System.out.println("🗑 Task removed!");
                    } else {
                        System.out.println("❌ Invalid task number!");
                    }
                    break;

                case 5:
                    System.out.println("👋 Exiting To-Do List. Have a great day!");
                    // scanner.close();
                    return;

                default:
                    System.out.println("❌ Invalid option! Try again.");
            }
        }
    }
}