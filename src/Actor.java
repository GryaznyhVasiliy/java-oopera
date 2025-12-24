import java.util.Objects;

public class Actor extends Person {
    private final Double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name=" + name + ", " +
                "surname=" + surname + ", " +
                "(height=" + height + ")" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Double.compare(height, actor.height) == 0 &&
                Objects.equals(name, actor.getName()) &&
                Objects.equals(surname, actor.getSurname());
    }

    @Override
    public int hashCode() {
        int hash = 13;
        if (name != null) {
            hash = name.hashCode();
        }
        if (surname != null) {
            hash = hash + surname.hashCode();
        }
        if (height != null) {
            hash = hash + height.hashCode();
        }
        return hash;
    }
}
