class A{
    void show(){
        System.out.println("This is the show method of the parent class");
    }
}


class B extends A{
    @Override
    void show(){
        System.out.println("This is the show method of the child class");
    }
}




public class Dynamic_Method_Dispatch{
    public static void main(String[] args) {
        A obj =  (A) new B();
        obj.show();
    }
}