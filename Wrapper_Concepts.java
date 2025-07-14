public class Wrapper_Concepts {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        int value = 10;

        //Explicit Boxing
        Integer vals = new Integer(value);

        //Implicit Boxing aka Auto Boxing
        Integer iValue = value;

        System.out.println(vals);
        System.out.println(iValue);

        //Explicit Unboxing
        int uValue = vals.intValue();
        System.out.println("The explictly unboxed value is: " + uValue);

        int uvalue = iValue;
        System.out.println("The auto unboxed value is: " + uvalue);
    }
}
