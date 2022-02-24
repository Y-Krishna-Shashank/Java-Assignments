  
import java.io.File;
import java.util.Scanner;
import java.util.regex.*;
public class Assignment1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter the file name you want to search (w/o extension) :");
            String fileToSearch=scan.nextLine();
            searchFile(fileToSearch);
            System.out.println("Enter any number to continue searching of files  or 0 to exit:");
            num=scan.nextInt();
            scan.nextLine();
        }while(num!=0);
    }

    public static void searchFile(String fileToSearch) {
       
        File homeDirectory=new File(".");
    
        File[] files=homeDirectory.listFiles();
      
        String pattern=fileToSearch+".txt";
        if(files!=null) {
            for (File file : files) {
            
                if (Pattern.matches(pattern, file.getName())) {
                    System.out.println("File Found!");
                    System.out.println("Its absolute path :" + file.getAbsolutePath());
                    return;
                }
            }
        }
        System.out.println("Pattern not matched or file not found!");
    }
