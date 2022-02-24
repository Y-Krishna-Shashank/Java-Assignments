public class OuterClass {
    int outerInstanceVariable=10;
    public class InnerClass{
        int innerInstanceVariable=20;
        public void print(){
            System.out.println("Inner class of outer class");
        }
    }
}
