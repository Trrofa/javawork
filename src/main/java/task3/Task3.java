package task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args)
            throws FileNotFoundException {

        Scanner input = new Scanner(new File("duomenys.txt"));

        int n = input.nextInt();
        int negativeCount = 0;

        for (int i = 0; i < n; i++) {
            int temperature = input.nextInt();

            if (temperature < 0) {
                negativeCount++;
            }
        }

        input.close();

        if (negativeCount == 0) {
            System.out.println("No negative temperatures recorded");
        } else {
            System.out.println(negativeCount);
        }
    }
}
