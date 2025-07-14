
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
}


public class Downcasting {
    public static void main(String[] args) {
        double dvalue = 514d;
        int ivalue = (int) dvalue;
        System.out.println(dvalue + " " + ivalue);

        Laptop macbook = new Computer();
        macbook.whoAmI();
    }
}
