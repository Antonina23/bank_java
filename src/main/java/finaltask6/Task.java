package finaltask6;

import java.time.LocalDateTime;

public class Task<T> {
    private T id;
    private String description;
    private TaskStatus status;
    private TaskPriority priority;
    private LocalDateTime date;

    public Task(T id, String description, TaskStatus status, TaskPriority priority) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.date = LocalDateTime.now();
    }

    public T getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id = " + id +
                ", description = '" + description + '\'' +
                ", status = " + status +
                ", priority = " + priority +
                ", date = " + date +
                '}';
    }
}
