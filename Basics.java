public class Basics {
    public static void main(String[] args) {
        int a=1;
        final int myNum = 15;
        //myNum = 20;  // will generate an error: cannot assign a value to a final variable
        int num = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        //float is only 6-7 decimal digits, while double variables have a precision of about 16 digits.

        String name = "John";
        System.out.println("Hello" + name);

        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        System.out.println("The sum is " + x + y);   // Prints: The sum is 56
        System.out.println("The sum is " + (x + y)); // Prints: The sum is 11

        int Num = 5;       // myNum is an int
// myNum = "Hello";  // Error: cannot assign a String to an int
        String Text = "Hi"; // myText is a String
// myText = 123;      // Error: cannot assign a number to a String

        char myVar1 = 65;
        System.out.println(myVar1);

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);    // Outputs 9
        System.out.println(myDouble); // Outputs 9.0
        //Widening Casting (automatic) - converting a smaller type to a larger type size
        //byte -> short -> char -> int -> long -> float -> double

        double Double = 9.78d;
        int Int = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble); // Outputs 9.78
        System.out.println(myInt);    // Outputs 9
        //Narrowing Casting (manual) - converting a larger type to a smaller type size
        //double -> float -> long -> int -> char -> short -> byte

        x = 10;
        y = 3;

        System.out.println(x + y); // 13
        System.out.println(x - y); // 7
        System.out.println(x * y); // 30
        System.out.println(x / y); // 3
        System.out.println(x % y); // 1

        int z = 5;
        ++z;
        System.out.println(z); // 6
        --z;
        System.out.println(z); // 5

        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn));

        /*
        Operator Precedence in Java (highest to lowest):
        ()           - Parentheses
        *, /, %      - Multiplication, Division, Modulus
        +, -         - Addition, Subtraction
        >, <, >=, <= - Relational operators
        ==, !=       - Equality operators
        &&           - Logical AND
        ||           - Logical OR
        =            - Assignment
        */

        String greeting = "Hello World";
        System.out.println(greeting);
        // Find length of the string
        System.out.println("Length: " + greeting.length());
        // Convert string to uppercase
        System.out.println(greeting.toUpperCase());
        // Convert string to lowercase
        System.out.println(greeting.toLowerCase());
        // Find index of a word in the string
        System.out.println(greeting.indexOf("World"));
        // Access character at specific position
        System.out.println(greeting.charAt(0)); // H

        // Comparing strings using equals()
        String txt1 = "Hello";
        String txt2 = "Hello";
        // Check if strings are equal
        System.out.println(txt1.equals(txt2)); // true
        // Removing whitespace using trim()
        String txt = "   Hello World   ";
        // Print string before trimming
        System.out.println("Before: [" + txt + "]");
        // Print string after trimming
        System.out.println("After:  [" + txt.trim() + "]");
        // Concatenate strings using concat()
        System.out.println(firstName.concat(lastName));

        String aaa = "Java ";
        String b = "is ";
        String c = "fun!";
        String result = aaa.concat(b).concat(c);
        System.out.println(result);

        // Find maximum value
        System.out.println(Math.max(5, 10)); // 10
        // Find minimum value
        System.out.println(Math.min(5, 10)); // 5
        // Square root of a number
        System.out.println(Math.sqrt(64)); // 8.0
        // Absolute (positive) value
        System.out.println(Math.abs(-4.7)); // 4.7
        // Power: x raised to y
        System.out.println(Math.pow(2, 8)); // 256.0
        // Rounding numbers
        System.out.println(Math.round(4.6)); // 5
        System.out.println(Math.ceil(4.1));  // 5.0
        System.out.println(Math.floor(4.9)); // 4.0
        // Random number between 0.0 and 1.0
        System.out.println(Math.random());
        // Random integer between 0 and 100
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);

    }
}