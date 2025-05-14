package finish_first;

public class User {
    private String name;
    public int age;
    public boolean active;

    public User(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "User{" + "name:'" + name + '\'' + ", age:" + age + ", active:" + active + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return age == user.age &&
                active == user.active &&
                (name == null ? user.name == null : name.equals(user.name));
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (active ? 1 : 0);
        return result;
    }
}
