package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Part2 {

    public static void lifeSupportGeneration() {

        ArrayList<String> oxygen = new ArrayList<>();
        ArrayList<String> co2 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String number = scanner.next();

            oxygen.add(number);
            co2.add(number);
        }



        int col = 0;
        while (oxygen.size() > 1) {

            int ones = 0;
            int zeroes = 0;

            for (String s : oxygen) {
                if (s.charAt(col) == '0') {

                    zeroes++;
                } else {

                    ones++;
                }
            }

            char max = (ones >= zeroes ? '1' : '0');

            for (int row = oxygen.size() - 1; row >= 0; row--) {
                if (oxygen.get(row).charAt(col) != max) {
                    oxygen.remove(row);
                }
            }

            col++;
        }

        col = 0;

        while (co2.size() > 1) {

            int ones = 0;
            int zeroes = 0;

            for (String s : co2) {
                if (s.charAt(col) == '0') {

                    zeroes++;
                } else {

                    ones++;
                }
            }
            char min = (zeroes <= ones ? '0' : '1');
            for (int row = co2.size() - 1; row >= 0; row--) {
                if (co2.get(row).charAt(col) != min){

                    co2.remove(row);
                }
            }

            col++;
        }

        System.out.println(Integer.parseInt(oxygen.get(0), 2) * Integer.parseInt(co2.get(0), 2));
    }


    public static void main(String[] args) {

        lifeSupportGeneration();
    }
}
