public class Fruit {
    private final String name;

    public String getName() {
        return name;
    }

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
