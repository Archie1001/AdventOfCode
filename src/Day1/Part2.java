package Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class Part2 {

    public static void threeMeasurementWindow() {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        int count = 0;

        while (scanner.hasNextInt()) {

            numbers.add(scanner.nextInt());
        }

        for (int i = 0; i < numbers.size() - 3; i++) {

            int firstWindow = numbers.get(i) + numbers.get(i + 1) + numbers.get(i + 2);
            int secondWindow = numbers.get(i + 1) + numbers.get(i + 2) + numbers.get(i + 3);

            if (secondWindow > firstWindow) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {

        threeMeasurementWindow();
    }
}