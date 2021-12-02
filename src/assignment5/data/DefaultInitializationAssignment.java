package krishnashashank.assignment.data;

public class DefaultInitializationAssignment {
    int int_var;
    char char_var;

   public DefaultInitializationAssignment() {
    }

    public void printInstanceVariables() {
        System.out.println("instance variables: " + this.int_var + " " + this.char_var);
    }

    public void printLocalVariables() {
        int var1 ;
        int var2 ;
       // System.out.println("Local variables: " + var1 + " " + var2);
       
       //we cannot print access local variables before defining them
    }
}
