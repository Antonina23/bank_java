package finaltask6Test;

import finaltask6.TaskStatus;
import finaltask6.TaskPriority;
import finaltask6.Task;
import finaltask6.TaskService;

public class TaskServiceTest {
    public static void main(String[] args) {
            TaskService<Integer> taskService = new TaskService<>();

            Task<Integer> task1 = new Task<>(1, "Go to the shop", TaskStatus.NEW, TaskPriority.HIGH);
            Task<Integer> task2 = new Task<>(2, "Working", TaskStatus.IN_PROGRESS, TaskPriority.MEDIUM);
            Task<Integer> task3 = new Task<>(3, "Dancing", TaskStatus.COMPLETED, TaskPriority.LOW);

            taskService.addTask(task1);
            taskService.addTask(task2);
            taskService.addTask(task3);

            System.out.println("All tasks:");
            taskService.getTasksSortedByDate().forEach(System.out::println);

            System.out.println("\nTasks in progress:");
            taskService.getTasksByStatus(TaskStatus.IN_PROGRESS).forEach(System.out::println);

            System.out.println("\nHigh priority tasks:");
            taskService.getTasksByPriority(TaskPriority.HIGH).forEach(System.out::println);

            taskService.removeTask(3);
            System.out.println("\nAfter removing task 3:");
            taskService.getTasksSortedByDate().forEach(System.out::println);
        }
    }