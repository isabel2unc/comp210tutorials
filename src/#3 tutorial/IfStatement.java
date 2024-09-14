public class IfStatement {
    public static void main(String[] args) {

        // Example of if statement
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult.");  // Output: You are an adult.
        }

        // Example of if-else statement
        int temperature = 30;
        if (temperature > 35) {
            System.out.println("It's too hot outside.");
        } else {
            System.out.println("The weather is nice.");  // Output: The weather is nice.
        }

        // Example of if-else if-else statement
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");  // Output: Grade: B
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        // Example of switch statement
        int dayOfWeek = 3; // The switch expression is evaluated once
        switch (dayOfWeek) { // The value of the expression is compared with the values of each case
            case 1:
                System.out.println("Monday");
                break; // The break statement is used to terminate the switch statement, or it will continue to the next case
            case 2:
                System.out.println("Tuesday");
                break;
            case 3: // If there is a match, the associated block of code is executed.
                System.out.println("Wednesday");  // Output: Wednesday
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day"); // If there is no match, the default block is executed.
        }
    }
}
