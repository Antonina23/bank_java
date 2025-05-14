package finish_firstTest;

import finish_first.EntityManager;
import finish_first.User;

public class EntityManagerTest {
    public static void main(String[] args) {
        EntityManager<User> userManager = new EntityManager<>();

        userManager.add(new User("Jone", 25, true));
        userManager.add(new User("Jane", 30, true));
        userManager.add(new User("Nick", 20, true));
        userManager.add(new User("Madonna", 40, false));

        System.out.println("All users:");
        userManager.getAll().forEach(System.out::println);

        System.out.println("\nAll users in age from 25 to 35 years old:");
        userManager.filterByAge(25, 35).forEach(System.out::println);

        System.out.println("\nUser with name Jane:");
        userManager.filterByName("Jane").forEach(System.out::println);

        System.out.println("\nAll active users:");
        userManager.filterByActivity(true).forEach(System.out::println);

        User userToRemove = new User("Jone", 25, true);
        boolean removed = userManager.remove(userToRemove);
        System.out.println("\nUser has been deleted: " + removed);

        System.out.println("\nAll users:");
        userManager.getAll().forEach(System.out::println);

    }
}
