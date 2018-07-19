public class Application {
    public static void main(String[] args) {
        System.out.println("Run this application to print out 50 random numbers from 0 to 100");
        MyRandom random = new MyRandom();

        random.printRandomNumbers();
    }

}
