

/* Whenever we have an abstract class with no concrete methods
 * to implement, with all the abstract methods then we switch
 * that class to an interface in whic hwe can simply give the 
 * return type, the name along with the signature of the 
 * method as all the methods in an interface are abstract 
 * public by default.
 */

/* 
abstract class FirstClass{
    abstract public void functionOfA();
}
*/

interface FirstClass{
    void functionOfFirstClass();
}


class SecondClass implements  FirstClass{
    @Override
    public void functionOfFirstClass(){
        System.out.println("This is the overrided method of A");
    }
}


public class Interface_Example {
    public static void main(String[] args) {
        SecondClass obj = new SecondClass();
        obj.functionOfFirstClass();
    }
}
