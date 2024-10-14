package javaprogramme;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class QuestionFour {
    //Declared two instance and two static variables
    String firstname = "Payal";
    String lastname = "Patel";
    static int x = 20;
    static int y = 10;

    public static void main(String[] args) {
        //Call both instance and static methods into the Main method

        // call instance method
        QuestionFour questionFour = new QuestionFour(); //create object to call instance method
        System.out.println("Below is printed from instance method");
        questionFour.print();


        // call static method
        System.out.println("Below  is printed from static method");
        staticPrint();
    }

    //Declared one instance method
    public void print() {
        System.out.println("My full name is : " + firstname + " " + lastname);
        System.out.println("Division of two numbers :  " + x + " and " + y + " is " + (x / y));
    }

    //Declare one static method
    public static void staticPrint() {
        QuestionFour obj = new QuestionFour();
        System.out.println("My full name is : " + obj.firstname + " " + obj.lastname);
        System.out.println("Division of two numbers :  " + x + " and " + y + " is " + (x / y));
    }

}
