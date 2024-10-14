package javaprogramme;

/**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class QuestionOne {
    // Declared instance variables
    int a = 10;
    int b = 20;


    // Declared main method
    public static void main(String[] args) {
        // create object to call the instance method into the static method
        QuestionOne questionOne = new QuestionOne();
        questionOne.addition();
    }

    // Declared instance method
    public void addition() {
        // call the instance variables into the instance method inside the print statement
        System.out.println("Addition of two numbers " + a + " and " + b + " is " + (a + b));
    }
}
