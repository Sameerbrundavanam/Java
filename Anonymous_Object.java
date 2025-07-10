
class AO{
    public void method(){
        System.out.println("This method is called using Anonymous object");
    }
}



public class Anonymous_Object {
    public static void main(String[] args) {
        // Normal object creation
        AO obj;
        obj = new AO();
        obj.method();

        //Anonymous object creation
        //Can only be used once
        //Here we do not create any refernece variable nor assign
        //the object to any reference
        new AO().method();
    }
}
