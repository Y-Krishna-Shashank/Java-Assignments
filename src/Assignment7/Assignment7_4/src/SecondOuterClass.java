public class SecondOuterClass {
    public class SecondInnerClass extends OuterClass.InnerClass
    {
        public SecondInnerClass(){
            new OuterClass().super();
        }
    }
}
