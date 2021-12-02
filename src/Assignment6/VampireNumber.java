import java.util.ArrayList;

public class VampireNumber {
    static ArrayList<String> permutationList1=new ArrayList<String>();
    static ArrayList<String> permutationList2=new ArrayList<String>();

    static int count=0;
    public static void main(String[] args) {
    long number = Long.MAX_VALUE;

    for(long i=1260;i<number;i++)
    {
        String num_str=String.valueOf(i);
        int length=num_str.length();
        if(length%2==0)
        {
            splitAndCheck(num_str);
        }
    }

//        splitAndCheck("1260");

    }


    public static void splitAndCheck(String num_str) {
        String actualNum = num_str;
        int half = num_str.length() / 2;
        String first = num_str.substring(0, half);
        String second = num_str.substring(half);
        permute(first, "", true);
        permute(second, "", false);
        //count logic here
        for (int k = 0; k < permutationList1.size(); k++) {
            String first_half = permutationList1.get(k);
            for (int i = 0; i < permutationList2.size(); i++) {


                String second_half = permutationList2.get(i);

                if (first_half.charAt(0) == '0' || second_half.charAt(0) == '0') {
                    continue;
                } else if (first_half.charAt(first_half.length() - 1) == '0' && second_half.charAt(second_half.length() - 1) == '0') {
                    continue;
                } else {
                    long number = Long.parseLong(actualNum);
                    long fang1 = Long.parseLong(first_half);
                    long fang2 = Long.parseLong(second_half);
                    long result = fang1 * fang2;
                    if (number == result) {
                        System.out.println(fang1 + "  " + fang2);
                        count++;
                        if(count==1000)
                            System.exit(1);
                    }
                }

            }

        }
        permutationList1.clear();
        permutationList2.clear();

    }

    public static void permute(String str, String ans,boolean flag) {

        if (str.length() == 0) {
            if(flag)
            permutationList1.add(ans);
            else
                permutationList2.add(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String remainingPart=str.substring(0,i)+str.substring(i+1);

            permute(remainingPart, ans + ch,flag);
        }
    }


}
