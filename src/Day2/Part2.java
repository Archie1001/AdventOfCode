package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part2 {

    public static void diveWithAim() throws FileNotFoundException {

        int horizontal = 0;
        int depth = 0;
        int aim = 0;


        String position;

        File file = new File("C:\\Users\\mupet\\IdeaProjects\\AdventOfCode\\src\\Day2\\day1.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {

            position = scanner.next();
            int units = scanner.nextInt();

            if (position.equals("up")) {

                aim = aim - units;
            } else if (position.equals("down")) {

                aim = aim + units;
            } else {

                horizontal = horizontal + units;
                depth = depth + (aim * units);
            }
        }

        System.out.println(horizontal * depth);
    }

    public static void main(String[] args) throws FileNotFoundException {

        diveWithAim();
    }
}
