public class Operators {
    public static void main(String[] args) {
        // Arithmetic operations

        // Division (/)
        int g = 18;
        int h = 4;
        int quotient = g / h;
        System.out.println("g / h = " + quotient);  // Output: g / h = 4

        // Modulus (%)
        int i = 18;
        int j = 4;
        int remainder = i % j;
        System.out.println("i % j = " + remainder);  // Output: i % j = 2

        // Pre-increment (++x)
        int k = 9;
        int preIncrement = ++k;
        System.out.println("++k = " + preIncrement);  // Output: ++k = 10
        System.out.println("k = " + k);               // Output: k = 10

        // Post-increment (x++)
        int l = 12;
        int postIncrement = l++;
        System.out.println("l++ = " + postIncrement);  // Output: l++ = 12
        System.out.println("After increment: " + l);   // Output: After increment: 13

        // Pre-decrement (--x)
        int m = 5;
        int preDecrement = --m;
        System.out.println("--m = " + preDecrement);  // Output: --m = 4

        // Post-decrement (x--)
        int n = 15;
        int postDecrement = n--;
        System.out.println("n-- = " + postDecrement);  // Output: n-- = 15
        System.out.println("After decrement: " + n);   // Output: After decrement: 14

    }
}
