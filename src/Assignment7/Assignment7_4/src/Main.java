public class Main {
    public static void main(String[] args) {
        SecondOuterClass outerObject=new SecondOuterClass();
        SecondOuterClass.SecondInnerClass innerObject=outerObject.new SecondInnerClass();
        System.out.println(innerObject.innerInstanceVariable);
        innerObject.print();
    }
}
