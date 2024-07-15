package DSA.Easy;
import java.util.*;


public class Test {
    //Write a Program where take three int input a,b and c. You have to output the average of these three numbers.
    public static void averageOfThreeNo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a: ");
        int a = sc.nextInt();
        System.out.print("Type b: ");
        int b = sc.nextInt();
        System.out.print("Type c: ");
        int c = sc.nextInt();
        int average = (a+b+c)/3;
        System.out.println(average);
    }

    //In a program, input the side of a square. You have to output the are of the square
    public static void areaOfSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type side of a square: ");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("area of square is: " + area);

    }

    //Enter the cost of 3 items from the user (using float data type) a pencil, an eraser. You ahve to 
    //output the total cost of the item back to the user as their bill.

    public static void bill(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the pencil price: ");
        float pencil = sc.nextFloat();
        System.out.print("Type the pen price: ");
        float pen = sc.nextFloat();
        System.out.print("Type the eraser price: ");
        float eraser = sc.nextFloat();
        float total = pen + pencil + eraser;
        System.out.println("Total : " + total);

    }



    public static void main(String arg[]){
        // Scanner sc = new Scanner (System.in);
        // System.out.print("type here: ");
        // String test = sc.nextLine();
        // System.out.println(test);
        // System.out.println("Hello World!");
        //averageOfThreeNo();
        //areaOfSquare();
        bill();
        
        
    }
}
