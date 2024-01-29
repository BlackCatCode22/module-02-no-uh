import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args){
    int a, b, c;                                                //Establishing integers

    Scanner numbers = new Scanner(System.in);                   //Creates a new scanner object
    System.out.println("Enter a number:");
    a = numbers.nextInt();                                      //Reads the user input

    System.out.println("Enter another number:");
    b = numbers.nextInt();

    System.out.println("Enter one more number:");
    c = numbers.nextInt();

    //The next block of code uses logical and (&&) to determine if both statements are true
    //If 'a' is greater than or equal to 'b' and 'c' it prints 'a' as the largest number
    //The same goes for 'b' or 'c' being the largest
    //The nested if statement would result in a larger block of code, so it's easier to use logical operators

    if(a>=b && a>=c)
        System.out.println(a + " is the largest number");
    else if (b>=a && b>=c)
        System.out.println(b + " is the largest number");
    else
        System.out.println(c + " is the largest number");
    }


    }