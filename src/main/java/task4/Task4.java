
package task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args)
            throws FileNotFoundException {

        Scanner input = new Scanner(new File("duomenys.txt"));

        int n = input.nextInt();
        int previous = input.nextInt();
        int count = 0;

        for (int i = 1; i < n; i++) {
            int current = input.nextInt();

            if (current < previous) {
                count++;
            }

            previous = current;
        }

        input.close();

        System.out.println(count);
    }
}
