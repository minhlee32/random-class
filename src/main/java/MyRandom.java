import java.util.Random;

public class MyRandom {
    Random random = new Random(1000);

    private int randomNumbers() {
        return random.nextInt(100);
    }

    public void printRandomNumbers() {
        for (int i = 0; i < 50; i++) {

            System.out.println(randomNumbers() + "\t");
        }
    }
}
