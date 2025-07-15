
abstract class MainClass{
    void show(){
        System.out.println("This is a normal method");
    }
}


public class Absract_Anonymous_Inner_Class {
    public static void main(String[] args) {
        MainClass obj = new MainClass(){
            @Override
            void show(){
                System.out.println("This is the example usage of an Abstract Anonymous Inner Class");
            }
        };
        obj.show();
    }
}
