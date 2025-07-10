public class Encapsulation{
    
    private int secretValue;

    private int anotherSecret;

    public void setValuefroVariable(int valueToBeSet){
        secretValue = valueToBeSet;
    }

    public void getValueOfVariable(Encapsulation obj){
        System.out.println("The secret value is:..."+ obj.secretValue);
    }

    public void getAnotherSecret(Encapsulation obj){
        System.out.println("Another secret value is:..." + obj.anotherSecret);
    }

    //Default constructor
    public Encapsulation(){

    }

    //Parameterised Container
    public Encapsulation(int anotherSecret){
        this.anotherSecret = anotherSecret;
    }

    //Version of copy constructor
    public Encapsulation(Encapsulation ec){
        this.secretValue = ec.secretValue;
        this.anotherSecret = ec.anotherSecret;
    }
}