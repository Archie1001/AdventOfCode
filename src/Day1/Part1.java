package Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class Part1 {

    public static void countDepthIncrease() {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        int depthIncrease = 0;

        while (scanner.hasNextInt()) {

            numbers.add(scanner.nextInt());
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) < numbers.get(i + 1)) {

                depthIncrease++;
            }
        }

        System.out.println(depthIncrease);
    }


    public static void main(String[] args) {

        countDepthIncrease();

    }
}
