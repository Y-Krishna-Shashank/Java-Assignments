public class ConstructorOverloading {
    int a,b;

    ConstructorOverloading(int a) {
        this(a,a*5);

        this.a = a;

    }

    ConstructorOverloading(int a, int b) {
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading(5);
        System.out.println("Instance variables: a: " + obj.a + " b: " + obj.b);
    }
}
