import java.util.Locale;

public class Formatting {
    public static void main(String[] args) {

        // Using String.format(String format, Object... args)
        String name = "Alice";
        int age = 30;
        double salary = 12345.678;

        // The format string can contain format specifiers like %s for strings, %d for integers, and %.2f for floating-point numbers.
        String formattedString = String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary);
        System.out.println(formattedString);  // Output: Name: Alice, Age: 30, Salary: 12345.68

        // Using String.format(Locale loc, String format, Object... args)
        // Allowing specifying a locale to format the output according to locale-specific rules (e.g., different decimal separators)
        Locale locale = Locale.FRANCE;
        String formattedStringWithLocale = String.format(locale, "Nom: %s, Âge: %d, Salaire: %.2f", name, age, salary);
        System.out.println(formattedStringWithLocale);  // Output: Nom: Alice, Âge: 30, Salaire: 12345,68

        // Additional examples of format specifiers
        int integer = 123;
        double floatingPoint = 456.789;

        // Integer formatting
        // %05d: 0 indicates padding with zeros, 5 indicates width (minimum number of characters to be written)
        String intFormat = String.format("Integer with leading zeros: %05d", integer);
        System.out.println(intFormat);  // Output: Integer with leading zeros: 00123

        // Floating-point formatting
        // %.3f: 3 indicates precision (number of decimal places)
        String floatFormat = String.format("Floating point number with 3 decimal places: %.3f", floatingPoint);
        System.out.println(floatFormat);  // Output: Floating point number with 3 decimal places: 456.789

        // Date formatting
        // %tD: Date in mm/dd/yy format (e.g., 09/13/24)
        String dateFormat = String.format("Date: %tD", new java.util.Date());
        System.out.println(dateFormat);  // Output: Date: 09/13/24 (output will vary based on current date)
    }
}
