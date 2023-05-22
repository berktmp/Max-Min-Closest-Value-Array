import java.util.Arrays;
import java.util.Scanner;

// Finding Maximum and Minimum Values in an Array
public class Main {
    public static void main(String[] args) {

        // Find the smallest and largest elements in the array that are close to the entered number
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println(Arrays.toString(list));
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();

        int min = list[0];
        int max = list[0];

        for (int element : list) {
            if (element < min) {
                min = element; // Found the minimum value of the array
            }
            if (element > max) {
                max = element; // Found the maximum value of the array
            }
        }

        for (int element : list) {
            if (element > num) {
                // Are the elements of the array greater than the entered number?
                if (element <= max) {
                    max = element; // Compared the element values with the maximum
                }
            }

            if (element < num) {
                // Are the elements of the array less than the entered number?
                if (element >= min) {
                    min = element; // Compared the element values with the minimum
                }
            }
        }

        System.out.println("Closest value to the entered number that is smaller: " + min);
        System.out.println("Closest value to the entered number that is larger: " + max);

    }
}
