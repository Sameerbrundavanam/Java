class Calculator{
    public void add(int num1, int num2, int num3){
        System.out.println("I can calculate the sum of the given three numbers: "+ (num1+num2+num3));
    }
}



class ScientificCalculator extends Calculator{
    @Override
    public void add(int num1,int num2, int num3){
        System.out.println("Even I can calculate the sum of Three numbers as well Sameer: "+ (num1+num2+num3));
    }
}



public class Method_Overriding {
    public static void main(String[] args) {
        ScientificCalculator calci = new ScientificCalculator();
        calci.add(3,6,9);
    }
}
