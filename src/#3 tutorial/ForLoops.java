public class ForLoops {
    public static void main(String[] args) {

        // Example of a for loop that prints numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {  // i is initialized to 1; loop runs while i <= 5; i increments by 1 after each iteration
            System.out.println("i = " + i);  // Output: i = 1, i = 2, i = 3, i = 4, i = 5
        }

        // Example of a for loop that prints elements of an array
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (int j = 0; j < fruits.length; j++) {  // j is initialized to 0; loop runs while j is less than the length of the array
            System.out.println("Fruit: " + fruits[j]);  // Output: Fruit: Apple, Fruit: Banana, Fruit: Cherry
        }

        // Example of using a for loop to calculate the sum of the first 5 numbers
        int sum = 0;
        for (int k = 1; k <= 5; k++) {
            sum += k;  // Adds k to sum in each iteration
        }
        System.out.println("Sum of numbers 1 to 5 = " + sum);  // Output: Sum of numbers 1 to 5 = 15
    }
}
