package Beginning;

import java.util.*; //could also do import java.util.Arrays;

public class Beginning_complete {

    //FIELDS

    // Recall: (access modifier) ((if necessary) static) (data type) name = value;
    public static int a = 3;
    public static Integer A = 3;

    //METHODS (or "functions")

    public static void main(String[] args) {

        //Primitive data types vs Objects

        System.out.println("The value of a is " + a);
        System.out.println("The value of A is " + A);

        System.out.println("However: " + "a.equals(4) is an ERROR, but A.equals(4) is " + A.equals(3) + ".");
        System.out.println(); //line break

        //Basic arrays

        double[] nums = new double[5];

        nums[0] = 3;
        nums[1] = 5.0;
        //nums[2] = 1.8E+308; //throws an error
        nums[3] = 11;
        nums[4] = -15800;
        //nums[5] = 2.0; //throws an error

        int[] days = {24, 7, 365};
        int len_days = days.length; //.length is NOT a method, but a property (i.e. no "()" afterward)

        System.out.println(nums); //prints location - not helpful
        System.out.println(Arrays.toString(days)); //Referencing the Array object, so I can use the toString method
        System.out.println(len_days);

        System.out.println();

        anotherMethod(); //no "." operator required because it is static
    }

    private static void anotherMethod(){
        //Helpful constants

        long longest = Long.MAX_VALUE;
        short shortest  = Short.MIN_VALUE;

        System.out.println("The biggest possible value for a long variable is: " + longest);
        System.out.println("The smallest possible value for a short variable is: " + shortest);
        System.out.println();

        //Putting 0x before a value tells Java it's a hexadecimal
        int hex_num = 0xABCDEF;
        System.out.println("The decimal value of 0xABCDEF is " + hex_num);
    }

}
