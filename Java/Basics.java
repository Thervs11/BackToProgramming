import java.util.Scanner;

public class Basics {
    public static void main(String [] args) {
        //input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println("The word you've enter: " + word);
        scanner.close();

        // Variables & Data types
        String name = "Thervs"; 
        int age = 20;
        double weight = 69.5;
        boolean handsome = true;

        System.out.println("Name: " + name + "\nAge: " + age);
        System.out.print("\nWeight: " + weight + "kg\n");
        System.out.println("Handsome: " + handsome);


        //arithmetic + - * / %  ++ --
        int x = 60, y = 7, z = x + y;
        System.out.println("\n\tSum of x + y = " + z);

        //Assignment operators += -= *= /= %= same as x + (x[other assignmet ops]) = num
        //logial operators = && || !


        //all about if...else statement & switch
        int expression = 0;
        if (expression == 20) {
            //declare the output for this condition
        } else if (expression != 20) {
            //declare the output for this condition
        } else {
            //if all the condition has not been met declare this output
        }

        switch(expression) {
            case 1: //declare something if the expression is equal to 1.
                break;
            case 2: //declare something if the expression is equal to 2.
                break;
            default: //declare something if all the cases has not been met.
                break;
        } 


        //All about loops 
        for (int i = 0; i < 5; i++) {
            //loop the content
        }

        while (expression != 0) {
            //loop the content 
        }
        do {
            //loop the content first before the condition
        } while (expression != 0);
            // you can use either break; continue; depending on what you might need.

        //All about array
        int size = 3;
        String[] swimIMStrokes = {"Fly","Back","Breast","Free",};
        System.out.println(swimIMStrokes);
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr.length);


        //method call
        myMethod("Thervin","Ranehart");
        myMethod("Thervin","Ranehart",20);
     
    }
    //all about methods
    public static void myMethod(String param1, String param2) {
        System.out.println("Content of Parameter 1: " + param1);
        System.out.println("Content of Parameter 2: " + param2);
    }
    public static void myMethod(String param1, String param2, int param3) {} //method overloading
}
