
/*An abstract class is a blueprint for other classes that cannot be instantiated on its own */


//Abstract class
abstract class A{
    //acts like a contract but has no code.
    abstract public void show();
}


//Concrete class
class B extends A{
    @Override
    public void show(){
        System.out.println("This is the overriden method using an abstract class");
    }
}


public class Abstract_Class {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
