/*
 * Introduced in Java8
 * They are intended to reduce the verbosity
 * They can only be used with the functional interfaces
 * They can simplify the Anonymous inner class implementation
 * They are often referred to provide syntactical sugar
 * 
 */



@FunctionalInterface
interface FI{
    //void addFun(int a,int b);
    int addFun(int a, int b);
}


public class Lambda_Expressions{
    public static void main(String[] args) {
        //FI obj = (a,b) -> System.out.println("The summed up value is: " + (a+b));
       FI obj = (a,b) -> a+b;
       System.out.println(obj.addFun(3, 6));
    }
}