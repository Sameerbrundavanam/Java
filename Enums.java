/* 
 * Enum (short for "enumeration") is a custom data type in Java 
 * used to define a fixed set of named constants. 
 * Each constant in an enum is implicitly public, static, and final, 
 * meaning they are constant values that don’t change and belong to the enum type itself.
 */

 enum BugStates{
    New("The bug is detected","Is is assigned to none"),
    Assigned("The Bug is assigned to someone for resolving","Sameer's team is currently working on it"),
    Open,
    Resolving,
    Issue,
    Redirect,
    Reject,
    Done;
    String description = "", assignedTo="";
    private BugStates(){

    }
    private BugStates(String description,String assignedTo){
        this.description = description;
        this.assignedTo = assignedTo;
    }

    public String showDetails(){
        return this.description + "\n" + this.assignedTo;
    }

     @Override
     public String toString(){
        return "You're Hacked mf!!!!";
     }
}


public class Enums{
    public static void main(String[] args) {
        System.out.println(BugStates.New);
        System.out.println(BugStates.Assigned.showDetails());
        
        // returns the current index of the constant in the enum
        System.out.println(BugStates.Redirect.ordinal());

        BugStates[] arr = BugStates.values();
        for(BugStates state:arr){
            System.out.println(state);
        }

        System.out.println(BugStates.Assigned.name());
        
    }
}