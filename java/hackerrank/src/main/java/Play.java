public class Play {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            Robot robot = new Robot(String.format("%s",i));
            robot.launch();
        }
    }
}

