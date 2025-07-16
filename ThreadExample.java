class A extends Thread{
    @SuppressWarnings("CallToPrintStackTrace")
    public synchronized void run(){
        for(int i=0;i<20;i++){
            System.out.println("Hello");
            try {
                sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




class B extends Thread {
    public synchronized void run() {
        for(int i=0;i<20;i++){
            System.out.println("This is Sam");
            try {
                sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




public class ThreadExample{
    public static void main(String[] args){
        Thread a = new A();
        Thread b = new B();
        a.start();
        try{
            Thread.sleep(1);
        } catch(IllegalThreadStateException ie){
            System.out.println("The exception is :...." + ie);
        } catch(InterruptedException ie){
            System.out.println("The exception is :..." + ie);;
        }
        b.start();
    }
}
