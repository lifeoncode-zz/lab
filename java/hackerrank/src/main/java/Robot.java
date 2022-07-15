public class Robot {
    private final String name;

    public Robot(String name) {
        this.name = name;
    }

    public void launch() {
        System.out.printf("%s launched\n",getName());
    }

    String getName() {
        return name;
    }
}
