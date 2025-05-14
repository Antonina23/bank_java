package finish_first;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class EntityManager<T> {
    private final CopyOnWriteArrayList<T> entities;

    public EntityManager() {
        this.entities = new CopyOnWriteArrayList<>();
    }

    public synchronized void add(T entity) {entities.add(entity);}

    public synchronized boolean remove(T entity) {return entities.remove(entity);}

    public List<T> getAll() {return new ArrayList<>(entities);}

    public List<User> filterByAge(int minAge, int maxAge) {
        List<User> result = new ArrayList<>();
        for(T entity : entities) {
            if (entity instanceof User) {
                User user = (User) entity;
                if(user.getAge() >= minAge && user.getAge() <= maxAge) {
                    result.add(user);
                }
            }
        }
        return result;
    }

    public List<User> filterByName(String name) {
        List<User> result = new ArrayList<>();
        for(T entity : entities) {
            if (entity instanceof User) {
                User user = (User) entity;
                if(user.getName().equalsIgnoreCase(name)) {
                    result.add(user);
                }
            }
        }
        return result;
    }

    public List<User> filterByActivity(boolean active) {
        List<User> result = new ArrayList<>();
        for(T entity : entities) {
            if (entity instanceof User) {
                User user = (User) entity;
                if(user.isActive() == active) {
                    result.add(user);
                }
            }
        }
        return result;
    }
}
