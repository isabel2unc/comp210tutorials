import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        // MM/DD/YY, HH:MM, Name, UnitPrice, Quantity, Time2, AsmCost
        // 6/8/22 19:32 laptop 41.73 593 384.5 1607

        // read the line above
        String date = s.next();
        String time1 = s.next();
        String category = s.next(); // or we can do s.nextLine() since laptop is the next string
        double fee = s.nextDouble();
        int quantity = s.nextInt();
        double time2 = s.nextDouble();
        double asmCost = s.nextDouble();

        // print the line above
        System.out.println(date); // Output: 6/8/22
        System.out.println(time1); // Output: 19:32
        System.out.println(category);  // Output: laptop
        System.out.println(fee); // Output: 41.73
        System.out.println(quantity); // Output: 593
        System.out.println(time2); // Output: 384.5
        System.out.println(asmCost); // Output: 1607

        //close the scanner
        s.close();
    }
}
