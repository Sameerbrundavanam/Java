/*
 * There are mainly three types of errors in Java:
 *    1. Compile-time errors 
 *    2. Run-time errors (aka Exceptions)
 *    3. Logical errors
 *
 * ➤ Exceptions occur during runtime and can interrupt the normal flow of execution.
 *    Handling exceptions is crucial to prevent program crashes and maintain flow.
 *
 * Java provides 5 key keywords for exception handling:
 *    - try     → Wraps the code that might throw an exception.
 *    - catch   → Catches and handles the exception thrown in the try block.
 *    - throw   → Used to manually throw an exception.
 *    - throws  → Declares exceptions a method might throw.
 *    - finally → Always runs, whether or not an exception occurs.
 */





import java.util.Scanner;

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}


class CA{
    private int numerator, denominator;
    Scanner read = new Scanner(System.in);
    public void get(){
        numerator = read.nextInt();
        denominator = read.nextInt();
    }
    public void compute(){
        try {
            System.out.println(numerator/denominator);
        } 
        catch(ArithmeticException Ae){
            System.out.println("The Exception occured is: " + Ae);
        }
        finally{
            System.out.println("The Program is successfully executed");
        }
    }

    public void printElement(int [] arr, int n){
        int size = arr.length;
        try {
            if(size < n){
                throw new MyException("You're Fucked up!!!");
            }
        } 
        catch (MyException e) {
            System.out.println(e);
        }
    }
}

public class Exceptions {
    public static void main(String[] args){
        CA obj = new CA();
        System.out.println(obj.getClass());
        obj.get();
        obj.compute();
        obj.printElement(new int[]{1,2,3,4,5}, 20);
    }
}
