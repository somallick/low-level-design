package src.design.pattern.structural.composite.example1;

/*
* Imagine you are building a project management system where tasks can be either simple tasks or
* a collection of tasks (subtasks) forming a larger task.
*/

// Client
public class TaskManagementApp {
    public static void main(String[] args) {
        // Creating simple tasks
        Task simpleTask1 = new SimpleTask("Complete Coding");
        Task simpleTask2 = new SimpleTask("Write Documentation");

        // Creating a task list
        TaskList projectTasks = new TaskList("Project Tasks");
        projectTasks.addTask(simpleTask1);
        projectTasks.addTask(simpleTask2);

        // Nested task list
        TaskList phase1Tasks = new TaskList("Phase 1 Tasks");
        phase1Tasks.addTask(new SimpleTask("Design"));
        phase1Tasks.addTask(new SimpleTask("Implementation"));

        projectTasks.addTask(phase1Tasks);

        // Displaying tasks
        projectTasks.display();
    }
}

/*
* Represents the application that uses the Composite Design Pattern to manage tasks.
* It creates a mix of simple tasks and task lists,
* showcasing how the Composite pattern allows treating both individual tasks and task collections uniformly.
* The created tasks are displayed in a hierarchical structure to illustrate the pattern’s flexibility
* and uniform handling of different task types.
*/

