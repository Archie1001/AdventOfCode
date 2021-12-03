package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Part1 {

    public static void binaryDiagnostic() {

        ArrayList<String> inputNumbers = new ArrayList<>();
        ArrayList<Character> tempArray = new ArrayList<>();

        StringBuilder gammaRate = new StringBuilder();
        StringBuilder epsilonRate = new StringBuilder();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            inputNumbers.add(scanner.next());
        }


        for (int i = 0; i < inputNumbers.get(0).length(); i++) {
            for (String number : inputNumbers) {

                tempArray.add(number.charAt(i));
            }

            int zeros = (int) tempArray.stream().filter(ch -> ch == '0').count();
            int ones = (int) tempArray.stream().filter(ch -> ch == '1').count();

            if (zeros > ones){

                gammaRate.append("0");
                epsilonRate.append("1");
            } else {

                gammaRate.append("1");
                epsilonRate.append("0");
            }

            tempArray.clear();
        }

        System.out.println("Binary gamma rate: " + gammaRate);
        System.out.println("Binary epsilon rate: " + epsilonRate);
        System.out.println("Decimal gamma rate: " + Integer.parseInt(String.valueOf(gammaRate), 2));
        System.out.println("Decimal epsilon rate: " + Integer.parseInt(String.valueOf(epsilonRate), 2));
        System.out.println("Power consumption: " + (Integer.parseInt(String.valueOf(gammaRate), 2) * Integer.parseInt(String.valueOf(epsilonRate), 2)));
    }

    public static void main(String[] args) {

        binaryDiagnostic();
    }
}
