package Task4;

public class hoursLeftDemo {
    public static void main(String[] args) {
        int random = (int) (Math.random() * (28800 - 0 + 1) + 0);
        System.out.println(random);

        if (random < 3600) {
            System.out.println("Less than an hour left.");
        } else if (random < 7200) {
            System.out.println("1 hour left.");
        } else {
            int hours = random / 3600;
            System.out.println(hours + " hours left.");
        }

    }
}
