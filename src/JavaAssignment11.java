import java.io.*;
import java.util.*;
public class JavaAssignment11 {
    public static void main(String[] fileName) {
        String file=fileName[0];
        HashMap<Character,Integer> hashMap=new HashMap<>();
        try {
            PrintWriter printWriter = new PrintWriter(new File(file));

            for(int i=0;i<file.length();i++)
            {
                hashMap.put(file.charAt(i),hashMap.getOrDefault(file.charAt(i),0)+1);
            }
            printWriter.println("Character  Occurrence");
                for(Character key: hashMap.keySet())
                {
                    printWriter.println("\t"+key+"  \t\t\t"+hashMap.get(key));
                }
                printWriter.close();
        }
        catch (Exception ex)
        {
            System.out.println("Error processing file");
            System.out.println(ex.getMessage());
        }
    }
}
