package creationalDesignPatterns.prototype;

public class Projects implements VersionControlCommands {
    private final long id;
    private final String name;

    public Projects(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object copy() {
        return new Projects(id, name);
    }

    @Override
    public String toString() {
        return "Projects{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
