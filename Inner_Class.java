
import java.util.Scanner;

//Outer Class
class OuterClass{
    private int secret;

    public OuterClass(int secret) {
        this.secret = secret;
    }
    
    public void show(){
        System.out.println("This is the show method of the outer class");
        InnerClass inc = new InnerClass();
        inc.show();
    }
    //Non-Static Inner Class
    /*It has access to all members (fields and methods) of its outer class instance,
    even the private ones. This creates a very strong and encapsulated relationship.*/
    class InnerClass{
        public void show(){
            System.out.println("This is the show method of the inner class");
            System.out.println("The value of the secret is: " + secret);
        }
    }
}

public class Inner_Class{
    public static void main(String[] args) {
        // OuterClass obj = new OuterClass(514);
        // obj.show();

        // //Initiation of the InnerClass
        // OuterClass.InnerClass ob = obj.new InnerClass();
        // ob.show();

        OutClass out = new OutClass();
    }
}



class OutClass{
    Scanner read = new Scanner(System.in);
    private int variable = read.nextInt();
    public OutClass(){
        InClass.call();
    }
    static class InClass{
        static void call(){
            Scanner read = new Scanner(System.in);
            String secretKey = (read.next());
            System.out.println("The secret key is: " + secretKey);
        }
    }
}