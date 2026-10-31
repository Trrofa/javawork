
package homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter integers (0 to stop):");

        while (true) {
            number = input.nextInt();

            if (number == 0) {
                break;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        input.close();
    }
}
