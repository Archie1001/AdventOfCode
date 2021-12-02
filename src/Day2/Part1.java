package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part1 {

    public static void Dive() throws FileNotFoundException {

        int horizontal = 0;
        int depth = 0;
        String position;

        File file = new File("C:\\Users\\mupet\\IdeaProjects\\AdventOfCode\\src\\Day2\\day1.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {

            position = scanner.next();
            int units = scanner.nextInt();

            if (position.equals("up")) {

                depth = depth - units;

            } else if (position.equals("down")){

                depth = depth + units;
            } else {

                horizontal = horizontal + units;
            }
        }

        System.out.println(horizontal * depth);
    }


    public static void main(String[] args) throws FileNotFoundException {

        Dive();
    }
}