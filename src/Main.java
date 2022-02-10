import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var stopwatch = new Stop_Watch();
        int choice;
        do {
        System.out.println("1. Start");
        System.out.println("2. Stop");
        System.out.println("3. Get Elapsed Time");
        System.out.println("4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    stopwatch.start();
                    break;
                case 2:
                    stopwatch.stop();
                    break;
                case 3:
                    System.out.println("Time Elapsed: " + stopwatch.getElapsedTime());
                    break;
            }
        } while (choice !=4);
    }
}
