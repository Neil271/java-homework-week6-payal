package javaprogramme;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class QuestionThree {
    // Declared one instance and one static variable
    String name = "Payal";
    static String lastname = "Patel";

    public static void main(String[] args) {
        //Call both instance and static methods into the Main method
        //Call instance method
        QuestionThree questionThree = new QuestionThree(); //create object to call instance method
        System.out.println("Below line is printed from instance method ");
        questionThree.print();

        //Call static method
        System.out.println("Below line is printed from static method ");
        staticPrint();

    }

    //Declared one instance method
    public void print() {
        System.out.println("My name is " +name+ " " +lastname);
    }

    //Declare one static method
    public static void staticPrint() {
        QuestionThree obj = new QuestionThree(); // create object to call instance variable into static method
        System.out.println("My name is " +obj.name+ " " +lastname);
    }
}
