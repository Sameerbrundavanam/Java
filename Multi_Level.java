
class A{
    public void methodOfA(){
        System.out.println("This method belongs to A");
    }
}

class B extends A{
    public void methodOfB(){
        System.out.println("This method belongs to B");
    }
}

class C extends B{
    public void methodOfC(){
        System.out.println("This method belongs to C");
    }
}


public class Multi_Level {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodOfA();
        obj.methodOfB();
        obj.methodOfC();
    }
}
