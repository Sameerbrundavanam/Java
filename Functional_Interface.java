
/*
 * Functional Interface aka SAM (Single Abstract Method interface)
 * in java is a type of interface where there wll be only one
 * abstract method present and can have any number of default methods
 * (the one's that are other than an abstract method)
 * 
 * 
 * 
 * 
 * 
 */

@FunctionalInterface
interface inf{
    void meth();
}

class ImpClass implements inf{
    public void meth(){
        System.out.println("This is an example of functional interface in java");
    }
}


public class Functional_Interface{
    public static void main(String[] args) {
        {
            ImpClass imp = new ImpClass();
            imp.meth();
        }
    }
}