public class Assignment6_3 {

String str;
    Assignment6_3(String var) {

        this.str=var;
        System.out.println("String is "+this.str);
    }


    public static void main(String[] args) {
        Assignment6_3[] arr = new Assignment6_3[10];

        for(int i=0;i<10;i++)
        {
            arr[i] = new Assignment6_3("Hello world!");
        }

    }
}
