package finaltask6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService<T> {
    private List<Task<T>> tasks;

    public TaskService() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task<T> task) {
        boolean idExists = tasks.stream()
                .anyMatch(t -> t.getId().equals(task.getId()));
        if(idExists) {
            throw new IllegalArgumentException("Task with this ID already exists");
        }

        tasks.add(task);
    }

    public synchronized boolean removeTask(T id) {
        return tasks.removeIf(task -> task.getId().equals(id));
    }

    public Task<T> getTaskById(T id) {
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Task<T>> getTasksByStatus(TaskStatus status) {
        return tasks.stream()
                .filter(task -> task.getStatus() == status)
                .collect(Collectors.toList());
    }

    public List<Task<T>> getTasksByPriority(TaskPriority priority) {
        return tasks.stream()
                .filter(task -> task.getPriority() == priority)
                .collect(Collectors.toList());
    }

    public List<Task<T>> getTasksSortedByDate() {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getDate))
                .collect(Collectors.toList());
    }
}
