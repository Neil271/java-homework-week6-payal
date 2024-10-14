package javaprogramme;

/**
 * Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class QuestionTwo {
    // Declared static variables
    static int x = 20;
    static int y = 40;

    // Declared main method
    public static void main(String[] args) {
        // call static method into the main method
        multiplication();
    }

    // Declared static method
    public static void multiplication() {
        // call static variables into the static method
        System.out.println("Multiplication of two numbers " + x + " and " + y + " is " + (x * y));
    }

}
