class Animal{
    public void makeSound(){
        System.out.println("I'm an Animal and i make sound");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("I bark!!!");
    }

    @Override
    public void makeSound() {
        System.out.println("I'm a dog an i too am an Animal");
    }
    
}

public class Upcasting {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.makeSound();

        int value = 100;
        double dValue = (double)value;
        System.out.println(dValue);
        
    }
}
