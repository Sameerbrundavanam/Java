public class Static {
    static {
        System.out.println("Man, This is a static block");
    }
    static int value = 514;
    static public void method(){
        System.out.println("This is a Static Method with value: " + value);
    }
}
