
class Computer{
    public void whoAmI(){
        System.out.println("I'm the father of all, the computer");
    }
}



class Laptop extends Computer{
    @Override
    public void whoAmI(){
        System.out.println("I'm a type of computer, they call me laptop");
    }

    public void whatIDo(){
        System.out.println("I can i do anything, except make you productive");
    }
}


public class Downcasting {
    public static void main(String[] args) {
        double dvalue = 514d;
        int ivalue = (int) dvalue;
        System.out.println(dvalue + " " + ivalue);

        /*This is an example of upcasting, where a reference of a parent type (Computer) 
        points to an object of a child type (Laptop). This is always safe 
        and happens implicitly because a Laptop is-a Computer.*/
        
        /*At this point, even though the object is a Laptop, the Lenovo reference can 
        only be used to call methods that are defined in the Computer class. */

        Computer Lenovo = new Laptop();
        Lenovo.whoAmI();

        /*Here, we are downcasting. We are explicitly casting the parent Computer reference back down to a more specific child Laptop reference. 
        We are essentially telling the compiler, 'Trust me, I know that this object, which you see as a Computer, is actually a Laptop.' */
        Laptop macbook = (Laptop) Lenovo;
        macbook.whoAmI();
        macbook.whatIDo();

        /*Downcasting is potentially unsafe. If you try to downcast an object to a type 
        that it is not an instance of, the JVM will throw a ClassCastException at runtime. For example, this would fail: */
        Computer supComp = new Computer();
        if(supComp instanceof Laptop macbookPro){
            macbookPro.whatIDo();
        }
        else{
            System.out.println("Sorry bruhh !!!! ");
        }
    }
}
