
package homework;

public class Task1 {
    public static void main(String[] args) {

        int p = 800;
        int s = 250;
        int m = 75;
        int k = 0;

        while (s < p) {
            s += m;
            k++;
        }

        System.out.println("k = " + k);
    }
}
