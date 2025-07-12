// class A{
//     int value;
//     public A(int value){
//         this.value = value;
//     }
// }

// class B extends A{

//     int number;
//     public B(int value, int number){
//         super(value);
//         this.number = number;
//     }

//     public void show(){
//         System.out.println("Value is : " + value + " "+ "Number is: "+ this.number);
//     }
// }

// public class Inheritance{
//         public static void main(String[] args) {
//             B obj = new B(100,1000);
//             obj.show();
//         }
// }



class A{
    public A(){
        System.out.println("This is the default constructor of A");
    }

    public A(int someValue){
        System.out.println("This is the parameterised constructor of A" + " " + someValue);
    }
}


class B extends A{
    
    public B(){
        this(514);
        System.out.println("This is the defalut constructor of B");
    }

    public B(int someValue){
        
        //By default it is also having super() methos itslef as of all the constructors in Java
        
        super(someValue);

        System.out.println("This is the parameterised constructor of B" + " " + someValue);
    }
}

public class Inheritance{
    public static void main(String[] args) {
        B obj = new B();
        obj.hashCode();
    }
}