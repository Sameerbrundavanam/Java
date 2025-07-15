class OutsideClass{
    public void print(){
        System.out.println("This is the outer class");
    }
}

public class Anonymous_Inner_Class {
    public static void main(String[] args) {
        OutsideClass out = new OutsideClass(){
            @Override
            public void print(){
                System.out.println("This is the overrided method through the Anonymous Inner Class");
            }
        };
    }
}
